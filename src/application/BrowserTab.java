package application;

import javafx.beans.property.Property;
import javafx.concurrent.Worker;
import javafx.scene.control.*;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
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
        webEngine.setJavaScriptEnabled(true);
    }

    public Tab initTab() {
        urlInput = new TextField();
        urlInput.setPromptText("Enter URL here...");
        HBox.setHgrow(urlInput, Priority.ALWAYS);
        
        urlInput.setOnKeyPressed(event -> {
            if (event.getCode().equals(javafx.scene.input.KeyCode.ENTER)) {
                handleEnterKey();
            }
        });

        // Load icons for buttons
        Image backIcon = new Image(getClass().getResourceAsStream("/icons/back.png"));
        Image forwardIcon = new Image(getClass().getResourceAsStream("/icons/forward.png"));
        Image refreshIcon = new Image(getClass().getResourceAsStream("/icons/refresh.png"));
        Image goIcon = new Image(getClass().getResourceAsStream("/icons/search.png"));

        // Button for Back Navigation with icon
        backBtn = new Button();
        backBtn.setGraphic(new ImageView(backIcon));
        backBtn.setOnAction(e -> goBack());

        // Button for Forward Navigation with icon
        forwardBtn = new Button();
        forwardBtn.setGraphic(new ImageView(forwardIcon));
        forwardBtn.setOnAction(e -> goForward());

        // Button for Refresh with icon
        refreshBtn = new Button();
        refreshBtn.setGraphic(new ImageView(refreshIcon));
        refreshBtn.setOnAction(e -> reloadPage());

        // Button for loading URL with icon
        Button goBtn = new Button();
        goBtn.setGraphic(new ImageView(goIcon));
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
        thisTab = new Tab("New Tab", content);

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

        // Update tab title when page title changes
        webEngine.titleProperty().addListener((observable, oldValue, newValue) -> {
            if (newValue == null) {
                thisTab.setText("Loading...");
            } else {
                thisTab.setText(newValue);
            }
        });

        // Update tab for error (e.g., 404 Not Found)
        webEngine.getLoadWorker().stateProperty().addListener((observable, oldState, newState) -> {
            if (newState == Worker.State.SUCCEEDED) {
                statusLabel.setText("Page loaded successfully");
            } else if (newState == Worker.State.FAILED || newState == Worker.State.CANCELLED) {
                statusLabel.setText("Failed to load page");
                String errorMessage = "Error: " + webEngine.getLoadWorker().getException();
                statusLabel.setText(errorMessage);
                webEngine.loadContent("<h1>404 Not Found</h1>");
            }
        });

        return thisTab;
    }
    
    private void handleEnterKey() {
        loadURL(urlInput.getText());
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
        // Ensure the URL starts with "https://" or "http://"
        if (!url.matches("^(http://|https://).+")) {
            url = "http://" + url;
        }
        // Load URL into WebView
        webEngine.load(url);
    }
}
