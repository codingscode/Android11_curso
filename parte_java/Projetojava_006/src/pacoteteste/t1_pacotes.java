
package pacoteteste;

// Built-in package java.util
import java.util.Scanner;
// pacote definido pelo usuario
import p02_packageoperation.Multiplicar;


public class t1_pacotes {

   public static void main(String[] args) {
      Scanner entrada = new Scanner(System.in);
      System.out.println("Insira 2 números inteiros: ");
      int numero1 = entrada.nextInt();
      int numero2 = entrada.nextInt();
      Multiplicar obj = new Multiplicar();
      System.out.println("Resultado : " + obj.multiplicar(numero1, numero2));
      //System.out.println("Resultado de soma : " + obj.somar(numero1, numero2)); // dá erro não é visivel

      entrada.close();
   }

}

/*
Insira 2 números inteiros: 
2
3
Resultado : 6
 
*/

