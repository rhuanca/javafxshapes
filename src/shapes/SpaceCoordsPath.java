/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package shapes;

import com.sun.javafx.geom.PathIterator;
import com.sun.javafx.geom.RectBounds;
import com.sun.javafx.geom.transform.BaseTransform;
import javafx.geometry.Dimension2D;
import javafx.geometry.Point2D;
import javafx.scene.Node;
import javafx.scene.shape.*;

/**
 *
 * @author rhuanca
 */
public class SpaceCoordsPath extends Path  {

    MoveTo moveTo1 = new MoveTo();
    MoveTo moveTo2 = new MoveTo();
    LineTo lineTo1 = new LineTo();
    LineTo lineTo2 = new LineTo();
    
    public SpaceCoordsPath() {
        getElements().add(moveTo1);
        getElements().add(lineTo1);
        getElements().add(moveTo2);
        getElements().add(lineTo2);
        
    }
    
    public void update(Point2D center, Dimension2D dim) {
        moveTo1.setX(center.getX() - 10);
        moveTo1.setY(center.getY());
        
        lineTo1.setX(center.getX() + 10);
        lineTo1.setY(center.getY());
        
        moveTo2.setX(center.getX());
        moveTo2.setY(center.getY()-10);
        
        lineTo2.setX(center.getX());
        lineTo2.setY(center.getY()+10);
    }
}
