/*
Aluno:Arthur Socrates Saavedra Lemos
Turma:2° Informatica
Ordem descresente
 */
import java.util.Scanner;

public class Exercicio01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Recebe os três primeiros números em ordem crescente
        System.out.print("Digite o primeiro número em ordem crescente: ");
        int num1 = sc.nextInt();
        System.out.print("Digite o segundo número em ordem crescente: ");
        int num2 = sc.nextInt();
        System.out.print("Digite o terceiro número em ordem crescente: ");
        int num3 = sc.nextInt();

        // Recebe o quarto número
        System.out.print("Digite o quarto número: ");
        int num4 = sc.nextInt();

        // Ordena os números em ordem decrescente
        int maior = num1;
        int meio = num2;
        int menor = num3;

        if (num4 > maior) {
            int aux = maior;
            maior = num4;
            meio = aux;
            aux = meio;
            menor = aux;
            aux = num3;
            menor = aux;
        } else if (num4 > meio) {
            int aux = meio;
            meio = num4;
            aux = num3;
            menor = aux;
        } else if (num4 > menor) {
            int aux = num4;
            aux = num3;
            menor = aux;
        }

        System.out.printf("%d %d %d %d", maior, meio, menor, num4);
    }
}
