package pac;

import java.util.Locale;
import java.util.Scanner;

public class teste004 {

   public static void main(String[] args) {
      Locale.setDefault(Locale.US);
      
      int inteiro;
      String s1, s2, s3;
      
      Scanner entrada = new Scanner(System.in);
      
      inteiro = entrada.nextInt();
      entrada.nextLine(); // evita erro
      s1 = entrada.nextLine();
      s2 = entrada.nextLine();
      s3 = entrada.nextLine();
      
      System.out.println("dados digitados:");
      System.out.println(inteiro);
      System.out.println(s1);
      System.out.println(s2);
      System.out.println(s3);
      entrada.close();

   }

}
/*
3
mel
aladin
apolo
dados digitados:
3
mel
aladin
apolo

 
*/
