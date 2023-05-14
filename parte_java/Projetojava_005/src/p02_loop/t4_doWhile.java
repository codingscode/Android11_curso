
package p02_loop;
import java.util.Scanner;


public class t4_doWhile {

   public static void main(String[] args) {
      int numero = 1;
      do {
         System.out.print(numero + " | ");
         numero++;
      } while (numero <= 7);

      Scanner entrada = new Scanner(System.in);
      int escolha;

      do {
         System.out.println("\n----MENU----");
         System.out.println("1. Maçã");
         System.out.println("2. Banana");
         System.out.println("3. Laranja");
         System.out.println("4. Sair");
         System.out.println("Selecione uma opção :");
         escolha = entrada.nextInt();
         
         switch(escolha) {
            case 1:
               System.out.println("Maça");
               break;
            case 2:
               System.out.println("Banana");
               break;
            case 3:
               System.out.println("Laranja");
               break;
         }
         
      } while (escolha != 4);
      entrada.close();
   }

}

/*
1 | 2 | 3 | 4 | 5 | 6 | 7 | 
----MENU----
1. Maçã
2. Banana
3. Laranja
4. Sair
Selecione uma opção :
1
Maça

----MENU----
1. Maçã
2. Banana
3. Laranja
4. Sair
Selecione uma opção :
2
Banana

----MENU----
1. Maçã
2. Banana
3. Laranja
4. Sair
Selecione uma opção :
4
 

*/

