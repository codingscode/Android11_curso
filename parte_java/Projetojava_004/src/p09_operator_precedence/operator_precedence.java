
package p09_operator_precedence;


public class operator_precedence {

   public static void main(String[] args) {
      int resultado = 5 + 2 * 4;
      System.out.println("resultado : " + resultado);
      
      resultado = (5 + 2) * 4;
      System.out.println("resultado : " + resultado);
      
      int x = 8, y = 4, z = 2, soma = 0;
      soma = x + --y + --z;
      System.out.println("soma : " + soma);
      
   }

}

/*
resultado : 13
resultado : 28
soma : 12

*/
