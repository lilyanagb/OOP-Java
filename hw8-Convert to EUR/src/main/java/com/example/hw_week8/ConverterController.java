package com.example.hw_week8; /**
 * Sample Skeleton for 'converter-view.fxml' Controller Class
 */

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.*;

public class ConverterController {
    private double moneyInBGN;
    private double interest;

    private String print(double moneyInBGN, double interest,boolean EUR){
        String result="";
        for(int i=1;i<=10;i++){
            result = result.concat(String.format("%d year: %.2f %s\n",i,moneyInBGN,EUR?"EUR":"USD"));
            moneyInBGN+=interest*moneyInBGN;
        }

        return result;
    }
    @FXML // ResourceBundle that was given to the FXMLLoader
    private ResourceBundle resources;

    @FXML // URL location of the FXML file that was given to the FXMLLoader
    private URL location;

    @FXML // fx:id="btnCancel"
    private Button btnCancel; // Value injected by FXMLLoader

    @FXML // fx:id="btnEUR"
    private Button btnEUR; // Value injected by FXMLLoader

    @FXML // fx:id="btnUSD"
    private Button btnUSD; // Value injected by FXMLLoader

    @FXML // fx:id="txtBGN"
    private TextField txtBGN; // Value injected by FXMLLoader

    @FXML // fx:id="txtInterest"
    private TextField txtInterest; // Value injected by FXMLLoader

    @FXML
    void cancelOnAction(ActionEvent event) {
        System.exit(0);
    }

    @FXML
    void convertToEUROnAction(ActionEvent event) {
        final double convertToEUR=0.51;
        double money;

        Alert alert=new Alert(Alert.AlertType.INFORMATION);
        alert.setHeaderText("Your amount of money for 10 years in EUR:");
        alert.setWidth(300);

        try{
            moneyInBGN=Double.parseDouble(txtBGN.getText());
            interest=Double.parseDouble(txtInterest.getText());
        }
        catch (Exception e){
            money=0;
            interest=0;
        }

        money=moneyInBGN*convertToEUR;
        ScrollPane pane=new ScrollPane();
        pane.setContent(new TextArea(String.format("%s",print(money,interest,true))));
        alert.getDialogPane().setContent(pane);
        alert.showAndWait();
    }

    @FXML
    void convertToUSDOnAction(ActionEvent event) {
        final double convertToUSD=0.58;
        double money;

        Alert alert=new Alert(Alert.AlertType.INFORMATION);
        alert.setHeaderText("Your amount of money for 10 years in USD:");
        alert.setWidth(300);

        try{
            moneyInBGN=Double.parseDouble(txtBGN.getText());
            interest=Double.parseDouble(txtInterest.getText());
        }
        catch (Exception e){
            money=0;
            interest=0;
        }

        money=moneyInBGN*convertToUSD;
        ScrollPane pane=new ScrollPane();
        pane.setContent(new TextArea(String.format("%s",print(money,interest,false))));
        alert.getDialogPane().setContent(pane);
        alert.showAndWait();
    }

    @FXML // This method is called by the FXMLLoader when initialization is complete
    void initialize() {
        assert btnCancel != null : "fx:id=\"btnCancel\" was not injected: check your FXML file 'converter-view.fxml'.";
        assert btnEUR != null : "fx:id=\"btnEUR\" was not injected: check your FXML file 'converter-view.fxml'.";
        assert btnUSD != null : "fx:id=\"btnUSD\" was not injected: check your FXML file 'converter-view.fxml'.";
        assert txtBGN != null : "fx:id=\"txtBGN\" was not injected: check your FXML file 'converter-view.fxml'.";
        assert txtInterest != null : "fx:id=\"txtInterest\" was not injected: check your FXML file 'converter-view.fxml'.";

    }

}
