package vista;

import java.io.FileReader;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import javax.swing.JOptionPane;

import controllers.ConnectionBBDD;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.input.MouseEvent;
import javafx.stage.Stage;

public class VentanaShopController {

	@FXML
	private Button btnPay;
	@FXML
	public Label txtWallet;

	// @FXML
	/*
	 * void showWallet() { ConnectionBBDD c = new ConnectionBBDD(); try { String id
	 * = ""; VentanaLoginController loginController = new VentanaLoginController();
	 * System.out.println(loginController.getUser()); Connection conn =
	 * DriverManager.getConnection("jdbc:mysql://" + c.getIP() + "/TheLuxuryShoes",
	 * c.getUser(), c.getPswd()); Statement stats = conn.createStatement();
	 * 
	 * ResultSet result = stats.executeQuery(
	 * "SELECT * FROM Users where username like " + "'" + loginController.getUser()
	 * + "'" + ";"); result.next(); txtWallet.setText(result.getString("wallet")); }
	 * catch (SQLException e) {
	 * 
	 * e.printStackTrace(); } }
	 */

	@FXML
	void btnPayOnClicked(MouseEvent event) throws IOException {
		ConnectionBBDD c = new ConnectionBBDD();
		try {
			String id = "";
			Connection conn = DriverManager.getConnection("jdbc:mysql://" + c.getIP() + "/TheLuxuryShoes", c.getUser(),
					c.getPswd());
			Statement stats = conn.createStatement();

			FileReader entrada = new FileReader(
					"/home/marc/Documents/TheLuxuryShoes/src/vista/ids.txt");
			int i = 0;
			while (i != -1) {
				i = entrada.read();
				char letra = (char) i;
				id += letra;
			}
			ResultSet result = stats.executeQuery("SELECT * FROM Article where imgUrl like " + "'" + id + "'" + ";");
			id = id.substring(0, id.length() - 1);
			result.next();
			System.out.println(id);
			JOptionPane.showMessageDialog(null, "Thanks for you buy");
			Boolean change=true;
			PreparedStatement ps = conn.prepareStatement("UPDATE Article set amount =? where imgUrl like "+"'"+id+"'"+";");
			ps.setInt(1,-1);
			if(change==true) {
				Parent root;
		  		try {
		  			root = FXMLLoader.load(getClass().getResource("VentanaPrincipal.fxml"));
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
		
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

}
