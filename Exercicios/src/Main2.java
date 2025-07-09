/*

* Escreva um código que receba o tamanho do lado de um quadrado, calcule sua área e exiba na tela

* Fórmula: área=lado X lado

 */

import java.util.Scanner;

public class Main2 {

    public static void main(String[] args) {
    var scanner = new Scanner(System.in);
    System.out.println("Informe o lado do seu quadrado em CM");
    var lado = scanner.nextInt();
    var area = lado * lado;
    System.out.printf("A área do seu quadrado é %s cm²", area);
    }
}
