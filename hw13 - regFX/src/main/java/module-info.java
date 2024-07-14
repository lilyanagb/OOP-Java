module com.example.regfx {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.regfx to javafx.fxml;
    exports com.example.regfx;
}