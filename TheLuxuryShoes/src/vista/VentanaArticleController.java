package vista;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

import controllers.ConnectionBBDD;
import controllers.ControladorInfo;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;

public class VentanaArticleController {

    @FXML
    private ComboBox<?> boxSize;

    @FXML
    private Button btnAddCart;

    @FXML
    private ImageView srcImage;

    @FXML
    private ImageView srcPerfil;

    @FXML
    private TextField txtAmount;

    @FXML
    private Label txtArticle;

    @FXML
    private TextField txtBrand;

    @FXML
    private TextField txtDescript;

    @FXML
    private TextField txtPrice;
    @FXML
    private Button btnShowme;

    @FXML

    void MenuSize(MouseEvent event) {

    }

   
  

    @FXML
    void accesoperfil(MouseEvent event) {
    	System.out.println("pal ps");

    }

    @FXML
    void btnAddCartOnClicked(MouseEvent event) {
   

    }
  

    
    /*@FXML
    void PonerDatos(String id) {
    	
}*/
    @FXML
    void btnShowMeOnClicked(MouseEvent event) {
    	try {
    		VentanaPrincipalController pass = new VentanaPrincipalController();
    		ConnectionBBDD c = new ConnectionBBDD();
			Connection conn = DriverManager.getConnection("jdbc:mysql://" + c.getIP() + "/TheLuxuryShoes", c.getUser(),
			c.getPswd());
			Statement stats = conn.createStatement();
			String id =	pass.getFoto1();
		
			System.out.println(id);
				ResultSet result = stats.executeQuery("SELECT * FROM Article");
				result.next();
				switch("total90") {
				case "total90": 
				txtBrand.setText(result.getString("Brand"));
				txtAmount.setText(result.getString("amount"));
				break;
				case "Xinghuanha":
				txtBrand.setText(result.getString("brand"));
				txtDescript.setText(result.getString("title"));
				break;	
				case"adidasNovaflight":
					txtDescript.setText(result.getString("title"));
				}
				
			
    	
    }catch(Exception e) {
    	
    }
    	
    }




    
}

    
    

