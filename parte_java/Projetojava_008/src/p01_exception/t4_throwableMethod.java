
package p01_exception;



public class t4_throwableMethod {
   public static double dividir(double x, double y) {
      if (y == 0) {
         throw new ArithmeticException("ArithmeticException ocorreu."); // throw new ArithmeticException();
      }
      return x/y;
   }

   public static void main(String[] args) {
      double d;
      try {
         d = dividir(5.6, 0);
      }
      catch(ArithmeticException e) {
         System.out.println("divisor não pode ser igual a 0");
         // useful Throwable methods
         System.out.println(e.getMessage());
         System.out.println(e.toString());
         e.printStackTrace();
      }

   }

}
/*
divisor não pode ser igual a 0
null

----------------------------
divisor não pode ser igual a 0
ArithmeticException ocorreu.

----------------------------------
divisor não pode ser igual a 0
ArithmeticException ocorreu.
java.lang.ArithmeticException: ArithmeticException ocorreu.

------------------------------------
divisor não pode ser igual a 0
ArithmeticException ocorreu.
java.lang.ArithmeticException: ArithmeticException ocorreu.
java.lang.ArithmeticException: ArithmeticException ocorreu.
	at p01_exception.t4_throwableMethod.dividir(t4_throwableMethod.java:9)
	at p01_exception.t4_throwableMethod.main(t4_throwableMethod.java:17)






*/
