package problem2;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.TextInputDialog;
import javafx.stage.Stage;

import java.util.Optional;

public class StockTest extends Application {

    @Override
    public void start(Stage primaryStage) {
        String symbol = null;
        String name = null;
        TextInputDialog dialog = new TextInputDialog();
        dialog.setTitle("Symbol input dialog");
        dialog.setContentText("Please enter a symbol:");
        Optional<String> result = dialog.showAndWait();
        if (result.isPresent()) {
            symbol = result.get();
        }

        dialog.setTitle("Name input dialog");
        dialog.setContentText("Please enter a name:");
        result = dialog.showAndWait();
        if (result.isPresent()) {
            name = result.get();
        }

        Stock stock = new Stock(symbol, name);
        stock.setPreviousClosingPrice(12.7);
        stock.setCurrentPrice(20.9);
        System.out.printf("Name of the stock: %s%n" +
                "Symbol of the stock: %s%n" +
                "Previous closing price: %.2f%n" +
                "Current price: %.2f%n" +
                "Change: %.2f%n",
                stock.getName(),
                stock.getSymbol(),
                stock.getPreviousClosingPrice(),
                stock.getCurrentPrice(),
                stock.changePercent());

    }


    public static void main(String[] args) {
        launch(args);
    }
}
