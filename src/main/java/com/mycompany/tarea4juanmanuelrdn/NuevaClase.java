/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.tarea4juanmanuelrdn;

/**
 *
 * @author Usuario
 */
public class NuevaClase {
    public static void main(String[] args) {
        ClaseInventada clase = new ClaseInventada(2,"hola");
        ClaseInventada claseUno = new ClaseInventada();

        System.out.println(clase.toString());
        System.out.println(claseUno.toString());
    }
}
