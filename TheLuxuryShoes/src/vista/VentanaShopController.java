package vista;

import java.io.FileReader;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import controllers.ConnectionBBDD;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.input.MouseEvent;

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
					"C:/Users/Drumstick/eclipse-workspace/TheLuxuryShoes/src/vista/ids.txt");
			int i = 0;
			while (i != -1) {
				i = entrada.read();
				char letra = (char) i;
				id += letra;
			}
			ResultSet result = stats.executeQuery("SELECT * FROM Article where imgUrl like " + "'" + id + "'" + ";");
			id = id.substring(0, id.length() - 1);
			System.out.println(id);
			while (result.next()) {
				System.out.println(result.getString("title"));
				System.out.println(result.getString("price"));
			}
		} catch (SQLException e) {

			e.printStackTrace();
		}
	}

}
