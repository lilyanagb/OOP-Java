module com.example.hw_week8 {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.hw_week8 to javafx.fxml;
    exports com.example.hw_week8;
}