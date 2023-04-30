package p06_operadores_unarios;



public class unarios {

   public static void main(String[] args) {
      double numero = 7.6;
      boolean verificado = true;
      
      System.out.println("+numero = "+ +numero);
      System.out.println("-numero = "+ -numero);
      System.out.println("++numero = "+ ++numero);
      System.out.println("--numero = "+ --numero);
      System.out.println("!verificado = "+ !verificado);
      
      System.out.println("---------------------------");
      double resultado = 4.7;
      System.out.println("resultado++ : "+ resultado++); // opera depois
      System.out.println("resultado : "+ resultado);
      System.out.println("++resultado : "+ ++resultado); // opera de imediato
      System.out.println("resultado : "+ resultado);

   }

}

/*
+numero = 7.6
-numero = -7.6
++numero = 8.6
--numero = 7.6
!verificado = false
---------------------------
resultado++ : 4.7
resultado : 5.7
++resultado : 6.7
resultado : 6.7


*/

