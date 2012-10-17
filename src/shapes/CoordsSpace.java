/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package shapes;

import javafx.geometry.Point2D;
import javafx.geometry.Dimension2D;
import javafx.scene.Node;
import javafx.scene.control.Control;
import javafx.scene.control.Skin;
import javafx.scene.control.Skinnable;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.StackPane;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Line;
import javafx.scene.shape.PathBuilder;
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

    SpaceCoordsPath coordsPath;
            
    public CoordsSpace(Control control, double left, double top, double right, double bottom, double delta) {
        this.control = control;
        this.left = left;
        this.top = top;
        this.right = right;
        this.bottom = bottom;
        this.delta = delta;

        root = new BorderPane();
        coordsPath = new SpaceCoordsPath();

        root.getChildren().add(coordsPath);

        root.setScaleY(-1);
        root.setTranslateY(root.getHeight());
        
    }


    @Override
    public Node getNode() {
        double xScale = control.getWidth()/(right - left);
        double yScale = control.getHeight()/(top - bottom) ;
        coordsPath.update(new Point2D(-left*xScale, -bottom*yScale), new Dimension2D(control.getWidth(), control.getHeight()));
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
