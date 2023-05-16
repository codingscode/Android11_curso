
package p12_encapsulation;


public class Carro extends Veiculo{
   private boolean eAutomatico = false;
	
   public Carro(String modelo, int velMax, boolean eAutomatico) {
      super(modelo, velMax);
      this.eAutomatico = eAutomatico;
   }

   public boolean iseAutomatico() {
      return eAutomatico;
   }

   public void seteAutomatico(boolean eAutomatico) {
      this.eAutomatico = eAutomatico;
   }
   

}
