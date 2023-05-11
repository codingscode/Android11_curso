
package p07_superthis;



public class t1_superthisteste {

   public static void main(String[] args) {
      // criando objeto Carro
      Carro carro = new Carro("Carro", "Ferrari", 320, true);
      System.out.printf("Tipo: %s\n", carro.getTipo());
      System.out.printf("Modelo: %s\n", carro.getModelo());
      System.out.printf("Velocidade Máx: %s\n", carro.getVelMax());
      System.out.printf("Carro é automático: %s\n", carro.eAutomatico());
      
   }

}
/*
Tipo: Carro
Modelo: Ferrari
Velocidade Máx: 320
Carro é automático: true
*/

/*
fazer revisao
*/