package pac;

import java.util.Locale;
import java.util.Scanner;

public class teste002 {

   public static void main(String[] args) {
      Locale.setDefault(Locale.US);
      String umastring;
      int numero;
      double numero2;
      char caractere;
      Scanner entrada = new Scanner(System.in);
      
      System.out.println("digite uma string:");
      umastring = entrada.next();

      System.out.println("digite um numero:");
      numero = entrada.nextInt();
      
      System.out.println("digite um numero double:");
      numero2 = entrada.nextDouble();
      
      System.out.println("digite um caractere:");
      caractere = entrada.next().charAt(0);
      
      
      System.out.println("recebido: " + umastring);
      System.out.println("numero: " + numero);
      System.out.println("numero double: " + numero2);
      System.out.println("caractere: " + caractere);
      entrada.close();
   }

}
/*
digite uma string:
aladin
digite um numero:
3
digite um numero double:
2.4
digite um caractere:
t
recebido: aladin
numero: 3
numero double: 2.4
caractere: t




*/
