package vista;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
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

    void MenuSize(MouseEvent event) {

    }

    @FXML
    void accesoperfil(MouseEvent event) {
    	System.out.println("pal ps");

    }

    @FXML
    void btnAddCartOnClicked(MouseEvent event) {

    }

}
