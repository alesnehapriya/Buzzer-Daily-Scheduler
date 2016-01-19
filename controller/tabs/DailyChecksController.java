package controller.tabs;

import java.net.URL;
import java.util.ResourceBundle;

import controller.MyViewController;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.*;

public class DailyChecksController {
	
	MyViewController main;
	
	@FXML public  TextArea DCTextArea1;
	@FXML public  Button DCBtn1;


	@FXML public void dcSaveClicked(ActionEvent DCEvent){
		
		System.out.println("Dialy Checks Called");
		
	}

	public void init(MyViewController myViewController) {
		// TODO Auto-generated method stub
		main = myViewController;
		
	}

}
