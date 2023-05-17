
package p04_stringreverse;
import java.util.Scanner;



public class t1_teste {

   public static void main(String[] args) {
      Scanner entrada = new Scanner(System.in);
      System.out.println("Digite uma string: ");
      String string = entrada.nextLine();
      int comprimento = string.length();
      
      String stringReversa = "";
      for (int i=comprimento -1; i>=0 ; i--) {
         stringReversa = stringReversa + string.charAt(i);
      }

      System.out.println("String reversa é : " + stringReversa);
      entrada.close();
   }

}
/*
Digite uma string: 
Java é fácil
String reversa é : licáf é avaJ

*/
