
package p01_objetos;



public class Carro {
   private String modelo;
   private int velocidadeAtual;
   private String cor;
   private int ano;
   
   
   //construtor
   public Carro(String modelo) {
      this.modelo = modelo;
   }
   
   public Carro(String modelo, String cor, int ano) {
      this.modelo = modelo;
      this.cor = cor;
      this.ano = ano;
   }
   
   //metodos
   public void iniciar() {
      System.out.println(this.modelo + " iniciou");
   }
   
   public void acelerar() {
      this.velocidadeAtual += 20;
   }
   
   public void parar() {
      System.out.println(this.modelo + " parou");
      this.velocidadeAtual = 0;
   }
   
   public void mostrarVelocidade() {
      System.out.println("a velocidade atual de " + this.modelo + " é " + this.velocidadeAtual);
   }

   public String toString() {
      return "Modelo: " + this.modelo + " Cor: " + this.cor + " Ano: " + this.ano;
   }   
   
}
