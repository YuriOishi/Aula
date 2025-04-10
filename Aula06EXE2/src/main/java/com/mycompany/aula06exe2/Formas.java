/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.aula06exe2;

/**
 *
 * @author unifyoishi
 */
public abstract class Formas {
    private String tipo;

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getTipo() {
        return tipo;
    }
    
    public abstract double perimetro();
    
    public void print(){
        System.out.printf("\nTipo %s", this.tipo);
    }
}
