
package p06_methodoverride;



public class Carro extends Veiculo{
   public void iniciar() {
      System.out.println("Carro iniciou.");
   }
   
   public void acelerar(int vel) {
      System.out.printf("Carro acelerou em %d.\n", vel);
   }
   
   public void parar() {
      System.out.println("Carro parou.");
   }



}

