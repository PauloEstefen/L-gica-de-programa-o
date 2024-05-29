/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pkg01.aula.operadores;

public class AulaOperadores {


    public static void main(String[] args) {
    // ARITMÉTICOS
    int a = 10 + 1;
    int b = a - 10;
    int c = b * 3;
    int d = c / 2;
    double e = 4.5 + 1.7;
    
    System.out.println("O valor A: " + a);
    
        
    
    a += 10;
    b -= 1;    
    c *= 5;
    d /= 1;

        System.out.println("O valor A: " + a);
        System.out.println("O valor B: " + b);
        System.out.println("O valor C: " + c);
        System.out.println("O valor D: " + d);
        System.out.println("O valor E: " + e);
        
        //------------------------------------
        // LÓGICOS
        
    boolean ehMaior = a > 20;
    boolean ehMenor = 10 < 20;
    boolean ehMenorIgual = 10 <= 20;
    boolean ehMaiorIgual = 10 >= 20;
    boolean ehIgual = 10 == 10;
    boolean ehDiferente = 10 != 20;
        
        System.out.println("Maior: " + ehMaior);
        System.out.println("Menor: " +ehMenor);
        System.out.println("Menor Igual: " + ehMenorIgual);
        System.out.println("Maior Igual: " + ehMaiorIgual);
        System.out.println("Igual: " + ehIgual);
        System.out.println("Diferente: " + ehDiferente);
       
    
    
    } 
}
