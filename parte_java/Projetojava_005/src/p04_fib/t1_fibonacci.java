package p04_fib;
import java.util.Scanner;


public class t1_fibonacci {

   public static void main(String[] args) {
      // sequencia Fibonacci : 0, 1, 1, 2, 3, 5, 8, 13, 21 ... 
      Scanner entrada = new Scanner(System.in);
      System.out.print("quantidade máxima para a sequencia: ");
      int numero = entrada.nextInt();
      int previoFib = 0, fibonacci = 1, soma = 0;
      for (int i=1; i<=numero; i++) {
         System.out.print(previoFib + " ");
         soma = previoFib + fibonacci;
         previoFib = fibonacci;
         fibonacci = soma;
      }
      entrada.close();
   }

}

/*
quantidade máxima para a sequencia: 10
0 1 1 2 3 5 8 13 21 34 
*/
