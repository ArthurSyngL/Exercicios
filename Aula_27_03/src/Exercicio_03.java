/*
Aluno:Arthur Socrates Saavedra Lemos
Turma:2° Informatica
Media
 */

import java.util.Scanner;

public class Exercicio_03 {
    public static void main(String[] args) {

        // Declaração de Variaveis

        double n1, n2, n3, media,notaExame;

        //DECLARAR E INICIALIZAR A VARIAVEL INPUT - Pacote SCANNER

        Scanner input = new Scanner(System.in);

        // DADOS RECEBIDOS

        System.out.print("Digite a primeira nota: ");
        n1 = input.nextDouble();

        System.out.print("Digite a segunda nota: ");
        n2 = input.nextDouble();

        System.out.print("Digite a terceira nota: ");
        n3 = input.nextDouble();

        // Calculo da media

        media = (n1 + n2 + n3) / 3.0;

        // Exibição da media

        System.out.printf("Média: %.2f\n", media);

        // Cituação do Aluno

        if (media >= 0.0 && media < 3.0) {
            System.out.println("Reprovado");
        } else if (media >= 3.0 && media < 7.0) {
            System.out.println("Exame");
            notaExame = 12.0 - media;
            System.out.printf("Nota necessária no exame: %.2f\n", notaExame);
        } else {
            System.out.println("Aprovado");
        }
    }
}
