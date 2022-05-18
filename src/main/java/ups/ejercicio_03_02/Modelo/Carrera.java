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
public class Carrera {
    private String codigo;
    private String nombre;
    private String sede;
    private String campus;
    private String proyecto;
    private String modalidad;
    private ArrayList<Asignatura> listaAsignaturas;

    public Carrera(String codigo, String nombre, String sede, String campus, String proyecto, String modalidad) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.sede = sede;
        this.campus = campus;
        this.proyecto = proyecto;
        this.modalidad = modalidad;
    }

    public String getModalidad() {
        return modalidad;
    }

    public void setModalidad(String modalidad) {
        this.modalidad = modalidad;
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

    public String getSede() {
        return sede;
    }

    public void setSede(String sede) {
        this.sede = sede;
    }

    public String getCampus() {
        return campus;
    }

    public void setCampus(String campus) {
        this.campus = campus;
    }

    public String getProyecto() {
        return proyecto;
    }

    public void setProyecto(String proyecto) {
        this.proyecto = proyecto;
    }

    public ArrayList<Asignatura> getListaAsignaturas() {
        return listaAsignaturas;
    }

    public void setListaAsignaturas(ArrayList<Asignatura> listaAsignaturas) {
        this.listaAsignaturas = listaAsignaturas;
    }
    
    
}
