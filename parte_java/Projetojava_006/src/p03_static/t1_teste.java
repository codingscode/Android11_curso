
package p03_static;



public class t1_teste {

   public static void main(String[] args) {
      Carro.velAumentar(60);
      Carro.velAumentar(160);
      Carro.velDiminuir(50);
      Carro.parar();

      Carro obj = new Carro();
      obj.velAumentar(40); // aparece warn
   }

}
/*
Sua velocidade atual é : 60
Sua velocidade atual é : 220
Por favor diminuir!
Sua velocidade atual é : 170
Sua velocidade atual é : 0
Sua velocidade atual é : 40


*/
