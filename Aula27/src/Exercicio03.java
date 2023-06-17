/*
Aluno:Arthur Socrates Saavedra Lemos
Turma:2° Informatica
 */
import java.util.Scanner;

public class Exercicio03 {
    public static void main(String[] args) {

        int numero;

        Scanner input = new Scanner(System.in);

        System.out.print("Digite um número inteiro: ");
        numero = input.nextInt();

        if(numero % 2 == 0) {
            System.out.println("O número " + numero + " é par.");
        } else {
            System.out.println("O número " + numero + " é ímpar.");
        }
    }
}
