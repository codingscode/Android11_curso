
package p04_nestedclass;



public class T2_innerteste {

   public static void main(String[] args) {
      T1_innerClassExemplo defora = new T1_innerClassExemplo();
      T1_innerClassExemplo.InnerClass dedentro = defora.new InnerClass(); 
      dedentro.mostrar();

   }

}
/*
a = 5
b = 10
c = 15

 */
