/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package shapes;

import javafx.event.EventHandler;
import javafx.scene.Group;
import javafx.scene.input.MouseEvent;
import javafx.scene.paint.Color;
import javafx.scene.shape.*;

/**
 *
 * @author rhuanca
 */
public class ShapeDisplay extends Group {
    
    private double centerx, centery;
    private double offsetx, offsety;
    private Path path;
    
    public ShapeDisplay(){
        this.setOnMousePressed(new EventHandler<MouseEvent>(){

            @Override
            public void handle(MouseEvent t) {
                centerx = t.getX();
                centery = t.getY();
                
                path = new Path();
                
                MoveTo moveTo = new MoveTo();
                moveTo.setX(t.getX());
                moveTo.setY(t.getY());

                LineTo lineTo = new LineTo();
                lineTo.setX(t.getX());
                lineTo.setY(t.getY());
                
                path.getElements().add(moveTo);
                path.getElements().add(lineTo);
                path.setStrokeWidth(3);
                path.setStroke(Color.BLACK);
      
                getChildren().add(path);
            }
        });
        
        this.setOnMouseDragged(new EventHandler<MouseEvent>(){

            @Override
            public void handle(MouseEvent t) {
                LineTo lineTo = (LineTo)path.getElements().get(1);
                lineTo.setX(t.getX());
                lineTo.setY(t.getY());
                
                getChildren().remove(path);
                getChildren().add(path);
            }
        });
        
        this.setOnMouseReleased(new EventHandler<MouseEvent>() {

            @Override
            public void handle(MouseEvent t) {

                offsetx = t.getX();
                offsety = t.getY();
                getChildren().remove(path);
                drawCircle(centerx, centery, offsetx, offsety);
            }
        });
    }
    
    private void drawCircle(double centerx, double centery, double offsetx, double offsety) {
        double radious = Math.sqrt(Math.pow(offsetx-centerx, 2.0) + Math.pow(centery - offsety, 2.0));
        
        Circle circle = CircleBuilder.create()
             .centerX(centerx)
             .centerY(centery)
             .radius(radious)
             .strokeWidth(3)
             .stroke(Color.BLACK)
             .fill(null)
             .build();
        this.getChildren().add(circle);
    }
}

/*
 *
 * Notes:
 * 1. Mouse Event hanldling is different.
 * 2. Objects for shapes (no paint component)
 * 3. 
*/
