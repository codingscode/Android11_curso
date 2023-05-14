
package p10_interfaces;


public class Moto implements Drivable{

   @Override
   public void vireEsquerda() {
      System.out.println("Moto pode virar esquerda.");
   }

   @Override
   public void vireDireita() {
      System.out.println("Moto pode virar direita.");
   }

}

