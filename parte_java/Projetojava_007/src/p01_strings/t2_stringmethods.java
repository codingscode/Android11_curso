
package p01_strings;


public class t2_stringmethods {

   public static void main(String[] args) {
      String s1 = "Linguagem de programação Java";
      String s2 = " Olá";
      String s3[];
      
      System.out.println("String: " + s1);
      System.out.println("o 1º caractere: " + s1.charAt(0));
      System.out.println("comprimento de string: " + s1.length());
      System.out.println("Substring: " + s1.substring(5));
      System.out.println("É igual : " + s1.equals(s2));
      System.out.println("É vazio : " + s1.isEmpty());
      System.out.println("Concat : " + s1.concat(s2));
      System.out.println("Uppercase : " + s1.toUpperCase());
      System.out.println("Lowercase : " + s1.toLowerCase());
      // split() method
      s3 = s1.split(" ");
      for (String string : s3){
         System.out.print(string);
      }
      // replace() method
      System.out.println("\nSubstitua v, V : " + s1.replace('v', 'V'));
      
   }

}

/*
String: Linguagem de programação Java
o 1º caractere: L
comprimento de string: 29
Substring: agem de programação Java
É igual : false
É vazio : false
Concat : Linguagem de programação Java Olá
Uppercase : LINGUAGEM DE PROGRAMAÇÃO JAVA
Lowercase : linguagem de programação java
LinguagemdeprogramaçãoJava
Substitua v, V : Linguagem de programação JaVa

*/
