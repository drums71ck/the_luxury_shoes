module The_Luxury_Shoes {
	requires javafx.controls;
	requires javafx.fxml;
	
	opens vista to javafx.graphics, javafx.fxml;
}
