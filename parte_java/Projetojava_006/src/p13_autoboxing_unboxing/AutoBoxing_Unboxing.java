
package p13_autoboxing_unboxing;


public class AutoBoxing_Unboxing {

   public static void main(String[] args) {
      Double db = 12.8; // Auto-boxing of double
      double d = db; // Auto-unboxing of Double
      System.out.printf("%.2f %.2f\n", db, d);
      
      Integer in = 5; // Auto-boxing of int
      int i = in; // Auto-unboxing of Integer
      System.out.printf("%d %d\n", in, i);
      
      Character ch = 'b'; // Auto-boxing of char
      char c = ch; // Auto-unboxing of Character
      System.out.printf("%c %c\n", ch, c);
      

   }

}
/*


*/
