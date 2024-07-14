package problem1;

import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.paint.Color;
import javafx.scene.shape.Line;
import javafx.stage.Stage;

public class DrawMesh extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception {
        Group group = new Group();

        double width = 300; //Scene width
        double height = 300; // Scene height

        int numberOfLines = 15; //number of lines we're going to draw
        double step = width / numberOfLines; //distance between lines
        // (since width=height we don't need to variables for distance)

        Line line;
        for (int i = 0; i < numberOfLines; i++) {
            line = new Line(0, 0, (i + 1) * step / 1.1, (height - step * (i)) / 1.1);
            //calculate x and y of starting and ending point of the line
            //using the number of line we are on and the distance
            line.setStroke(Color.BLUE); //changing line color
            line.setStrokeWidth(2); //changing line width
            group.getChildren().add(line); //adding line to group


        }


        //creating 2 diagonals
        /*Line line1 = new Line(0,0,width,height);
        Line line2 = new Line(0,height,width,0);

        line1.setStroke(Color.BLUE);
        line2.setStroke(Color.RED);

        line1.setStrokeWidth(5);
        group.getChildren().addAll(line1,line2); //adding more than one object to group
        */


        Scene scene = new Scene(group, width, height);
        //creating scene with added lines and initialized width and height.
        //scene.setFill(Color.BLACK); //changing background color of scene


        primaryStage.setTitle("Draw mesh");
        primaryStage.setScene(scene);
        primaryStage.show();


    }

    public static void main(String[] args) {
        launch(args);
    }

}