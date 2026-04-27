/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package campo_semna_03;

/**
 *
 * @author ALEXANDER
 */
public class Calculadora {
    
    public void sumar(int a, int b){
        
        int resultado = (a + b);
        System.out.println("La suma es: " + resultado);
    }


    public void multiplicar(int a, int b)
    {

    int resultado = (a * b);
    System.out.println("La multiplicación es: " + resultado);
    
    }
    
    public double division(double a, double b) {
    if (b == 0) {
        System.out.println("No se puede dividir entre 0");
        return 0;
    }
    return a / b;
}

}
    

