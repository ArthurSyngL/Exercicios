/*
Aluno:Arthur Socrates Saavedra Lemos
Turma:2° Informatica
 */
import java.util.Scanner;

public class Exercicio05 {
    public static void main(String[] args) {

        int numero, resultado;

        Scanner input = new Scanner(System.in);

        System.out.print("Digite um número: ");
        numero = input.nextInt();

        if(numero >= 0) {
            resultado = numero * 2;
            System.out.println("O dobro do número é: " + resultado);
        } else {
            resultado = numero * 3;
            System.out.println("O triplo do número é: " + resultado);
        }

        input.close();
    }
}
