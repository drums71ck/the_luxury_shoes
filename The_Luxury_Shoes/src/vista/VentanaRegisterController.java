package vista;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.input.MouseEvent;

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
    	String userName = this.txtUsername.getText();
    	String email = this.txtEmail.getText();
    	String pswd = this.txtPassword.getText();
    	System.out.println(userName);
    	System.out.println(email);
    	System.out.println(pswd);

    }

}
