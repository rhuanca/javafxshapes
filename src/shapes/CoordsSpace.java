/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package shapes;

import javafx.scene.Node;
import javafx.scene.control.Control;
import javafx.scene.control.Skin;
import javafx.scene.control.Skinnable;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.StackPane;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Line;
import javafx.scene.text.Text;

/**
 *
 * @author rhuanca
 */
public class CoordsSpace implements Skin<Skinnable> {

    private double left;
    private double top;
    private double right;
    private double bottom;
    private double delta;
    
    private Control control;
    private BorderPane root;
    Line xLine;
    Line yLine;

    public CoordsSpace(Control control, double left, double top, double right, double bottom, double delta) {
        this.control = control;
        this.left = left;
        this.top = top;
        this.right = right;
        this.bottom = bottom;
        this.delta = delta;

        root = new BorderPane();

        xLine = new Line();
        yLine = new Line();

        root.getChildren().add(xLine);
        root.getChildren().add(yLine);
        
        
        root.getChildren().add(new Circle(0, 0, 50));
        
    }


    @Override
    public Node getNode() {
        
        
        double xScale = control.getWidth()/(right - left);
        double yScale = control.getHeight()/(top - bottom) ;
        
        
        
        
        xLine.setStartX(0);
        xLine.setStartY(control.getHeight() - (-bottom*yScale));
        
        xLine.setEndX(control.getWidth());
        xLine.setEndY(control.getHeight() - (-bottom*yScale));

        yLine.setStartX(-left*xScale);
        yLine.setStartY(0);
        yLine.setEndX(-left*xScale);
        yLine.setEndY(control.getHeight());
        
        return root;
    }

    @Override
    public Skinnable getSkinnable() {
        return control;
    }

    @Override
    public void dispose() {
    }
}
