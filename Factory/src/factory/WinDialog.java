/**
 * Gabriel P.
 * CPR Daniel Castelao
 * <gpietrafesavieitez@danielcastelao.org>
 */

package factory;

import javax.swing.JOptionPane;

public class WinDialog extends Dialogo {
    @Override
    public void mostrar(String str){
        JOptionPane.showMessageDialog(null, str);
    }
}