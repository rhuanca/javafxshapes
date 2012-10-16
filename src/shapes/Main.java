/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package shapes;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

/**
 *
 * @author rhuanca
 */
public class Main extends Application {

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage stage) {
        stage.setTitle("Coordinates demonstration.");
        CoordsSpace2 spaceCoords = new CoordsSpace2();

        StackPane root = new StackPane();
        root.getChildren().add(spaceCoords);

        stage.setScene(new Scene(root, 300, 250));
        stage.show();
    }
}
