/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.aula06exe2;

/**
 *
 * @author unifyoishi
 */
public class Circulo extends Formas{
    private double raio;

    public double getRaio() {
        return raio;
    }

    public void setRaio(double raio) {
        this.raio = raio;
    }

    @Override
    public double perimetro() {
        return 2 * raio * Math.PI; 
    }
    
    public double area(){
        return Math.PI * Math.pow(this.raio, 2);
    }

    @Override
    public void print() {
        super.print();
        System.out.printf(
                "\nArea: %.2f\nRaio: %.2f\nPerimetro: %.2f", 
                this.area(),
                this.raio,
                this.perimetro()
        );
    }
    
    
}
