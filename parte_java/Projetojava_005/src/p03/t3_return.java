package p03;



public class t3_return {

   public static void main(String[] args) {
      int k = 2;
      switch(k) {
         case 1:
            System.out.println("1");
            break;
         case 2:
            System.out.println("2");
            return;
      }
      System.out.println("Bem vindo!");
   }

}

/*
2


*/

