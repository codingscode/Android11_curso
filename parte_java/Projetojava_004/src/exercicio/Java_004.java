package exercicio;

import java.util.Scanner;

public class Java_004 {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		System.out.print("digite um número: ");
		int numero = entrada.nextInt();

		System.out.println("você digitou : " + numero);
                
        Scanner entradaTexto = new Scanner(System.in);
        System.out.print("digite um texto: ");
        String texto = entradaTexto.next();

        System.out.println("você digitou : " + texto);
        
        entrada.close();
        entradaTexto.close();

	}

	/*
	digite um número: 3
    você digitou : 3
    digite um texto: java
    você digitou : java
 
	 
	*/
}
