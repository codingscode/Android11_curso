
package p11_ifladdernestedif;
import java.util.Scanner;



public class ifladdernestedif {

   public static void main(String[] args) {
      Scanner idade = new Scanner(System.in);
      System.out.print("Digite sua idade: ");
      int suaIdade = idade.nextInt();
      
      if (suaIdade < 12) {
         System.out.println("Você é criança");
      }
      else if (suaIdade < 18) {
         System.out.println("Você é adolescente");
      }
      else {
         if (suaIdade < 65) {
            System.out.println("Você é adulto");
         }
         else {
            System.out.println("Você é idoso");
         }
      }
      
      idade.close();
   }

}

/*
Digite sua idade: 21
Você é adulto


*/
