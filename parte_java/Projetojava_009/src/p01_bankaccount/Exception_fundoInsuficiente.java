
package p01_bankaccount;



public class Exception_fundoInsuficiente extends Exception {
   private String mensagem;
   
   // construtor
   public Exception_fundoInsuficiente (String mensagem) {
      this.mensagem = mensagem;
   }

   // getter method of mensagem
   public String getMensagem() {
      return mensagem;
   }
   

}

