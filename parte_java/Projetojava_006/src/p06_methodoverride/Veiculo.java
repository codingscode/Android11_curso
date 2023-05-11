
package p06_methodoverride;



public class Veiculo {
   public void iniciar() {
      System.out.println("Veiculo iniciou.");
   }
   
   public void acelerar(int vel) {
      System.out.printf("Veiculo acelerou em %d.\n", vel);
   }
   
   public void parar() {
      System.out.println("Veiculo parou.");
   }


}

