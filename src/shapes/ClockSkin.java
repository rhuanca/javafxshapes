/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package shapes;

import javafx.scene.Node;
import javafx.scene.control.Skin;
import javafx.scene.control.Skinnable;
import javafx.scene.layout.StackPane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;

/**
 *
 * @author rhuanca
 */
public class ClockSkin implements Skin<Skinnable> {

    
    
    private CoordsSpace2 skinable;
    private StackPane root;
    private Circle cirlce;

    public ClockSkin(CoordsSpace2 clock) {
        skinable = clock;
        root = new StackPane();
        cirlce = new Circle();
        cirlce.setFill(Color.BLACK);
        root.getChildren().add(cirlce);
    }

    @Override
    public void dispose() {
        
    }

    @Override
    public Node getNode() {
        double w = skinable.getWidth();
        double h = skinable.getHeight();
        cirlce.setCenterX(w / 2);
        cirlce.setCenterY(h / 2);
        double r = w;
        if (h < r) {
            r = h;
        }
        cirlce.setRadius(r / 3);
        return root;
    }

    @Override
    public CoordsSpace2 getSkinnable() {
        return skinable;
    }
}
