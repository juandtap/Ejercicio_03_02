/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ups.ejercicio_03_02.Modelo;

/**
 *
 * @author Diego
 */
public class Grupo {
    private String codigo;
    private String nombre;
    private int numero;
    private int cupos;
    private boolean autorizacionCalificacion100;

    public Grupo(String codigo, String nombre, int numero, int cupos, boolean autorizacionCalificacion100) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.numero = numero;
        this.cupos = cupos;
        this.autorizacionCalificacion100 = autorizacionCalificacion100;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public int getCupos() {
        return cupos;
    }

    public void setCupos(int cupos) {
        this.cupos = cupos;
    }

    public boolean isAutorizacionCalificacion100() {
        return autorizacionCalificacion100;
    }

    public void setAutorizacionCalificacion100(boolean autorizacionCalificacion100) {
        this.autorizacionCalificacion100 = autorizacionCalificacion100;
    }
    
    
}
