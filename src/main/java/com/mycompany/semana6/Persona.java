/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.semana6;

/**
 *
 * @author ASUS
 */
public class Persona {
  private String nombre;
    private int edad;
    public String ciudad;
public Persona(String nombre, int edad, String ciudad){
    this.nombre = nombre;
    this.edad = edad;
    this.ciudad = ciudad;      
}
public void mostrarinformacion(){
    System.out.println("nombre" +nombre+ "edad" +edad+ "ciudad" +ciudad);
}    

    void mostarinformacion() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}   

