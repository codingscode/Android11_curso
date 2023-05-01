
package p02_loop;




public class t2_foreach {

   public static void main(String[] args) {
      char[] letras = {'e', 's', 't', 'r', 'a', 'd', 'a'};

      for (int i=0; i<letras.length; i++) {
         System.out.println("caractere: " + letras[i]);
      }

      System.out.println("");

      // usando loop foreach
      char[] projeto = {'f', 'e', 'r', 'r', 'o', 'v', 'i', 'a'};
      
      for (char cada: projeto) {
         System.out.println("letra: " + cada);
      }
      
      int[] numeros = {4, 5, 0, 1};
      int soma = 0;
      for (int numero: numeros) {
         soma += numero;
         System.out.println("numero: " + numero);
      }

      System.out.println("soma: " + soma);
   }

}

/*
caractere: e
caractere: s
caractere: t
caractere: r
caractere: a
caractere: d
caractere: a

letra: f
letra: e
letra: r
letra: r
letra: o
letra: v
letra: i
letra: a
numero: 4
numero: 5
numero: 0
numero: 1
soma: 10

*/

