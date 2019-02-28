package ca.mcgill.ecse223.resto.view;

import javafx.scene.Group;
import javafx.scene.shape.Rectangle;
import javafx.scene.text.Text;

public class TemplateOption extends Group {
	
	private Rectangle containerBox;
	private Text optionText;
	
	public TemplateOption(String optionName) {
		containerBox = new Rectangle();
		optionText = new Text(optionName);
		
		init();
	}
	
	private void init() {
		parentProperty().addListener((event, oldParent, newParent) -> {
			
			if(newParent != null) {
				System.out.println(newParent.getClass().getName());
				//containerBox.widthProperty().bind(newParent.pref)
			}
		});
	}

}
