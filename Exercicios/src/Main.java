import java.util.Scanner;

/*
1 Exercício - Escreva um código que receba o ano de nascimento de alguém e imprima na tela a
 seguinte mensagem: "Olá 'Fulano' você tem 'X' anos"
*/

public class Main {

    public static void main(String[] args) {
        var scanner = new Scanner(System.in);
        System.out.println("Qual seu nome?");
        var name = scanner.next();
        System.out.println("Qual seu ano de nascimento?");
        var date = scanner.nextInt();
        var result = 2025 - date;
        System.out.printf("Olá %s você tem %s anos!", name, result);

        // ou para achar o ano atual - OffsetDateTime.now().getYear();
    }
}