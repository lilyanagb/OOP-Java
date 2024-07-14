module com.example.last {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.last to javafx.fxml;
    exports com.example.last;
}