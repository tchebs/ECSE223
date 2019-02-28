package ca.mcgill.ecse223.resto.view;

import javafx.scene.control.Button;
import javafx.scene.layout.Pane;

public class MenuView extends Pane {
	
	public MenuView() {
		init();
	}
	
	private void init() {
		Button clickMe = new Button("Click Me!");
		
		clickMe.setOnMouseClicked((event) -> {
			System.out.println(event.getScreenX());
			this.setVisible(false);
		});
		
		this.getChildren().add(clickMe);
	}

}
