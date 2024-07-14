module com.example.midtermfx {
    requires javafx.controls;
    requires javafx.fxml;

    opens com.example.midtermfx to javafx.fxml;
    exports com.example.midtermfx;
}