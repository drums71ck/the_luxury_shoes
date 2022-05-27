package vista;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.input.MouseEvent;

public class VentanaShopController {

    @FXML
    private Button btnPay;

    @FXML
    void btnPayOnClicked(MouseEvent event) {
    	System.out.println("tu ere pobre no tiene ifon");
    }

}
