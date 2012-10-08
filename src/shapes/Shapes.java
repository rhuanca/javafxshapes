/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package shapes;

import javafx.application.Application;
import javafx.scene.Cursor;
import javafx.scene.Scene;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;
import javafx.stage.Stage;
/**
 *
 * @author rhuanca
 */
public class Shapes extends Application {

 /**
  * @param args the command line arguments
  */
 public static void main(String[] args) {
     launch(args);
 }
 
 @Override
 public void start(Stage primaryStage) {
     primaryStage.setTitle("Trilateration...");
     ShapeDisplay root = new ShapeDisplay();
     Scene scene = new Scene(root, 400, 300, Color.WHITE);
     scene.setCursor(Cursor.OPEN_HAND);
     Rectangle rectangle = new Rectangle(1000, 1000);
     rectangle.setFill(Color.WHITE);
     root.getChildren().add(rectangle);
     primaryStage.setScene(scene);
     primaryStage.show();
 }}
