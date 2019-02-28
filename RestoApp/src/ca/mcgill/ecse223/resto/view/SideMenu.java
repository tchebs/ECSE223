package ca.mcgill.ecse223.resto.view;

import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;

public class SideMenu extends Pane {
	
	private Pane tableView;
	private Pane menuView;
	
	public SideMenu(Pane tableView, Pane menuView) {
		this.tableView = tableView;
		this.menuView = menuView;
		
		tableView.setTranslateX(200);
		menuView.setTranslateX(200);
		
		tableView.setVisible(false);
		menuView.setVisible(false);
		
		init();
	}
	
	private void init() {
		Rectangle tableRect = new Rectangle();
		Rectangle menuRect = new Rectangle();
		
		tableRect.setWidth(200);
		tableRect.setHeight(200);
		tableRect.setFill(Color.BLUE);
		
		menuRect.setWidth(200);
		menuRect.setHeight(200);
		menuRect.setY(200);
		menuRect.setFill(Color.GREEN);
		
		tableRect.setOnMouseClicked((event) -> {
			menuView.setVisible(false);
			tableView.setVisible(true);
		});
		menuRect.setOnMouseClicked((event) -> {
			menuView.setVisible(true);
			tableView.setVisible(false);
		});
		
		this.getChildren().addAll(tableRect, menuRect);
		
		this.sceneProperty().addListener((event, oldValue, newValue) -> {
			Pane root = (Pane) newValue.getRoot();
			root.getChildren().addAll(this.tableView, this.menuView);
		});
	}

}
