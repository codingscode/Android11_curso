
package p01_exception;



public class t2_throw_exception {

   public static double dividir(double x, double y) {
      if (y == 0) {
         throw new ArithmeticException("Divisor não ser igual a 0!");
      }
      return x / y;
   }

   public static void main(String[] args) {
      double d;
      try {
         d = dividir(8.5, 3.4); // d = dividir(8.5, 0);
         System.out.println("Resultado : " + d);
      }
      catch (ArithmeticException e) {
         System.out.println(e);
      }
      

   }

}
/*
Exception in thread "main" java.lang.ArithmeticException: Divisor não ser igual a 0!
	at p01_exception.t2_throw_exception.dividir(t2_throw_exception.java:10)
	at p01_exception.t2_throw_exception.main(t2_throw_exception.java:17)
	
------------
sem try catch

java.lang.ArithmeticException: Divisor não ser igual a 0!

------------------

Resultado : 2.5

	
	
*/
