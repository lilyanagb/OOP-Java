package com.example.midtermfx; /**
 * Sample Skeleton for 'cipher-view.fxml' Controller Class
 */

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;

public class TestMethod {

    @FXML // ResourceBundle that was given to the FXMLLoader
    private ResourceBundle resources;

    @FXML // URL location of the FXML file that was given to the FXMLLoader
    private URL location;

    @FXML // fx:id="btnDecrypt"
    private Button btnDecrypt; // Value injected by FXMLLoader

    @FXML // fx:id="btnEncrypt"
    private Button btnEncrypt; // Value injected by FXMLLoader

    @FXML // fx:id="btnQuit"
    private Button btnQuit; // Value injected by FXMLLoader

    @FXML // fx:id="txtCipherText"
    private TextField txtCipherText; // Value injected by FXMLLoader

    @FXML // fx:id="txtKey"
    private TextField txtKey; // Value injected by FXMLLoader

    @FXML // fx:id="txtPlainText"
    private TextField txtPlainText; // Value injected by FXMLLoader


    @FXML
    void btnDecryptOnAction(ActionEvent event) {
        CipherMethod method=new CipherMethod();

    String cipherText= txtCipherText.getText();
    String cipher=txtKey.getText();
    String plainText=method.decryptText(cipherText,cipher);

    txtPlainText.setText(plainText);
    }

    @FXML
    void btnEncryptOnAction(ActionEvent event) {
        CipherMethod method=new CipherMethod();

        String plainText= txtPlainText.getText();
        String cipher=txtKey.getText();
        String cipherText=method.decryptText(plainText,cipher);

        txtCipherText.setText(cipherText);
    }

    @FXML
    void btnQuitOnAction(ActionEvent event) {
        System.exit(0);
    }

    @FXML // This method is called by the FXMLLoader when initialization is complete
    void initialize() {
        assert btnDecrypt != null : "fx:id=\"btnDecrypt\" was not injected: check your FXML file 'cipher-view.fxml'.";
        assert btnEncrypt != null : "fx:id=\"btnEncrypt\" was not injected: check your FXML file 'cipher-view.fxml'.";
        assert btnQuit != null : "fx:id=\"btnQuit\" was not injected: check your FXML file 'cipher-view.fxml'.";
        assert txtCipherText != null : "fx:id=\"txtCipherText\" was not injected: check your FXML file 'cipher-view.fxml'.";
        assert txtKey != null : "fx:id=\"txtKey\" was not injected: check your FXML file 'cipher-view.fxml'.";
        assert txtPlainText != null : "fx:id=\"txtPlainText\" was not injected: check your FXML file 'cipher-view.fxml'.";

    }

}
