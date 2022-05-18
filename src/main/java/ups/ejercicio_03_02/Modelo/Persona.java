/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ups.ejercicio_03_02.Modelo;

import javax.xml.crypto.Data;

/**
 *
 * @author diego
 */
public class Persona {
    private String cedula;
    private String nombre;
    private String nacionalidad;
    private String genero;
    private String email;
    private Data fechaNacimiento;
    private String telefonoDomicilio;
    private String telefonoCelular;

    public Persona(String cedula, String nombre, String nacionalidad, String genero, String email, Data fechaNacimiento, String telefonoDomicilio, String telefonoCelular) {
        this.cedula = cedula;
        this.nombre = nombre;
        this.nacionalidad = nacionalidad;
        this.genero = genero;
        this.email = email;
        this.fechaNacimiento = fechaNacimiento;
        this.telefonoDomicilio = telefonoDomicilio;
        this.telefonoCelular = telefonoCelular;
    }

    public String getCedula() {
        return cedula;
    }

    public void setCedula(String cedula) {
        this.cedula = cedula;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getNacionalidad() {
        return nacionalidad;
    }

    public void setNacionalidad(String nacionalidad) {
        this.nacionalidad = nacionalidad;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Data getFechaNacimiento() {
        return fechaNacimiento;
    }

    public void setFechaNacimiento(Data fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }

    public String getTelefonoDomicilio() {
        return telefonoDomicilio;
    }

    public void setTelefonoDomicilio(String telefonoDomicilio) {
        this.telefonoDomicilio = telefonoDomicilio;
    }

    public String getTelefonoCelular() {
        return telefonoCelular;
    }

    public void setTelefonoCelular(String telefonoCelular) {
        this.telefonoCelular = telefonoCelular;
    }
    
    
    
}
