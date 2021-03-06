package vista;
	
import java.util.Scanner;

import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.BorderPane;
import javafx.fxml.FXMLLoader;
import javax.swing.*;


public class Main extends Application {
	@Override
	public void start(Stage primaryStage) {
		try {
			Scanner in = new Scanner (System.in);
		
				BorderPane root = (BorderPane)FXMLLoader.load(getClass().getResource("VentanaPrincipal.fxml"));
				Scene scene = new Scene(root,650,400);
				scene.getStylesheets().add(getClass().getResource("application.css").toExternalForm());
				primaryStage.setScene(scene);
				primaryStage.show();
			
						
			
			
		} catch(Exception e) {
			e.printStackTrace();
			
		}
	}
	
	public static void main(String[] args) {
		launch(args);
	}
}
