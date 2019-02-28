package ca.mcgill.ecse223.resto.view;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;

public class UI extends Application {
	
	public static void main(String[] args) {
		launch(UI.class);
	}

	@Override
	public void start(Stage stage) throws Exception {
		// TODO Auto-generated method stub
		Pane root = new Pane();
		Scene scene = new Scene(root, 1280, 720);
		
		Template template = new Template();
		root.getChildren().add(template);
		
		/*MenuView menuView = new MenuView();
		Pane tableView = new Pane();
		tableView.getChildren().add(new Button("This is the table view"));
		
		SideMenu sideMenu = new SideMenu(tableView, menuView);
		
		root.getChildren().add(sideMenu);*/
		
		stage.setTitle("RestoApp");
		stage.setScene(scene);
		stage.show();
		
		/*TextField tf = new TextField();
		root.getChildren().add(tf);
		
		Text text = new Text("This is a text");
		text.setX(50);
		text.setY(50);
		root.getChildren().add(text);*/
	}

}
