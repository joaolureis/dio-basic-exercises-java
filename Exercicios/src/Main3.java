/*

* Escreva um código que receba a base e a altura de um retângulo, calcule sua área e exiba na tela

* Fórmula: área=base X altura

*/

import java.util.Scanner;

public class Main3 {

    public static void main(String[] args) {
        var scanner = new Scanner(System.in);
        System.out.println("Informe a base do retângulo em cm");
        var base = scanner.nextInt();
        System.out.println("Informe agora a altura do seu retângulo em cm");
        var altura = scanner.nextInt();
        var area =  base * altura;
        System.out.printf("A área do seu retângulo é %s cm²", area);
    };
}
