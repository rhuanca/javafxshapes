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
     
     CoordsDisplay coords = new CoordsDisplay(-100, 500, 500, -100, true);
     Scene scene = new Scene(coords, 700, 700, Color.WHITE);
     primaryStage.setScene(scene);
     primaryStage.show();
     coords.init();
 }}
