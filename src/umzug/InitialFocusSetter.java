/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package umzug;

import java.awt.Component;
import javax.swing.SwingUtilities;

/**
 *
 * @author beierleinmi
 */
public class InitialFocusSetter {

    public static void setInitialFocus(Component c) {

        final Component initComp;

        initComp = c;

        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                initComp.requestFocusInWindow();
            }
        });
     }

}
