import java.util.Scanner;

public class Exercicio20 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        double[][] matriz = new double[5][5];
        double diagonalPrincipal;

        System.out.println("Digite os valores da matriz 5x5:");

        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                matriz[i][j] = scanner.nextDouble();
            }
        }

        for (int i = 0; i < 5; i++) {
            diagonalPrincipal = matriz[i][i];

            for (int j = 0; j < 5; j++) {
                matriz[i][j] *= diagonalPrincipal;
            }
        }

        System.out.println("Resultado da multiplicacao:");

        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                System.out.print(matriz[i][j] + " ");
            }
            System.out.println();
        }
    }
}
