
package p10_makedecision;

import java.util.Scanner;


public class ifelsestatement {

   public static void main(String[] args) {
      Scanner entradaNumero = new Scanner(System.in);
      System.out.println("Digite um número: ");
      int numero = entradaNumero.nextInt();
      
      if (numero % 2 == 0) {
         System.out.println("Número é par");
      }
      else {
         System.out.println("Número é impar");
      }
      entradaNumero.close();

   }

}

/*
Digite um número: 
8
Número é par

*/
