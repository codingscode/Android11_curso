package p05_operadores_atribuicao;




public class operadores_atribuicao {

   public static void main(String[] args) {
      int x = 20, y = 15, z = 0;
      
      z = x + y;
      System.out.println("z = x + y = " + z);
      
      z += x;
      System.out.println("z += x = " + z);
      
      z -= x;
      System.out.println("z -= x = " + z);
      
      z *= x;
      System.out.println("z *= x = " + z);
      
      z /= x;
      System.out.println("z /= x = " + z);
      
      z %= x;
      System.out.println("z %= x = " + z);
      
      
   }

}

/*
z = x + y = 35
z += x = 55
z -= x = 35
z *= x = 700
z /= x = 35
z %= x = 15


*/

