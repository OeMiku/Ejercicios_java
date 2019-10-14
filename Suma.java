
package Suma;

import java.util.Scanner;


public class Suma {


    public static void main(String[] args) {
      Scanner imprimir = new Scanner (System.in);
       System.out.println("Imprime tu primer numero: ");
        int primernumero = imprimir.nextInt();
        System.out.println("Imprime tu segundo numero: ");
        int segundonumero = imprimir.nextInt();
        
       
        int resultado = primernumero + segundonumero;
  
        
         System.out.println();
        System.out.println("Es : " + resultado );
    }
    
}
