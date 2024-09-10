package application;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Tab;
import javafx.scene.control.TabPane;
import javafx.scene.layout.Priority;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class JWBCore extends Application
{
	public void start(Stage primaryStage)
	{
		primaryStage.setTitle("Java Web Browser");
		primaryStage.show();

		TabPane tabs = new TabPane();
		VBox.setVgrow(tabs, Priority.ALWAYS);

		Tab addTab = new Tab("+");

		BrowserTab tab1 = new BrowserTab();
		tabs.getTabs().add(tab1.initTab());
		tabs.getTabs().add(addTab);

		//TODO: Probably better to make + be a button and not a tab itself
		tabs.getSelectionModel().selectedItemProperty().addListener((ov, fromTab, toTab) ->
				{
					if(toTab.getText().equals("+"))
					{
						BrowserTab browserTab = new BrowserTab();
						Tab tab = browserTab.initTab();
						tabs.getTabs().add(tabs.getTabs().size() - 1, tab);
						tabs.getSelectionModel().select(tab);
					}
				}
		);

		VBox vBox = new VBox(tabs);
		Scene scene = new Scene(vBox, 1080, 720);
		primaryStage.setScene(scene);
	}


	public static void main(String[] args)
	{
		Application.launch(args);
	}
}
