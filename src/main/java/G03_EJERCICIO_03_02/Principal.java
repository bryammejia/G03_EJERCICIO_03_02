
package G03_EJERCICIO_03_02;

import java.awt.Color;

/**
 *
 * @author USER
 */
public class Principal {
    public static void main(String[] args) {
        
        var v1 = new Ventana1("INSCRIBETE");
        var v2 = new Ventana2("DATOS PERSONALES");
        var v3 = new Ventana3("INFORMACION DE LA CARRERA");
        var v4 = new Ventana4("CREAR GRUPO");
        var v5 = new Ventana5("VENTANA");
   
        v1.setVisible(true);
        v2.setVisible(true);
        v3.setVisible(true);
        v4.setVisible(true);
        v5.setVisible(true);
        
        
    }
}

