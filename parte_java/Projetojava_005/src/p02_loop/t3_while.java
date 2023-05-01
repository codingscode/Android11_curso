
 package p02_loop;



public class t3_while {

   public static void main(String[] args) {
      int i = 7;
      
      while (i > 1) {
         System.out.print(i + " | ");
         i--;
      }
      
      System.out.println("");
      
      int k = 1, fact = 1;
      while (k <= 5) {
         fact *= k;
         System.out.println(k + "!" + " = " + fact);
         k++;
      }


   }

}

/*
7 | 6 | 5 | 4 | 3 | 2 | 
1! = 1
2! = 2
3! = 6
4! = 24
5! = 120


*/

