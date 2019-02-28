package ca.mcgill.ecse223.resto.view;

import javafx.scene.Group;
import javafx.scene.effect.DropShadow;
import javafx.scene.layout.Pane;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;

public class Template extends Group {
	
	private VBox sideMenu;
	private Pane viewPane;
	
	private DropShadow sideMenuShadow;
	
	public Template() {
		sideMenu = new VBox();
		viewPane = new Pane();
		
		sideMenuShadow = new DropShadow();
		
		init();
	}
	
	private void init() {
		sideMenuShadow.setColor(Color.BLACK);
		sideMenu.setEffect(sideMenuShadow);
		
		// Define properties with respect to the containing scene
		sceneProperty().addListener((event, oldScene, newScene) -> {
			if(newScene != null) {
				
				// Bind the width and height of the sideMenu
				// proportionally to the scene size
				sideMenu.prefWidthProperty().bind(newScene.widthProperty().multiply(0.2));
				sideMenu.prefHeightProperty().bind(newScene.heightProperty());
				
				// Bind the width, height and position of the viewPane
				// proportionally to the scene size
				viewPane.layoutXProperty().bind(newScene.widthProperty().multiply(0.2));
				viewPane.prefWidthProperty().bind(newScene.widthProperty().multiply(0.8));
				viewPane.prefHeightProperty().bind(newScene.heightProperty());
			}
		});
		
		// Add the components to the view
		getChildren().addAll(sideMenu, viewPane);
	}

}
