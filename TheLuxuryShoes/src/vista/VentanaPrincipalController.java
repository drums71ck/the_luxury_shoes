package vista;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Menu;
import javafx.scene.control.MenuItem;
import javafx.scene.control.TitledPane;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;
import javafx.stage.Stage;

import java.io.BufferedReader;
import java.io.FileWriter;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;

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

	public String getFoto1() {
		return foto1.toString();
	}

	public void setFoto1(ImageView foto1) {
		this.foto1 = foto1;
	}


	@FXML
	private ImageView foto11;

	@FXML
	private ImageView foto111;

	@FXML
	private ImageView foto1111;

	@FXML
	private ImageView foto11111;

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
		 		 System.out.println(foto1.getId());
		 	
	    }

	

		@FXML
	    void btnImage2unclicket(MouseEvent event) throws IOException {
	    	 Parent root = FXMLLoader.load(getClass().getResource("VentanaArticle.fxml"));
			 Stage stg = new Stage();
			 stg = (Stage) ((Node) event.getSource()).getScene().getWindow();
			 Scene scene = new Scene(root); 
			 stg.setScene(scene);
			 stg.show();
			 System.out.println(foto11.getId());
			 String IdFoto2 = foto11.getId();
	 	;
	    }

	   

		@FXML
	    void btnImage4unclicket(MouseEvent event) throws IOException {
	    	 Parent root = FXMLLoader.load(getClass().getResource("VentanaArticle.fxml"));
			 Stage stg = new Stage();
			 stg = (Stage) ((Node) event.getSource()).getScene().getWindow();
			 Scene scene = new Scene(root); 
			 stg.setScene(scene);
			 stg.show();
			 System.out.println(foto1111.getId());
			 String IdFoto4 = foto1111.getId();
	    }

	    @FXML
	    void btnImage5unclicket(MouseEvent event) throws IOException {
	    	 Parent root = FXMLLoader.load(getClass().getResource("VentanaArticle.fxml"));
			 Stage stg = new Stage();
			 stg = (Stage) ((Node) event.getSource()).getScene().getWindow();
			 Scene scene = new Scene(root); 
			 stg.setScene(scene);
			 stg.show();
			 System.out.println(foto11111.getId());
			 //InfArticulo(foto1.getId());
			  String IdFoto5 = foto11111.getId();
	    }
			

	    

		@FXML
	    void btnImagen3unclicket(MouseEvent event) throws IOException {
	    	 Parent root = FXMLLoader.load(getClass().getResource("VentanaArticle.fxml"));
			 Stage stg = new Stage();
			 stg = (Stage) ((Node) event.getSource()).getScene().getWindow();
			 Scene scene = new Scene(root); 
			 stg.setScene(scene);
			 stg.show();
			 System.out.println(foto111.getId());
			 String IdFoto3 = foto111.getId();
			
			 
			
	    }

	
		

	
	
	

}