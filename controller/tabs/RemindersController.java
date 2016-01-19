package controller.tabs;

import java.net.URL;
import java.util.ResourceBundle;

import controller.MyViewController;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.TextArea;

public class RemindersController{
	
	MyViewController main;
	
	@FXML public  TextArea RTextArea1;
	@FXML public  Button RBtn1;
	
	@FXML public void BtnRSaveClicked(ActionEvent DCEvent){
		System.out.println("Reminders Called");
	}

	public void init(MyViewController myViewController) {
		// TODO Auto-generated method stub
		main = myViewController;
		
	}

}
