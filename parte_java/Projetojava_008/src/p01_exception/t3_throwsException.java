
package p01_exception;



public class t3_throwsException {

   public static void dividir() throws ArithmeticException, NumberFormatException {
      int a = Integer.parseInt("8b"); // 8b
      int b = Integer.parseInt("0");
      int c = a / b;
      System.out.println("Resultado : " + c);
   }

   public static void main(String[] args) {
      try {
         dividir();
      }
      catch (NumberFormatException e) {
         System.out.println("formáto inválido de número");
      }
      catch(ArithmeticException e) {
         System.out.println("Você não pode dividir numero por 0");
      }

   }

}
/*
formáto inválido de número

-------------------------------------
Você não pode dividir numero por 0



*/
