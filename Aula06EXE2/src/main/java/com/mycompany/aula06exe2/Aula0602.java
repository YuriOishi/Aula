/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.aula06exe2;

import java.util.ArrayList;

/**
 *
 * @author unifyoishi
 */
public class Aula0602 {
    public static void main(String[] args) {
        ArrayList<Formas> formas = new ArrayList<>();
        formas.add(new Circulo());
        formas.add(new Retangulo());
        
        formas.get(0).setTipo("circulo");
        ((Circulo)formas.get(0)).setRaio(8.7);
        
        formas.get(1).setTipo("retangulo");
        ((Retangulo)formas.get(1)).setComprimento(5.4);
        ((Retangulo)formas.get(1)).setLargura(7.2);
        
        formas.get(0).print();
        formas.get(1).print();
    }
}
