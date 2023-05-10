
package p03_static;



public class Carro {
   public static int velocidadeAtual = 0;
   public static int velocidadeMax = 180;

   public static void mostrarVelAtual(int vel) {
      System.out.println("Sua velocidade atual é : " + vel);
   }
   
   public static void velAumentar(int aumentar) {
      velocidadeAtual += aumentar;
      
      if (velocidadeAtual > velocidadeMax) {
         mostrarVelAtual(velocidadeAtual);
         System.out.println("Por favor diminuir!");
      }
      else {
         mostrarVelAtual(velocidadeAtual);
      }
   }
   
   public static void velDiminuir(int diminuir) {
      velocidadeAtual -= diminuir;
      mostrarVelAtual(velocidadeAtual);
   }
   
   public static void parar() {
      velocidadeAtual = 0;
      mostrarVelAtual(velocidadeAtual);
   }


}

/*

*/
