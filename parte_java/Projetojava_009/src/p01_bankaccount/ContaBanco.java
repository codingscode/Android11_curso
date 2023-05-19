
package p01_bankaccount;


public class ContaBanco {
   private double saldo;
   
   // construtor
   public ContaBanco() {
      saldo = 0.0;
   }
   
   // methodo depositar
   public void depositar(double quantidade) {
      saldo = saldo + quantidade;
   }
   
   // method sacar
   public void sacar(double quantidade) throws Exception_fundoInsuficiente {
      if(quantidade > saldo) {
         throw new Exception_fundoInsuficiente("Saldo insuficiente. Processo de sacar não pode ser completado");
      }
      saldo = saldo - quantidade;
   }

   // getter method of saldo
   public double getSaldo() {
      return saldo;
   }
   
	
}


