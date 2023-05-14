
package p09_classesAbstratas;



public class t1_testeabstract {

   public static void main(String[] args) {
      Carro carro = new Carro("Carro", "Ferrari");
      carro.iniciar();
      carro.parar();
      carro.getVelMax();

   }

}
/*
Carro iniciou
Carro parou
velocidade máxima do carro é : 320

*/

