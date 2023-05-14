
package p10_interfaces;


public class t1_interfaceteste {

   public static void main(String[] args) {
      //criando objeto Carro
      Carro carro = new Carro();
      carro.vireEsquerda();
      carro.vireDireita();
      
      //criando objeto Moto
      Moto moto = new Moto();
      moto.vireEsquerda();
      moto.vireDireita();
      
   }

}
/*
Carro pode virar a esquerda.
Carro pode virar a direita.
Moto pode virar esquerda.
Moto pode virar direita.

*/
