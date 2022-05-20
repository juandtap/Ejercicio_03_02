/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package ups.ejercicio_03_02;

/**
 *
 * @author diego
 */
public class Ejercicio_03_02 {

    public static void main(String[] args) {
        var v3 = new Ventana01(" INSCRIBETE");
        v3.setVisible(true);
        
        var ventana04 = new Ventana04("CREAR GRUPO");
        ventana04.setVisible(true);
        
        
        var ventana05 = new Ventana05("Ventana Informacion");
        ventana05.setVisible(true);
        var v = new Ventana01(" INSCRIBETE");
        v.setVisible(true);
        
        var v1 = new Ventana02("  INFORMACION DE CARRERA  ");
        v1.setVisible(true);
        
        var v2 = new Ventana03("  DATOS PERSONALES  ");
        v2.setVisible(true);
    }
}
