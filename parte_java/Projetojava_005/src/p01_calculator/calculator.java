
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
      
      System.out.printf("%d + %d = %.2f", numero1, numero2, resultado);
      
      entrada.close();

   }

}

/*
------ CALCULATOR ------
Digite dois numeros inteiros:
3
4
Escolha uma operação (+, -, *, /, %) : 
+
3 + 4 = 7,00


------ CALCULATOR ------
Digite dois numeros inteiros:
3
4
Escolha uma operação (+, -, *, /, %) : 
*
3 + 4 = 12,00


------ CALCULATOR ------
Digite dois numeros inteiros:
17
6
Escolha uma operação (+, -, *, /, %) : 
%
17 + 6 = 5,00


------ CALCULATOR ------
Digite dois numeros inteiros:
8
3
Escolha uma operação (+, -, *, /, %) : 
&
Operador Inválido!


*/

