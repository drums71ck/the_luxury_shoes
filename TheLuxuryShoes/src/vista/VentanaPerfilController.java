package vista;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Collections;

import controllers.ConnectionBBDD;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.TextArea;
import javafx.scene.input.MouseEvent;
import javafx.stage.Stage;

public class VentanaPerfilController {

	@FXML
	private ComboBox<?> boxHistory;

	@FXML
	private ComboBox<String> boxShopCart;

	@FXML
	private Button btnBuy;

	@FXML
	private Button btnSave;

	@FXML
	private TextArea txtEmailPerfil;

	@FXML
	private TextArea txtUsernamePerfil;

	@FXML
	private Button btnshowInfo;

	@FXML
	void btnBuyOnClicked(MouseEvent event) {
		Parent root;
		try {
			root = FXMLLoader.load(getClass().getResource("VentanaShop.fxml"));
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

	@FXML
	void btnSaveOnClicked(MouseEvent event) {

	}

	@FXML
	void btnShowOnClicked(MouseEvent event) throws IOException {
		ConnectionBBDD c = new ConnectionBBDD();
		Connection conn;
		try {
			conn = DriverManager.getConnection("jdbc:mysql://" + c.getIP() + "/TheLuxuryShoes", c.getUser(),
					c.getPswd());

			Statement stats = conn.createStatement();
			String username = "";
			try {
				FileReader entrada2 = new FileReader("/home/marc/Documents/TheLuxuryShoes/src/vista/users.txt");
				int j = 0;
				while (j != -1) {
					j = entrada2.read();
					char letra = (char) j;
					username += letra;
				}
				System.out.println(username);
				username=username.substring(0, username.length() - 1);

				ResultSet result = stats
						.executeQuery("SELECT * FROM Users where username like " + "'" + username + "'" + ";");
				result.next();
				txtUsernamePerfil.setText(result.getString("username"));
				txtEmailPerfil.setText(result.getNString("email"));

				VentanaPrincipalController pass = new VentanaPrincipalController();
				String id = "";

				FileReader entrada = new FileReader("/home/marc/Documents/TheLuxuryShoes/src/vista/ids.txt");
				int i = 0;
				while (i != -1) {
					i = entrada.read();
					char letra = (char) i;
					id += letra;
				}

				id = id.substring(0, id.length() - 1);
				System.out.println(id);
				result = stats.executeQuery("SELECT * FROM Article where imgUrl like " + "'" + id + "'");
				result.next();
				ArrayList<String> list = new ArrayList<>();
				Collections.addAll(list,
						new String[] { result.getString("title") + " " + result.getString("price") + "€" });
				boxShopCart.getItems().addAll(list);
				btnshowInfo.setDisable(true);
				System.out.println(result.getString("title") + " " + result.getString("price"));
			} catch (SQLException e) {

				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		} catch (Exception e) {

		}
	}

}
