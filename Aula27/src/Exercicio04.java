/*
Aluno:Arthur Socrates Saavedra Lemos
Turma:2° Informatica
 */
import java.util.Scanner;

public class Exercicio04 {
    public static void main(String[] args) {

        int a,b,c;

        Scanner input = new Scanner(System.in);

        System.out.print("Digite o valor de A: ");
        a = input.nextInt();

        System.out.print("Digite o valor de B: ");
        b = input.nextInt();


        if (a == b) {
            c = a + b;
        } else {
            c = a * b;
        }

        System.out.println("O valor de C é: " + c);
    }
}

