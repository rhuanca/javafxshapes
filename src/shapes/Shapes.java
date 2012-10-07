/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package shapes;

import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.paint.Color;
import javafx.scene.shape.Ellipse;
import javafx.scene.shape.EllipseBuilder;
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
     primaryStage.setTitle("Sample....");
     ShapeDisplay root = new ShapeDisplay();
     Scene scene = new Scene(root, 400, 300, Color.WHITE);
     Rectangle rectangle = new Rectangle(400, 300);
     rectangle.setFill(Color.WHITE);
     root.getChildren().add(rectangle);
     primaryStage.setScene(scene);
     primaryStage.show();
 }}
