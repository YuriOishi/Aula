/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.aula06exe2;

/**
 *
 * @author unifyoishi
 */
public class Retangulo extends Formas{
    private double comprimento;
    private double largura;

    public double getLargura() {
        return largura;
    }

    public void setLargura(double largura) {
        this.largura = largura;
    }

    public double getComprimento() {
        return comprimento;
    }

    public void setComprimento(double comprimento) {
        this.comprimento = comprimento;
    }

    @Override
    public double perimetro() {
        return 2 * this.comprimento + 2 * this.largura;
    }

    @Override
    public void print() {
        super.print(); 
        System.out.printf(
                "\nComprimento: %.2f\nLargura: %.2f\nPerimetro: %.2f", 
                this.comprimento, this.largura, this.perimetro());
    }
    
    
}
