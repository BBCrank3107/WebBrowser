package application;

import javafx.scene.control.*;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseButton;
import javafx.scene.layout.HBox;
import javafx.scene.layout.Priority;
import javafx.scene.layout.VBox;
import javafx.scene.web.WebEngine;
import javafx.scene.web.WebHistory;
import javafx.scene.web.WebView;

public class BrowserTab {
    private Tab thisTab;
    private TextField urlInput;
    private WebView webView;
    private WebEngine webEngine;
    private Button backBtn, forwardBtn, refreshBtn;
    private Label statusLabel;

    public BrowserTab() {
        // Initialize WebView and WebEngine
        webView = new WebView();
        webEngine = webView.getEngine();
    }

    public Tab initTab() {
        urlInput = new TextField();
        urlInput.setPromptText("Enter URL here...");
        HBox.setHgrow(urlInput, Priority.ALWAYS);

        // Button for Back Navigation
        backBtn = new Button("<");
        backBtn.setOnAction(e -> goBack());

        // Button for Forward Navigation
        forwardBtn = new Button(">");
        forwardBtn.setOnAction(e -> goForward());

        // Button for Refresh
        refreshBtn = new Button("⟳");
        refreshBtn.setOnAction(e -> reloadPage());

        // Button for loading URL
        Button goBtn = new Button("GO");
        goBtn.setOnAction(e -> loadURL(urlInput.getText()));

        // Toolbar with navigation buttons
        ToolBar toolBar = new ToolBar(backBtn, forwardBtn, refreshBtn, urlInput, goBtn);

        // Set the WebView to fill available space
        VBox.setVgrow(webView, Priority.ALWAYS);

        // Status bar to display page loading status
        statusLabel = new Label("Ready");
        HBox statusBar = new HBox(statusLabel);

        // VBox layout
        VBox content = new VBox(toolBar, webView, statusBar);
        VBox.setVgrow(content, Priority.ALWAYS);
        thisTab = new Tab("Tab", content);

        // Load the homepage
        loadURL("http://www.google.com");

        // Update URL field when loading a new page
        webEngine.locationProperty().addListener((observable, oldValue, newValue) -> {
            urlInput.setText(newValue);
        });

        // Update status bar during loading
        webEngine.setOnStatusChanged(e -> {
            statusLabel.setText(e.getData());
        });

        return thisTab;
    }

    private void goBack() {
        WebHistory history = webEngine.getHistory();
        if (history.getCurrentIndex() > 0) {
            history.go(-1);
        }
    }

    private void goForward() {
        WebHistory history = webEngine.getHistory();
        if (history.getCurrentIndex() < history.getEntries().size() - 1) {
            history.go(1);
        }
    }

    private void reloadPage() {
        webEngine.reload();
    }

    public void loadURL(String url) {
        // Check and append http:// if not present
        if (!url.matches(".+://.+")) {
            url = "http://" + url;
        }
        // Load the URL into WebView
        webEngine.load(url);
    }
}