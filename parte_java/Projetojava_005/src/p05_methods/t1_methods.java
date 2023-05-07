
package p05_methods;
import java.util.Scanner;


public class t1_methods {

   public static void main(String[] args) {
      Scanner entrada = new Scanner(System.in);
      System.out.print("Digite 2 números: ");
      int numero1 = entrada.nextInt();
      int numero2 = entrada.nextInt();
      mostrar(numero1, numero2);
      int a = somar(numero1, numero2);
      int b = minimo(numero1, numero2);
      System.out.printf("\nSoma dos numeros: %d\n", a);
      System.out.printf("Mínimo dos numeros: %d\n", b);
      entrada.close();
   }

   public static void mostrar(int num1, int num2) {
      System.out.printf("Voce digitou : %d e %d", num1, num2);
   }

   public static int somar(int num1, int num2) {
      int soma = 0;
      soma = num1 + num2;
      return soma;
   }
   
   public static int minimo(int num1, int num2) {
      int min;
      if (num1 > num2) {
         min = num2;
      }
      else {
         min = num1;
      }
      return min;
   }

}

/*
Digite 2 números: 4 3
Voce digitou : 4 e 3
Soma dos numeros: 7
Mínimo dos numeros: 3

*/

