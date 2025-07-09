/*
* Escreva um código que receba o nome e a idade de 2 pessoas e imprima a diferença de idade entre elas
*/

import java.util.Scanner;

public class Main4 {
    public static void main(String[] args){
      var scanner = new Scanner(System.in);
      System.out.println("Informe o seu nome:");
      var nomePrimeiro = scanner.next();
      System.out.println("Informe a sua idade:");
      var idadePrimero = scanner.nextInt();
      System.out.println("Informe o seu nome:");
      var nomeSegundo = scanner.next();
      System.out.println("Informe a sua idade?");
      var idadeSegundo = scanner.nextInt();
      var diferenca = idadePrimero - idadeSegundo;
      System.out.printf("A diferença de idade entre o %s e %s é de %s anos!\n", nomePrimeiro, nomeSegundo, diferenca);
    };
}
