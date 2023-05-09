
package p01_objetos;




public class t1_constructor {

   public static void main(String[] args) {
      Carro meuCarro = new Carro("Ferrari");
      meuCarro.iniciar();
      meuCarro.acelerar();
      meuCarro.mostrarVelocidade();
      meuCarro.parar();
      meuCarro.mostrarVelocidade();
      
      System.out.println("-----------");
      
      Carro meuCarro1 = new Carro("Celta", "azul", 2013);
      System.out.println(meuCarro1);   // chama toString() método em Carro
      
   }

}

/*
Ferrari iniciou
a velocidade atual de Ferrari é 20
Ferrariparou
a velocidade atual de Ferrari é 0
-----------
Modelo: Celta Cor: azul Ano: 2013



*/

