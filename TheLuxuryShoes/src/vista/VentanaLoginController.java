package vista;

import java.io.IOException;
import java.io.ObjectInputStream.GetField;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

import javax.swing.JOptionPane;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextArea;
import javafx.scene.input.MouseEvent;
import javafx.stage.Stage;
import controllers.*;

public class VentanaLoginController {

	@FXML
	private PasswordField boxPaswd;

	@FXML
	private TextArea boxUsername;

	@FXML
	private Button btnAccept;

	@FXML
	private Button btnRegister;
	
	public Boolean ActiveUser;
	
	public String User;
	
	public VentanaLoginController() {
		
	}
	public VentanaLoginController(String username) {
		User=username;
	}

	@FXML
	void btnAcceptOnClicked(MouseEvent event) {
		try {
			ConnectionBBDD c = new ConnectionBBDD();
			Connection conn = DriverManager.getConnection("jdbc:mysql://" + c.getIP() + "/TheLuxuryShoes", c.getUser(),
					c.getPswd());
			Statement stats = conn.createStatement();
			ResultSet result = stats.executeQuery("SELECT * FROM Users");

			// Guardamos
			String username = this.boxUsername.getText();
			String password = this.boxPaswd.getText();
			User=username;
			while (result.next()) {
				// Guardamos los metadatos en variables
				String BDuser = result.getString("username");
				String BDpswd = result.getString("password");
				// Comprobador que exista el usuario en la base dades
				System.out.println(BDpswd+" "+BDuser);
				if (!username.equals(BDuser) && !password.equals(BDpswd)) {
					ActiveUser=false;
					throw new IllegalAccessException();
				} else {
					System.out.println("inicio de sesion correcta");
					ActiveUser=true;
					abrirVentana(event);
			 		
				}

			}
			//FXMLLoader loader = new FXMLLoader()

		} catch (IllegalAccessException e) {
		
		     JOptionPane.showMessageDialog(null, "User incorrect o password incorrect",
		    	      "Hey!", JOptionPane.ERROR_MESSAGE);
		} catch (Exception e) {
			// TODO: handle exception
		}
	}

	@FXML
	void btnRegisterOnClicked(MouseEvent event) {
		Parent root;
		try {
			root = FXMLLoader.load(getClass().getResource("VentanaRegister.fxml"));
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

	void abrirVentana(MouseEvent event) throws IOException {
		Parent root;
		root = FXMLLoader.load(getClass().getResource("VentanaPerfil.fxml"));
		 Stage stg = new Stage();
		 stg = (Stage) ((Node) event.getSource()).getScene().getWindow();
		 Scene scene = new Scene(root); 
		 stg.setScene(scene);
		 stg.show();
	}
	public String getUser() {
		return User;
	}

	

}
