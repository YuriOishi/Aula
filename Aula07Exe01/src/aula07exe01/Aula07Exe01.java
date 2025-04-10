/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package aula07exe01;

/**
 *
 * @author unifyoishi
 */
public class Aula07Exe01 {

    public static void main(String[] args) {
        while (true){
            try{
                fazerOperacao();
                break;
            } catch (Exception e){
                System.out.println("Erro");
            }
        }
        System.out.println("Concluida");
    }
    
    static void fazerOperacao() throws Exception {
        if (Math.random() < 0.7) throw new Exception("Falhou");
    }
}
