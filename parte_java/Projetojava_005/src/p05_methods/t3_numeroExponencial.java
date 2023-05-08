
package p05_methods;
import java.util.Scanner;


public class t3_numeroExponencial {

   public static void main(String[] args) {
      Scanner entrada = new Scanner(System.in);
      System.out.println("Digite um numero inteiro base: ");
      int base = entrada.nextInt();
      System.out.println("Digite o expoente: ");
      int expoente = entrada.nextInt();
      
      for (int i=0; i<=expoente; i++) {
         System.out.printf("%d elevado a %d : %d \n", base, i, pow(base, i));
      }
      entrada.close();
   }

   public static int pow(int num, int exp) {
      return (int) Math.pow(num, exp);
   }
}

/*
Digite um numero inteiro base: 
3
Digite o expoente: 
4
3 elevado a 0 : 1 
3 elevado a 1 : 3 
3 elevado a 2 : 9 
3 elevado a 3 : 27 
3 elevado a 4 : 81 

*/


