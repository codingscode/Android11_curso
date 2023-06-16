package pac;

import java.util.Locale;

public class teste001 {

   public static void main(String[] args) {

      float a = 3.2f;
      double x = 10.35784;
      int b = 4;
      
      
      
      
      System.out.println(x);
      System.out.printf("%.2f%n", x);
      System.out.printf("%.4f%n", x);
      Locale.setDefault(Locale.US);
      
      System.out.printf("%.4f%n", x);
      System.out.println(a);


   }

}
