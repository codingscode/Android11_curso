
package p04_nestedclass;



public class T1_innerClassExemplo {
   static int a = 5;
   private static int b = 10;
   int c = 15;
   
   class InnerClass {
      void mostrar() {
         System.out.println("a = " + a);
         System.out.println("b = " + b);
         System.out.println("c = " + c); // podemos acessar a variavel não estática
      }
   }


}

