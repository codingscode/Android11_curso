
package p08_opr_condicionais;



public class operadores_condicionais {
   public static void main(String[] args) {
      int numero1 = 5, numero2 = 8, numero3 = 12;
      boolean resultado;
      
      // AND
      resultado = (numero1 > numero2) && (numero3 > numero1);
      System.out.println("resultado: " + resultado);
      
      // OR
      resultado = (numero1 > numero2) || (numero3 > numero2);
      System.out.println("resultado: " + resultado);
            
      // Operador ternario
      resultado = numero1 < numero2 ? true : false;
      System.out.println("resultado: " + resultado);
      
   }

}

/*
resultado: false
resultado: true
resultado: true


*/

