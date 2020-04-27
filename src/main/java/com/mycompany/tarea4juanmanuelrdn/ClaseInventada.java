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
public class ClaseInventada {
    private int atributo;
    private String inventado;

    public ClaseInventada(int atributo, String inventado) {
        this.atributo = atributo;
        this.inventado = inventado;
    }
    
    public ClaseInventada(){
        this.atributo = 2;
        this.inventado = "hola";
    }
}
