
package p12_encapsulation;


public class Veiculo {

   private String modelo;
   private int velMax;
   
   // construtor
   public Veiculo(String modelo, int velMax) {
      this.modelo = modelo;
      this.velMax = velMax;
   }
   
   public int getVelMax() {
      return velMax;
   }
   
   public void setVelMax(int velMax) {
      this.velMax = velMax;
   }

   public String getModelo() {
      return modelo;
   }

   public void setModelo(String modelo) {
      this.modelo = modelo;
   }
      
   

}

