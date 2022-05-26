package vista;
import javafx.fxml.FXML;
import javafx.scene.control.Menu;
import javafx.scene.control.MenuItem;
import javafx.scene.control.TitledPane;
import javafx.scene.image.ImageView;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Menu;
import javafx.scene.control.TitledPane;
import javafx.scene.image.ImageView;

public class VentanaPrincipalController {
	@FXML
    private MenuItem btnShowFootball;

    @FXML
    private ImageView foto1;

    @FXML
    private Menu mnBasket;

    @FXML
    private Menu mnFootball;

    @FXML
    private Menu mnIndoor;

    @FXML
    private Menu mnVolley;

    @FXML
    private TitledPane windowPrincipal;

    @FXML
    void btnBasketClicked(ActionEvent event) {

    }

    @FXML
    void btnFootballClicked(ActionEvent event) {
    	System.out.println("select * from article where type like football");

    }

    @FXML
    void btnInFootballClicked(ActionEvent event) {
    	System.out.println("futbol sala");

    }

    @FXML
    void btnVolley(ActionEvent event) {

    }

    @FXML
    void tVentanaPrincipalController(ActionEvent event) {

    }

}