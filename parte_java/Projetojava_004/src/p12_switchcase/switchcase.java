
package p12_switchcase;
import java.util.Scanner;



public class switchcase {

   public static void main(String[] args) {
      Scanner numero = new Scanner(System.in);
      System.out.println("Digite um numero da semana:");
      int numeroDia = numero.nextInt();
      String dia;
      
      switch (numeroDia) {
         case 1:
            dia = "Domingo";
            break;
         case 2:
            dia = "Segunda";
            break;
         case 3:
            dia = "Terça";
            break;
         case 4:
            dia = "Quarta";
            break;
         case 5:
            dia = "Quinta";
            break;
         case 6:
            dia = "Sexta";
            break;
         case 7:
            dia = "Sábado";
            break;
         default:
            dia = "valor incorreto";
            break;
      }
      
      System.out.println("Dia : " + dia);
      numero.close();
   }

}
/*
Digite um numero da semana:
3
Dia : Terça

*/

