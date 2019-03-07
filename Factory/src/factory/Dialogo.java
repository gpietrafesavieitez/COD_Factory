/**
 * Gabriel P.
 * CPR Daniel Castelao
 * <gpietrafesavieitez@danielcastelao.org>
 */

package factory;

public abstract class Dialogo implements IDialogable {

    @Override
    public abstract void mostrar(String str);
    
    enum Tipo {CONSOLA,VENTANA};
    
    public static Dialogo crearDialogo(Tipo tipo){
        switch(tipo){
            case CONSOLA:
                return new ConsDialog();
            case VENTANA:
                return new WinDialog();
            default:
                return null;
        }
    }
}