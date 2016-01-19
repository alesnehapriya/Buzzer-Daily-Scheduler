package controller.tabs;

import java.net.URL;
import java.util.ResourceBundle;

import controller.MyViewController;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.TextArea;

public class TasksController{
	
	MyViewController main;
	
	@FXML public  TextArea TTextArea1;
	@FXML public  Button TBtn1;

	@FXML public void BtnTSaveClicked(ActionEvent DCEvent){
		System.out.println("Tasks Called");
	}

	public void init(MyViewController myViewController) {
		// TODO Auto-generated method stub
		main = myViewController;
	}

}
