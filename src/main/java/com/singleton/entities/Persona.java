package com.singleton.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="Personas")
public class Persona {

    @Id
    @Column(name = "PersonaID")
    int PersonaId;

    @Column(name = "Nombre")
    String Nombre;

    @Column(name = "Genero")
    String Genero;

    @Column(name = "Edad")
    int Edad;

    @Column(name = "Identificacion")
    String Identificacion;

    @Column(name = "Direccion")
    String Direccion;

    @Column(name = "Telefono")
    String Telefono;

    public int getPersonaId() {
        return PersonaId;
    }

    public void setPersonaId(int personaId) {
        PersonaId = personaId;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String nombre) {
        Nombre = nombre;
    }

    public String getGenero() {
        return Genero;
    }

    public void setGenero(String genero) {
        Genero = genero;
    }

    public int getEdad() {
        return Edad;
    }

    public void setEdad(int edad) {
        Edad = edad;
    }

    public String getIdentificacion() {
        return Identificacion;
    }

    public void setIdentificacion(String identificacion) {
        Identificacion = identificacion;
    }

    public String getDireccion() {
        return Direccion;
    }

    public void setDireccion(String direccion) {
        Direccion = direccion;
    }

    public String getTelefono() {
        return Telefono;
    }

    public void setTelefono(String telefono) {
        Telefono = telefono;
    }
}
