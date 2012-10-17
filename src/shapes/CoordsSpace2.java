/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package shapes;

import javafx.scene.control.Control;
import javafx.scene.control.Skinnable;

public class CoordsSpace2 extends Control implements Skinnable {

    public CoordsSpace2() {
        setSkin(new CoordsSpace(this, -20, 100, 100, -20, 10));

    }
}
