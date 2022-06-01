package vista;

import java.io.FileReader;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DatabaseMetaData;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Collections;

import controllers.ConnectionBBDD;
import controllers.ControladorInfo;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;
import javafx.stage.Stage;

public class VentanaArticleController {

    @FXML
    private ComboBox<String> boxSize;

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
    	 Parent root;
 		try {
 			root = FXMLLoader.load(getClass().getResource("VentanaPerfil.fxml"));
 			 Stage stg = new Stage();
 			 stg = (Stage) ((Node) event.getSource()).getScene().getWindow();
 			 Scene scene = new Scene(root); 
 			 stg.setScene(scene);
 			 stg.show();
 		} catch (IOException e) {
 			// TODO Auto-generated catch block
 			e.printStackTrace();
 		}
 		
     }

    

    @FXML
    void btnAddCartOnClicked(MouseEvent event) {
    	 Parent root;
  		try {
  			root = FXMLLoader.load(getClass().getResource("VentanaLogin.fxml"));
  			 Stage stg = new Stage();
  			 stg = (Stage) ((Node) event.getSource()).getScene().getWindow();
  			 Scene scene = new Scene(root); 
  			 stg.setScene(scene);
  			 stg.show();
  		} catch (IOException e) {
  			// TODO Auto-generated catch block
  			e.printStackTrace();
  		}
  		
      }

  

    

    @FXML
    void btnShowMeOnClicked(MouseEvent event) {
    	
    	try {
    		VentanaPrincipalController pass = new VentanaPrincipalController();
    		String id = "";
    		try {
				FileReader entrada = new FileReader("C:/Users/Drumstick/eclipse-workspace/TheLuxuryShoes/src/vista/ids.txt");
						int i = 0;
				while(i!=-1) {
					i=entrada.read();
					char letra=(char)i;
					id+=letra;
				}
			
				id = id.substring(0,id.length()-1);
				System.out.println(id);
    		ConnectionBBDD c = new ConnectionBBDD();
			Connection conn = DriverManager.getConnection("jdbc:mysql://" + c.getIP() + "/TheLuxuryShoes", c.getUser(),
			c.getPswd());
			Statement stats = conn.createStatement();
			
				ResultSet result = stats.executeQuery("SELECT * FROM Article where imgUrl like "+"'"+id+"'"+";");
				DatabaseMetaData dbmd = conn.getMetaData();

				ArrayList<String> list = new ArrayList<>();
				
				//result = dbmd.getTables(null, null, "size%", new String[] {"TABLE"});
			
				result.next();
				Collections.addAll(list, new String[] {result.getString("size"), result.getString("size2"),result.getString("size3")});
				
				System.out.println(result.getString("size"));
				System.out.println(id);
				switch(id) {
				case "total90": 
				txtBrand.setText(result.getString("Brand"));
				txtAmount.setText(result.getString("amount"));
				txtPrice.setText(result.getString("price"));
				txtDescript.setText(result.getString("title"));
				boxSize.getItems().addAll(list);
				break;
				case "xinghuanhua":
					txtBrand.setText(result.getString("Brand"));
					txtAmount.setText(result.getString("amount"));
					txtPrice.setText(result.getString("price"));
					txtDescript.setText(result.getString("title"));
					boxSize.getItems().addAll(list);
				break;	
				case"ghosted_rosa":
					txtBrand.setText(result.getString("Brand"));
					txtAmount.setText(result.getString("amount"));
					txtPrice.setText(result.getString("price"));
					txtDescript.setText(result.getString("title"));
					boxSize.getItems().addAll(list);
				break;
				case"futurez":
					txtBrand.setText(result.getString("Brand"));
					txtAmount.setText(result.getString("amount"));
					txtPrice.setText(result.getString("price"));
					txtDescript.setText(result.getString("title"));
				break;
				case"copaSense":
					txtBrand.setText(result.getString("Brand"));
					txtAmount.setText(result.getString("amount"));
					txtPrice.setText(result.getString("price"));
					txtDescript.setText(result.getString("title"));
					boxSize.getItems().addAll(list);
				break;
				case"grescaMunich":
					txtBrand.setText(result.getString("Brand"));
					txtAmount.setText(result.getString("amount"));
					txtPrice.setText(result.getString("price"));
					txtDescript.setText(result.getString("title"));
					boxSize.getItems().addAll(list);
				break;
				case"sambaAdidas":
					txtBrand.setText(result.getString("Brand"));
					txtAmount.setText(result.getString("amount"));
					txtPrice.setText(result.getString("price"));
					txtDescript.setText(result.getString("title"));
					boxSize.getItems().addAll(list);
				break;
				case"imviso100":
					txtBrand.setText(result.getString("Brand"));
					txtAmount.setText(result.getString("amount"));
					txtPrice.setText(result.getString("price"));
					txtDescript.setText(result.getString("title"));
					boxSize.getItems().addAll(list);
				break;
				case"ViraltoII":
					txtBrand.setText(result.getString("Brand"));
					txtAmount.setText(result.getString("amount"));
					txtPrice.setText(result.getString("price"));
					txtDescript.setText(result.getString("title"));
					boxSize.getItems().addAll(list);
				break;
				case"imvisoEskudo500":
					txtBrand.setText(result.getString("Brand"));
					txtAmount.setText(result.getString("amount"));
					txtPrice.setText(result.getString("price"));
					txtDescript.setText(result.getString("title"));
					boxSize.getItems().addAll(list);
				break;
				case"adidasNovaflight":
					txtBrand.setText(result.getString("Brand"));
					txtAmount.setText(result.getString("amount"));
					txtPrice.setText(result.getString("price"));
					txtDescript.setText(result.getString("title"));
					boxSize.getItems().addAll(list);
				break;
				case"allsix100":
					txtBrand.setText(result.getString("Brand"));
					txtAmount.setText(result.getString("amount"));
					txtPrice.setText(result.getString("price"));
					txtDescript.setText(result.getString("title"));
					boxSize.getItems().addAll(list);
				break;
				case"asicsSkyElite":
					txtBrand.setText(result.getString("Brand"));
					txtAmount.setText(result.getString("amount"));
					txtPrice.setText(result.getString("price"));
					txtDescript.setText(result.getString("title"));
					boxSize.getItems().addAll(list);
				break;
				case"asicsLightinhz6":
					txtBrand.setText(result.getString("Brand"));
					txtAmount.setText(result.getString("amount"));
					txtPrice.setText(result.getString("price"));
					txtDescript.setText(result.getString("title"));
				break;
				case"allsixV500":
					txtBrand.setText(result.getString("Brand"));
					txtAmount.setText(result.getString("amount"));
					txtPrice.setText(result.getString("price"));
					txtDescript.setText(result.getString("title"));
				break;
				case"AirJordan36":
					txtBrand.setText(result.getString("Brand"));
					txtAmount.setText(result.getString("amount"));
					txtPrice.setText(result.getString("price"));
					txtDescript.setText(result.getString("title"));
				break;
				case"rebound2":
					txtBrand.setText(result.getString("Brand"));
					txtAmount.setText(result.getString("amount"));
					txtPrice.setText(result.getString("price"));
					txtDescript.setText(result.getString("title"));
				break;
				case"zoomSeparate":
					txtBrand.setText(result.getString("Brand"));
					txtAmount.setText(result.getString("amount"));
					txtPrice.setText(result.getString("price"));
					txtDescript.setText(result.getString("title"));
				break;
				case"zoomFreak3":
					txtBrand.setText(result.getString("Brand"));
					txtAmount.setText(result.getString("amount"));
					txtPrice.setText(result.getString("price"));
					txtDescript.setText(result.getString("title"));
					boxSize.getItems().addAll(list);
				break;
				case"jordanAirmid":
					txtBrand.setText(result.getString("Brand"));
					txtAmount.setText(result.getString("amount"));
					txtPrice.setText(result.getString("price"));
					txtDescript.setText(result.getString("title"));
					boxSize.getItems().addAll(list);
				break;
				}
    		} catch (Exception e) {
				e.printStackTrace();
			}
				
			
    	
    }catch(Exception e) {
    	
    }
    	
    }




    
}

    
    

