
package p02_loop;



public class t1_loop {

   public static void main(String[] args) {
      int i, soma = 0;
      
      for (i = 0; i <= 4; i++) {
         System.out.println("i : " + i);
      }
      
      System.out.println("fora: i : " + i);

      for (i = 0; i <= 10; i += 2) {
          System.out.println("i : " + i);
      }
      
      for (int j = 0; j <= 3; j++) {
          soma += j;
      }
      System.out.println("soma : " + soma);
      
   }

}
/*
i : 0
i : 1
i : 2
i : 3
i : 4
fora: i : 5
i : 0
i : 2
i : 4
i : 6
i : 8
i : 10
soma : 6


*/

