/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ups.ejercicio_03_02.Modelo;

import java.util.ArrayList;

/**
 *
 * @author Diego
 */
public class Asignatura {
    private String codigo;
    private String nombre;
    private ArrayList<Grupo> listaGrupos;
    private boolean cambioGrupo;

    public Asignatura(String codigo, String nombre, boolean cambioGrupo) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.cambioGrupo = cambioGrupo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public ArrayList<Grupo> getListaGrupos() {
        return listaGrupos;
    }

    public void setListaGrupos(ArrayList<Grupo> listaGrupos) {
        this.listaGrupos = listaGrupos;
    }

    public boolean isCambioGrupo() {
        return cambioGrupo;
    }

    public void setCambioGrupo(boolean cambioGrupo) {
        this.cambioGrupo = cambioGrupo;
    }
    
    
    
}
