package vista;

import java.io.ObjectInputStream.GetField;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

import javafx.fxml.FXML;
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
    	Connection conn = DriverManager.getConnection("jdbc:mysql://"+ c.getIP() +"/TheLuxuryShoes",c.getUser(),c.getPswd());
    	Statement stats= conn.createStatement();
    	ResultSet result = stats.executeQuery("SELECT * FROM Users");
    	String username = this.boxUsername.getText();
    	String password = this.boxPaswd.getText();
    	String usernameB = result.getString("username");
    	String passwordB = result.getString("password");
    }catch (Exception e) {
    }
    }

    @FXML
    void btnRegisterOnClicked(MouseEvent event) {

    }

}
