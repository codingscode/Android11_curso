
package p06_methodoverride;



public class t1_overrideteste {

   public static void main(String[] args) {
      // criando objeto Veiculo
      Veiculo veiculo = new Veiculo();
      veiculo.iniciar();
      veiculo.acelerar(80);
      veiculo.parar();
      
   // criando objeto Veiculo
      Carro carro = new Carro();
      carro.iniciar();
      carro.acelerar(100);
      carro.parar();

   }

}
/*
Veiculo iniciou.
Veiculo acelerou em 80.
Veiculo parou.
Carro iniciou.
Carro acelerou em 100.
Carro parou.

*/
