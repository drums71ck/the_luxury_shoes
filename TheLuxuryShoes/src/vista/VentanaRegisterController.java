package vista;

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
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.input.MouseEvent;
import javafx.stage.Stage;

public class VentanaRegisterController {

	@FXML
	private Button btnCreate;

	@FXML
	private TextField txtEmail;

	@FXML
	private PasswordField txtPassword;

	@FXML
	private TextField txtUsername;
	
	

	@FXML
	void btnCreateOnClicked(MouseEvent event) {

		try {
			ConnectionBBDD u = new ConnectionBBDD();
			Connection conn = DriverManager.getConnection("jdbc:mysql://" + u.getIP() + "/TheLuxuryShoes", u.getUser(),
					u.getPswd());

			Statement stats = conn.createStatement();
			String userName = this.txtUsername.getText();
			String email = this.txtEmail.getText();
			String pswd = this.txtPassword.getText();

			System.out.println(userName);
			System.out.println(email);
			System.out.println(pswd);
			
			

			String query = " insert into Users (username, password, email, wallet)"
					+ " values (?, ?, ?, ?)";

			// create the mysql insert preparedstatement
			PreparedStatement preparedStmt = conn.prepareStatement(query);

			preparedStmt.setString(1, userName);
			preparedStmt.setString(2, pswd);
			preparedStmt.setString(3, email);
			preparedStmt.setInt(4, 5000);

			// execute the preparedstatement
			preparedStmt.execute();
			conn.close();
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

		} catch (SQLException e) {
			JOptionPane.showMessageDialog(null, "El usuario ya existe");
		}

	}
}