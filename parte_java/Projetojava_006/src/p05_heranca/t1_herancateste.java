
package p05_heranca;



public class t1_herancateste {

   public static void main(String[] args) {
      // criando objeto Carro
      Carro carro = new Carro();
      carro.tipo = "Carro";
      carro.modelo = "Ferrari";
      carro.velMax = 320;
      carro.imprimir();

      // criando objeto Moto
      Moto moto = new Moto();
      moto.tipo = "Moto";
      moto.modelo = "Yamaha";
      moto.velMax = 180;
      moto.imprimir();

   }

}
/*
Tipo: Carro
Modelo: Ferrari
Velocidade Máxima: 320
Tipo: Moto
Modelo: Yamaha
Velocidade Máxima: 180

*/

