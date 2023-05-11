
package p07_superthis;



public class Veiculo {
   String tipo, modelo;
   int velMax;
   
   //construtor
   public Veiculo(String tipo, String modelo, int velMax) {
      this.tipo = tipo;
      this.modelo = modelo;
      this.velMax = velMax;
   }

   //getter methods
   public String getTipo() {
	  return tipo;
   }

   public String getModelo() {
	  return modelo;
   }

   public int getVelMax() {
	  return velMax;
   }
   
   
   

}

