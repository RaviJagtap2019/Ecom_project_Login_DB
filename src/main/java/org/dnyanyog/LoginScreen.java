package org.dnyanyog;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class LoginScreen extends Application {
		public static void main(String[] args) {
			Application.launch(args);
		}
		@Override
		public void start(Stage stageCrearetedByJavaFx) throws Exception{
			
			Stage stage = new Stage();
			stage.setTitle("Coustemer Login");
			
			Parent actorgroup=FXMLLoader.load(getClass().getResource("/LoginScreen.fxml"));
			
			Scene scene=new Scene(actorgroup,600,400);
			stage.setScene(scene);
			
			stage.show();
			
		}
		
}
