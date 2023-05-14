
package operadores;


public class operadores {

   public static void main(String[] args) {
      double numero1 = 8.6, numero2 = 3.2, resultado = 0.0;
      resultado = numero1 + numero2;
      
      System.out.printf("numero1 + numero2: %.2f\n", resultado);
      
      resultado = numero1 - numero2;
      System.out.printf("numero1 - numero2: %.2f\n", resultado);      		
      
      resultado = numero1 * numero2;
      System.out.printf("numero1 * numero2: %.2f\n", resultado);      		
      
      resultado = numero1 / numero2;
      System.out.printf("numero1 / numero2: %.2f\n", resultado);
      
      resultado = numero1 % numero2;
      System.out.printf("numero1 %% numero2: %.2f\n", resultado);

   }

}
/*
numero1 + numero2: 11,80
numero1 - numero2: 5,40
numero1 * numero2: 27,52
numero1 / numero2: 2,69
numero1 % numero2: 2,20

*/
