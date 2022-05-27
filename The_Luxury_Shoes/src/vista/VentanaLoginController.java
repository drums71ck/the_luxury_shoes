package vista;

import java.io.ObjectInputStream.GetField;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

import javax.swing.JOptionPane;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextArea;
import javafx.scene.input.MouseEvent;
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

			while (result.next()) {
				// Guardamos los metadatos en variables
				String BDuser = result.getString("username");
				String BDpswd = result.getString("password");
				// Comprobador que exista el usuario en la base dades
				System.out.println(BDpswd+" "+BDuser);
				if (!username.equals(BDuser) && !password.equals(BDpswd)) {
					throw new IllegalAccessException();
				} else {
					System.out.println("inicio de sesion correcta");
				}

			}
			//FXMLLoader loader = new FXMLLoader()

		} catch (Exception e) {
			e.printStackTrace();
		     JOptionPane.showMessageDialog(null, "User incorrect o password incorrect",
		    	      "Hey!", JOptionPane.ERROR_MESSAGE);
		}
	}

	@FXML
	void btnRegisterOnClicked(MouseEvent event) {

	}

}
