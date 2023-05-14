
package p11_polimorfismo;


public class t1_testepolimorfismo {

   public static void main(String[] args) {
      Veiculo veiculo = new Carro();
      // isto funciona porque Carro é uma subclasse de Veiculo
      veiculo.acelerar();
      
      Veiculo moto = new Moto();
      moto.acelerar();

   }
}
/*
Carro está acelerando
Moto está acelerando

*/