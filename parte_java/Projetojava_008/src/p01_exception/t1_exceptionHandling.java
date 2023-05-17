
package p01_exception;
import java.util.InputMismatchException;
import java.util.Scanner;


public class t1_exceptionHandling {

   public static void main(String[] args) {
      int numero1 = 0, numero2 = 0, resultado = 0;
      boolean eBandeira = false;
      
      do {
      
         try {
    		  
            Scanner entrada = new Scanner(System.in);
    		  
    		System.out.println("\nDigite o 1º número inteiro: ");
    		numero1 = entrada.nextInt();
    		  
    		System.out.println("Digite o 2º número inteiro: ");
    		numero2 = entrada.nextInt();
    		  
    		resultado = numero1/numero2;
    		System.out.println("Resultado : " + resultado);
    		eBandeira = true;
    		entrada.close();
    	 }
    	 catch (InputMismatchException e) {
    		System.out.println("Por favor digite um número válido!");
    	 }
    	 catch (ArithmeticException e) {
    		System.out.println("O segundo númro não pode ser 0!");
    	 }
    	 catch(Exception e) {
    		// qualquer exceção
    		System.out.println("Uma exceção ocorreu.");
    	 }
    	 finally {
    		System.out.println("Esta afirmação é sempre executada.");
    	 }
      } while(!eBandeira);


   }

}
/*
Digite o 1º número inteiro: 
10
Digite o 2º número inteiro: 
3
Resultado : 3

-----------------------------
Digite o 1º número inteiro: 
java
Por favor digite um número válido!

------------------------------
Digite o 1º número inteiro: 
4
Digite o 2º número inteiro: 
0
O segundo númro não pode ser 0!

--------------------------------
Digite o 1º número inteiro: 
12
Digite o 2º número inteiro: 
5
Resultado : 2
Esta afirmação é sempre executada.



*/
