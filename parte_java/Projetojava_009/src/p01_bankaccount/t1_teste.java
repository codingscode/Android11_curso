
package p01_bankaccount;

import java.util.Scanner;

public class t1_teste {

   public static void main(String[] args) {
      ContaBanco conta = new ContaBanco();
      Scanner entrada = new Scanner(System.in);
      int escolha;
      
      do {
         System.out.println("--------- MENU CONTA DE BANCO ----------");
         System.out.println("1 - Depositar");
         System.out.println("2 - Sacar");
         System.out.println("3 - Mostrar saldo atual");
         System.out.println("4 - Parar");
         System.out.println("Selecione uma opção : ");
         escolha = entrada.nextInt();
         
         switch(escolha) {
            case 1:
               System.out.println("quantidade do depósito : ");
               conta.depositar(entrada.nextInt());
               break;
            case 2:
               System.out.println("Saldo atual : " + conta.getSaldo());
               System.out.println("quantidade do saque : ");
               try {
                  conta.sacar(entrada.nextInt());
               }
               catch (Exception_fundoInsuficiente e) {
                  System.out.println(e.toString());
               }
               break;
            case 3:
               System.out.println("Saldo atual : " + conta.getSaldo());
               break;
            case 4:
               break;
               
         }
         
      } while (escolha != 4);
      
      System.out.println("Tchau...");
      entrada.close();
   }

}
/*
--------- MENU CONTA DE BANCO ----------
1 - Depositar
2 - Sacar
3 - Mostrar saldo atual
4 - Parar
Selecione uma opção : 
200


--------- MENU CONTA DE BANCO ----------
1 - Depositar
2 - Sacar
3 - Mostrar saldo atual
4 - Parar
Selecione uma opção : 
3
Saldo atual : 0.0

--------- MENU CONTA DE BANCO ----------
1 - Depositar
2 - Sacar
3 - Mostrar saldo atual
4 - Parar
Selecione uma opção : 
2
Saldo atual : 0.0
quantidade do saque : 
100
p01_bankaccount.Exception_fundoInsuficiente


--------- MENU CONTA DE BANCO ----------
1 - Depositar
2 - Sacar
3 - Mostrar saldo atual
4 - Parar
Selecione uma opção : 
3
Saldo atual : 0.0

--------- MENU CONTA DE BANCO ----------
1 - Depositar
2 - Sacar
3 - Mostrar saldo atual
4 - Parar
Selecione uma opção : 
2
Saldo atual : 0.0
quantidade do saque : 
500
p01_bankaccount.Exception_fundoInsuficiente

--------- MENU CONTA DE BANCO ----------
1 - Depositar
2 - Sacar
3 - Mostrar saldo atual
4 - Parar
Selecione uma opção : 
4
Tchau...




*/
