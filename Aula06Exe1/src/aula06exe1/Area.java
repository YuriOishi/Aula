
package aula06exe1;

public class Area {
    public void imprimirArea(double lado){
        System.out.printf("Area do quadrado: %.2f\n", Math.pow(lado, 2));
    }
    
     public void imprimirArea(double lado1, double lado2){
        System.out.printf("Area do retangulo: %.2f\n", lado1 * lado2);
    }
}
