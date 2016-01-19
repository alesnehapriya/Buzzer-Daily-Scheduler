package controller;

import java.net.URL;
import java.util.ResourceBundle;

import controller.tabs.DailyChecksController;
import controller.tabs.RemindersController;
import controller.tabs.TasksController;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;

public class MyViewController{
	
	@FXML DailyChecksController dailyChecksController =null;
	@FXML RemindersController remindersController=null;
	@FXML TasksController tasksController=null;

	@FXML	public void initialize() {
		// TODO Auto-generated method stub
		dailyChecksController.init(this);
		remindersController.init(this);
		tasksController.init(this);
	}

}
