package application;
	
import java.util.Scanner;

import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.layout.BorderPane;
import javafx.fxml.FXMLLoader;


public class Main extends Application {
	@Override
	public void start(Stage primaryStage) {
		try {
			Scanner sc = new Scanner(System.in);
			System.out.println("1.DescripcionArticulo\n 2.Loguearse\n 3.Perfil");
			int op = sc.nextInt();
			BorderPane root = (BorderPane)FXMLLoader.load(getClass().getResource("Sample.fxml"));
			Scene scene = new Scene(root,600,490);
			switch(op) {
			case 1:
				root = (BorderPane)FXMLLoader.load(getClass().getResource("Sample.fxml"));
				scene = new Scene(root,600,490);
				scene.getStylesheets().add(getClass().getResource("application.css").toExternalForm());
				primaryStage.setScene(scene);
				primaryStage.show();
				break;
			case 2:
				 root = (BorderPane)FXMLLoader.load(getClass().getResource("Sample2.fxml"));
				 scene = new Scene(root,600,490);
				 scene.getStylesheets().add(getClass().getResource("application.css").toExternalForm());
				primaryStage.setScene(scene);
				primaryStage.show();
				break;
			case 3:
				root = (BorderPane)FXMLLoader.load(getClass().getResource("Sample3.fxml"));
				 scene = new Scene(root,600,490);
				 scene.getStylesheets().add(getClass().getResource("application.css").toExternalForm());
					primaryStage.setScene(scene);
					primaryStage.show();
				break;
			}
			/*BorderPane root = (BorderPane)FXMLLoader.load(getClass().getResource("Sample.fxml"));
			Scene scene = new Scene(root,600,490);*/
			
			
		} catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	public static void main(String[] args) {
		launch(args);
	}
}
