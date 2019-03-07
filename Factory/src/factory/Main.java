/**
 * Gabriel P.
 * CPR Daniel Castelao
 * <gpietrafesavieitez@danielcastelao.org>
 */

package factory;

public class Main {

    public static void main(String[] args) {
        Dialogo d1 = Dialogo.crearDialogo(Dialogo.Tipo.CONSOLA);
        d1.mostrar("Este mensaje se debería mostrar por consola.");
        
        Dialogo d2 = Dialogo.crearDialogo(Dialogo.Tipo.VENTANA);
        d2.mostrar("Este mensaje se debería mostrar por ventana");
    }
}
