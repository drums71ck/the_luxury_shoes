package vista;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.Menu;
import javafx.scene.control.MenuItem;
import javafx.scene.control.TitledPane;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;
import javafx.stage.Stage;

import java.awt.TextArea;
import java.io.BufferedReader;
import java.io.FileWriter;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Iterator;

import controllers.ConnectionBBDD;
import controllers.ControladorInfo;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Menu;
import javafx.scene.control.TitledPane;
import javafx.scene.image.ImageView;

public class VentanaPrincipalController  {
	@FXML
	private MenuItem btnShowFootball;

	@FXML
	private ImageView foto1;
	
	@FXML
	private ImageView foto11;

	@FXML
	private ImageView foto111;

	@FXML
	private ImageView foto1111;

	@FXML
	private ImageView foto11111;
	
	 @FXML
	 private Label txtimg1;

	 @FXML
	 private Label txtimg2;

	 @FXML
	 private Label txtimg3;

	 @FXML
	 private Label txtimg4;

	 @FXML
	 private Label txtimg5;



	@FXML
	private Menu mnBasket;

	@FXML
	private Menu mnFootball;

	@FXML
	private Menu mnIndoor;

	@FXML
	private Menu mnVolley;

	@FXML
	private TitledPane windowPrincipal;
	
	public String idimg2;
	
	public String IdFoto2;
	




	@FXML
	void btnBasketClicked(ActionEvent event) {
		System.out.println("basket");
		Image newImage = new Image("/vista/assets/AirJordan36.jpg");
		Image newImage2 = new Image("/vista/assets/rebound2.jpg");
		Image newImage3 = new Image("/vista/assets/zoomSeparate.jpg");
		Image newImage4 = new Image("/vista/assets/zoomFreak3.jpg");
		Image newImage5 = new Image("/vista/assets/jordanAirmid.jpg");
		foto1.setImage(newImage);
		foto11.setImage(newImage2);
		foto111.setImage(newImage3);
		foto1111.setImage(newImage4);
		foto11111.setImage(newImage5);
		foto1.setId("AirJordan36");
		foto11.setId("rebound2");
		foto111.setId("zoomSeparate");
		foto1111.setId("zoomFreak3");
		foto11111.setId("jordanAirmid");
		txtimg1.setText("AirJordan36");
		txtimg2.setText("rebound2");
		txtimg3.setText("zoomSeparate");
		txtimg4.setText("zoomFreak3");
		txtimg5.setText("jordanAirmid");
		

	}

	@FXML
	void btnFootballClicked(ActionEvent event) {
		Image newImage = new Image("/vista/assets/total90.jpg");
		Image newImage2 = new Image("/vista/assets/xinghuanhua.jpg");
		Image newImage3 = new Image("/vista/assets/ghosted_rosa.jpg");
		Image newImage4 = new Image("/vista/assets/futurez.jpg");
		Image newImage5 = new Image("/vista/assets/copaSense.jpg");
		foto1.setImage(newImage);
		foto11.setImage(newImage2);
		foto111.setImage(newImage3);
		foto1111.setImage(newImage4);
		foto11111.setImage(newImage5);
	
		foto1.setId("total90");
		foto11.setId("xinghuanhua");
		foto111.setId("ghosted_rosa");
		foto1111.setId("futurez");
		foto11111.setId("copaSense");
		
		txtimg1.setText("total90");
		txtimg2.setText("xinghuanhua");
		txtimg3.setText("ghosted_rosa");
		txtimg4.setText("futurez");
		txtimg5.setText("copaSense");
	}


	@FXML
	void btnInFootballClicked(ActionEvent event) {
		
		Image newImage = new Image("/vista/assets/grescaMunich.jpg");
		Image newImage2 = new Image("/vista/assets/sambaAdidas.jpg");
		Image newImage3 = new Image("/vista/assets/imviso100.jpg");
		Image newImage4 = new Image("/vista/assets/ViraltoII.jpg");
		Image newImage5 = new Image("/vista/assets/imvisoEskudo500.jpg");
		foto1.setImage(newImage);
		foto11.setImage(newImage2);
		foto111.setImage(newImage3);
		foto1111.setImage(newImage4);
		foto11111.setImage(newImage5);
		foto1.setId("grescaMunich");
		foto11.setId("sambaAdidas");
		foto111.setId("imviso100");
		foto1111.setId("ViraltoII");
		foto11111.setId("imvisoEskudo500");
		
		txtimg1.setText("grescaMunich");
		txtimg2.setText("sambaAdidas");
		txtimg3.setText("imviso100");
		txtimg4.setText("Viralto II");
		txtimg5.setText("imvisoEskudo500");
	}
	

	@FXML
	void btnVolley(ActionEvent event) {
		Image newImage = new Image("/vista/assets/adidasNovaflight.jpg");
		Image newImage2 = new Image("/vista/assets/allsix100.jpg");
		Image newImage3 = new Image("/vista/assets/asicsSkyElite.jpg");
		Image newImage4 = new Image("/vista/assets/asicsLightinhz6.jpg");
		Image newImage5 = new Image("/vista/assets/allsixV500.jpg");
		foto1.setImage(newImage);
		foto11.setImage(newImage2);
		foto111.setImage(newImage3);
		foto1111.setImage(newImage4);
		foto11111.setImage(newImage5);
		foto1.setId("adidasNovaflight");
		foto11.setId("allsix100");
		foto111.setId("asicsSkyElite");
		foto1111.setId("asicsLightinhz6");
		foto11111.setId("allsixV500");
		
		txtimg1.setText("adidasNovaflight");
		txtimg2.setText("allsix100");
		txtimg3.setText("asicsSkyElite");
		txtimg4.setText("asicsLightinhz6");
		txtimg5.setText("allsixV500");


	}

	@FXML
	void tVentanaPrincipalController(ActionEvent event) {
		

	}
	
	 @FXML
	    void btnImage1unclicket(MouseEvent event) throws IOException {
		 Parent root = FXMLLoader.load(getClass().getResource("VentanaArticle.fxml"));
		 Stage stg = new Stage();
		 stg = (Stage) ((Node) event.getSource()).getScene().getWindow();
		 Scene scene = new Scene(root); 
		 stg.setScene(scene);
		 stg.show();
		 String IdFoto1 = foto1.getId();
		 FileWriter escritura = new FileWriter("/home/marc/Documents/TheLuxuryShoes/src/vista/ids.txt");
		 for ( int i = 0; i<IdFoto1.length();i++) {
			 escritura.write(IdFoto1.charAt(i));
		 }
		 escritura.close();
		 	
	    }

	

		@FXML
	    void btnImage2unclicket(MouseEvent event) throws IOException {
	    	 Parent root = FXMLLoader.load(getClass().getResource("VentanaArticle.fxml"));
			 Stage stg = new Stage();
			 stg = (Stage) ((Node) event.getSource()).getScene().getWindow();
			 Scene scene = new Scene(root); 
			 stg.setScene(scene);
			 stg.show();
			 String IdFoto2 = foto11.getId();
			 FileWriter escritura = new FileWriter("/home/marc/Documents/TheLuxuryShoes/src/vista/ids.txt");
			 for ( int i = 0; i<IdFoto2.length();i++) {
				 escritura.write(IdFoto2.charAt(i));
			 }
			 escritura.close();
	    }

	   

		@FXML
	    void btnImage4unclicket(MouseEvent event) throws IOException {
	    	 Parent root = FXMLLoader.load(getClass().getResource("VentanaArticle.fxml"));
			 Stage stg = new Stage();
			 stg = (Stage) ((Node) event.getSource()).getScene().getWindow();
			 Scene scene = new Scene(root); 
			 stg.setScene(scene);
			 stg.show();
			 String IdFoto4 = foto1111.getId();
			 FileWriter escritura = new FileWriter("/home/marc/Documents/TheLuxuryShoes/src/vista/ids.txt");
			 for ( int i = 0; i<IdFoto4.length();i++) {
				 escritura.write(IdFoto4.charAt(i));
			 }
			 escritura.close();
			 	
	    }

	    @FXML
	    void btnImage5unclicket(MouseEvent event) throws IOException {
	    	 Parent root = FXMLLoader.load(getClass().getResource("VentanaArticle.fxml"));
			 Stage stg = new Stage();
			 stg = (Stage) ((Node) event.getSource()).getScene().getWindow();
			 Scene scene = new Scene(root); 
			 stg.setScene(scene);
			 stg.show();
			 String IdFoto5 = foto11111.getId();
			 FileWriter escritura = new FileWriter("/home/marc/Documents/TheLuxuryShoes/src/vista/ids.txt");
			 for ( int i = 0; i<IdFoto5.length();i++) {
				 escritura.write(IdFoto5.charAt(i));
			 }
			 escritura.close();
			 	
	    }
			

	    

		@FXML
	    void btnImagen3unclicket(MouseEvent event) throws IOException {
	    	 Parent root = FXMLLoader.load(getClass().getResource("VentanaArticle.fxml"));
			 Stage stg = new Stage();
			 stg = (Stage) ((Node) event.getSource()).getScene().getWindow();
			 Scene scene = new Scene(root); 
			 stg.setScene(scene);
			 stg.show();
			 String IdFoto3 = foto111.getId();
			 FileWriter escritura = new FileWriter("/home/marc/Documents/TheLuxuryShoes/src/vista/ids.txt");
			 for ( int i = 0; i<IdFoto3.length();i++) {
				 escritura.write(IdFoto3.charAt(i));
			 }
			 escritura.close();
			 	
			
			 
			
	    }
		
	
		

	
	
	

}