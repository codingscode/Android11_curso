
package p01_calculator;
import java.util.Scanner;


public class calculator {

   public static void main(String[] args) {
      Scanner entrada = new Scanner(System.in);
      System.out.println("------ CALCULATOR ------");
      System.out.println("Digite dois numeros inteiros:");
      int numero1 = entrada.nextInt();
      int numero2 = entrada.nextInt();
      
      System.out.println("Escolha uma operação (+, -, *, /, %) : ");
      char operador = entrada.next().charAt(0);
      double resultado = 0.0;

      switch (operador) {
         case '+':
            resultado = numero1 + numero2;
            break;
         case '-':
            resultado = numero1 - numero2;
            break;
         case '*':
            resultado = numero1 * numero2;
            break;
         case '/':
            resultado = numero1 / numero2;
            break;
         case '%':
            resultado = numero1 % numero2;
            break;
         default:
            System.out.println("Operador Inválido!");
            return;
      }
      
      System.out.printf("%d %c %d = %.2f", numero1, operador, numero2, resultado);
      
      entrada.close();
   }

}

/*
------ CALCULATOR ------
Digite dois numeros inteiros:
2 3
Escolha uma operação (+, -, *, /, %) : 
*
2 * 3 = 6,00

------ CALCULATOR ------
Digite dois numeros inteiros:
4 5
Escolha uma operação (+, -, *, /, %) : 
+
4 + 5 = 9,00

------ CALCULATOR ------
Digite dois numeros inteiros:
12 5
Escolha uma operação (+, -, *, /, %) : 
%
12 % 5 = 2,00
*/

