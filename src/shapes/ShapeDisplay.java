/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package shapes;

import com.sun.javafx.sg.StrokedBorder;
import java.awt.Stroke;
import javafx.event.EventHandler;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.input.MouseEvent;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.scene.shape.StrokeType;
import org.omg.PortableInterceptor.SYSTEM_EXCEPTION;

/**
 *
 * @author rhuanca
 */
public class ShapeDisplay extends Group {
    
    private double centerx, centery;
    private double offsetx, offsety;
    
    
    public ShapeDisplay(){
        this.setOnMousePressed(new EventHandler<MouseEvent>(){

            @Override
            public void handle(MouseEvent t) {
                System.out.println(">>> t.getEventType() = " + t.getEventType());
                centerx = t.getX();
                centery = t.getY();
                System.out.println(">>>centerx = " + centerx + ", centery = " + centery);
            }
        });
        
        this.setOnMouseReleased(new EventHandler<MouseEvent>() {

            @Override
            public void handle(MouseEvent t) {
                System.out.println(">>> t.getEventType() = " + t.getEventType());

                offsetx = t.getX();
                offsety = t.getY();
                System.out.println(">>>offsetx = " + offsetx + ", offsety = " + offsety);
                drawCircle(centerx, centery, offsetx, offsety);
            }

        });
    }
    
    private void drawCircle(double centerx, double centery, double offsetx, double offsety) {
        double radious = Math.sqrt(Math.pow(offsetx-centerx, 2.0) + Math.pow(centery - offsety, 2.0));
        final Circle circle = new Circle();
        circle.setCenterX(centerx);
        circle.setCenterY(centery);
        circle.setRadius(radious);
        circle.setFill(Color.WHITE);
        circle.setStrokeType(StrokeType.INSIDE);
        circle.setStroke(Color.web("white", 0.16));
        circle.setStrokeWidth(4);
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
