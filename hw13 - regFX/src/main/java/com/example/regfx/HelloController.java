/**
 * Sample Skeleton for 'hello-view.fxml' Controller Class
 */

package com.example.regfx;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.text.Text;

public class HelloController {

    @FXML // ResourceBundle that was given to the FXMLLoader
    private ResourceBundle resources;

    @FXML // URL location of the FXML file that was given to the FXMLLoader
    private URL location;

    @FXML // fx:id="btnSign"
    private Button btnSign; // Value injected by FXMLLoader

    @FXML // fx:id="txtConfirm"
    private TextField txtConfirm; // Value injected by FXMLLoader

    @FXML // fx:id="txtEmail"
    private TextField txtEmail; // Value injected by FXMLLoader

    @FXML // fx:id="txtName"
    private TextField txtName; // Value injected by FXMLLoader

    @FXML // fx:id="txtPassword"
    private TextField txtPassword; // Value injected by FXMLLoader

    @FXML // fx:id="txtPhone"
    private TextField txtPhone; // Value injected by FXMLLoader

    @FXML
    void btnSignOnAction(ActionEvent event) {
        ValidateInput validation=new ValidateInput();

        String name=txtName.getText();
        String phone=txtPhone.getText();
        String email=txtEmail.getText();
        String password=txtPassword.getText();
        String confirm=txtConfirm.getText();

        if(!validation.validateName(name)){
            txtName.setText("Wrong name!");
        }
        if(!validation.validatePhone(phone)){
            txtPhone.setText("Wrong phone!");
        }
        if(!validation.validateEmail(email)){
            txtEmail.setText("Wrong email!");
        }
        if(!validation.validatePassword(password)){
            txtPassword.setText("Not enough symbols!");
        }
        if(!password.equals(confirm)){
            txtConfirm.setText("Wrong password!");
        }
    }

    @FXML // This method is called by the FXMLLoader when initialization is complete
    void initialize() {
        assert btnSign != null : "fx:id=\"btnSign\" was not injected: check your FXML file 'hello-view.fxml'.";
        assert txtConfirm != null : "fx:id=\"txtConfirm\" was not injected: check your FXML file 'hello-view.fxml'.";
        assert txtEmail != null : "fx:id=\"txtEmail\" was not injected: check your FXML file 'hello-view.fxml'.";
        assert txtName != null : "fx:id=\"txtName\" was not injected: check your FXML file 'hello-view.fxml'.";
        assert txtPassword != null : "fx:id=\"txtPassword\" was not injected: check your FXML file 'hello-view.fxml'.";
        assert txtPhone != null : "fx:id=\"txtPhone\" was not injected: check your FXML file 'hello-view.fxml'.";

    }

}
