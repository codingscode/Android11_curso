
package p07_superthis;



public class Carro extends Veiculo {

   boolean eAutomatico = false;

   public Carro(String tipo, String modelo, int velMax, boolean eAutomatico) {
      super(tipo, modelo, velMax); // chamando super classe construtor
      this.eAutomatico = eAutomatico;

   }

   // getter method
   public boolean eAutomatico() {
      return eAutomatico;
   }

}
