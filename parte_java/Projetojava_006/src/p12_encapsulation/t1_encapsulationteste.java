
package p12_encapsulation;


public class t1_encapsulationteste {

   public static void main(String[] args) {
      //criando objeto Carro
      Carro carro = new Carro("Ferrari", 320, true);
      System.out.println("Modelo : " + carro.getModelo());
      System.out.println("Velocidade Máxima : " + carro.getVelMax());
      System.out.println("É automático ? : " + carro.iseAutomatico());

   }

}
/*
Modelo : Ferrari
Velocidade Máxima : 320
É automático ? : true

*/
