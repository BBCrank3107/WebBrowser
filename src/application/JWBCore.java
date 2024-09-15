package application;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Tab;
import javafx.scene.control.TabPane;
import javafx.scene.layout.Priority;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;

public class JWBCore extends Application {
	public void start(Stage primaryStage) {
	    primaryStage.setTitle("Java Web Browser");

	    // Tạo TabPane và VBox
	    TabPane tabs = new TabPane();

	    VBox.setVgrow(tabs, Priority.ALWAYS);
	    
	    // Tạo ImageView cho icon add
	    Image addIcon = new Image(getClass().getResourceAsStream("/icons/add.png"));
	    ImageView addImageView = new ImageView(addIcon);

	    // Tạo tab thêm với biểu tượng
	    Tab addTab = new Tab();
	    addTab.setGraphic(addImageView); // Đặt biểu tượng cho tab thêm

	    // Tạo tab trình duyệt đầu tiên
	    BrowserTab tab1 = new BrowserTab();
	    tabs.getTabs().add(tab1.initTab());
	    tabs.getTabs().add(addTab);

	    // Lắng nghe sự thay đổi tab và thêm tab mới khi tab thêm được chọn
	    tabs.getSelectionModel().selectedItemProperty().addListener((ov, fromTab, toTab) -> {
	        if (toTab == addTab) { // Sử dụng đối tượng tab thay vì so sánh văn bản
	            BrowserTab browserTab = new BrowserTab();
	            Tab tab = browserTab.initTab();
	            tabs.getTabs().add(tabs.getTabs().size() - 1, tab);
	            tabs.getSelectionModel().select(tab);
	        }
	    });

	    // Tạo scene và thiết lập primaryStage
	    VBox vBox = new VBox(tabs);
	    Scene scene = new Scene(vBox, 1080, 720);
	    
	    scene.getStylesheets().add(getClass().getResource("application.css").toExternalForm());

	    primaryStage.setScene(scene);
	    primaryStage.show();
	}

    public static void main(String[] args) {
        Application.launch(args);
    }
}
