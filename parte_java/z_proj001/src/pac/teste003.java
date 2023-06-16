package pac;

import java.util.Locale;
import java.util.Scanner;

public class teste003 {

   public static void main(String[] args) {
      Locale.setDefault(Locale.US);
      
      String s1, s2, s3;
      
      Scanner entrada = new Scanner(System.in);
      
      s1 = entrada.nextLine();
      s2 = entrada.nextLine();
      s3 = entrada.nextLine();
      
      System.out.println("dados digitados:");
      System.out.println(s1);
      System.out.println(s2);
      System.out.println(s3);
      entrada.close();

   }

}
/*
aladin
mel
apolo
dados digitados:
aladin
mel
apolo
 
*/
