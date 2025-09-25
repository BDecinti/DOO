/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.ejemplo_semana6_2;

/**
 *
 * @author Cetecom
 */
public class Persona {
    
    int edad;
    String rut, nombre;

    public Persona() {
    }

    public Persona(int edad, String rut, String nombre) {
        this.edad = edad;
        this.rut = rut;
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getRut() {
        return rut;
    }

    public void setRut(String rut) {
        this.rut = rut;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public String toString() {
        return "Persona{" + "edad=" + edad + ", rut=" + rut + ", nombre=" + nombre + '}';
    }
    
    
    
}
