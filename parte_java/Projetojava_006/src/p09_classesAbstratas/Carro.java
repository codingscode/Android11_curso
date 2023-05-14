
package p09_classesAbstratas;



public class Carro extends Veiculo{

   public Carro(String tipo, String modelo) {
      super(tipo, modelo);

   }

   @Override
   public int getVelMax() {
      final int VEL_MAX_CARRO = 320;
      System.out.println("velocidade máxima do carro é : " + VEL_MAX_CARRO);
      return VEL_MAX_CARRO;
   }

   @Override
   public void iniciar() {
      System.out.println("Carro iniciou");
   }
	   
   @Override
   public void parar() {
      System.out.println("Carro parou");
   }

   
}

