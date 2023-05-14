
package p05_methods;


public class t2_overloading {

   public static void main(String[] args) {

      System.out.println("Soma dos numeros: " + soma(2, 3));
      System.out.println("Soma dos numeros: " + soma(2, 3, 4));
      System.out.println("Soma dos numeros: " + soma(2.4, 3.1));
   }

   public static int soma(int x, int y) {
      return x + y;
   }
   
   public static int soma(int x, int y, int z) {
      return x + y + z;
   }
   
   public static double soma(double x, double y) {
      return x + y;
   }
   
}

/*
Soma dos numeros: 5
Soma dos numeros: 9
Soma dos numeros: 5.5

*/
