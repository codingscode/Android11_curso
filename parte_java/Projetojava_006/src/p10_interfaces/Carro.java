
package p10_interfaces;



public class Carro implements Drivable{

   @Override
   public void vireEsquerda() {
      System.out.println("Carro pode virar a esquerda.");
   }

   @Override
   public void vireDireita() {
      System.out.println("Carro pode virar a direita.");
   }
   
   

}

