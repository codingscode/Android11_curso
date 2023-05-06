
package p03;



public class t2_continue {

   public static void main(String[] args) {
      for (int i=0; i<10; i++) {
         if (i % 2 == 0) {
            continue;
         }
         System.out.print(i + " | ");
      }

   }

}

/*
1 | 3 | 5 | 7 | 9 | 

*/

