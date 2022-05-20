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
        var v = new Ventana01(" INSCRIBETE");
        v.setVisible(true);
        
        var v1 = new Ventana02("  INFORMACION DE CARRERA  ");
        v1.setVisible(true);
        
        var v2 = new Ventana03("  DATOS PERSONALES  ");
        v2.setVisible(true);
    }
}
