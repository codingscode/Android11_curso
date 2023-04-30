
package p11_ifladdernestedif;
import java.util.Scanner;



public class ifladdernestedif2 {

   public static void main(String[] args) {
      Scanner numero = new Scanner(System.in);
      System.out.print("Digite 3 números: \n");
      int numero1, numero2, numero3, maiorNumero;
      
      numero1 = numero.nextInt();
      numero2 = numero.nextInt();
      numero3 = numero.nextInt();

      if (numero1 >= numero2) {
         if (numero1 >= numero3) {
            maiorNumero = numero1;
         }
         else {
            maiorNumero = numero3;
         }
      }
      else {
         if (numero2 >= numero3) {
            maiorNumero = numero2;
         }
         else {
            maiorNumero = numero3;
         }
      }
      System.out.println("Maior número é : " + maiorNumero);
      numero.close();
   }

}

/*
Digite 3 números: 
8
3
5
Maior número é : 8

*/

