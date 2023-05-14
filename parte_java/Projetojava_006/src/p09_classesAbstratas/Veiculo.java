
package p09_classesAbstratas;



public abstract class Veiculo {
   String tipo, modelo;

   // construtor
   public Veiculo (String tipo, String modelo) {
      this.tipo = tipo;
      this.modelo = modelo;
   }
   
   //non-abstract method
   public void iniciar() {
      System.out.println("Veiculo iniciou");
   }
   
   //non-abstract method
   public void parar() {
      System.out.println("Veiculo parou");
   }
   
   //abstract method
   public abstract int getVelMax();
   

}

