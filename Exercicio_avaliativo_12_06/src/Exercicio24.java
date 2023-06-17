import java.util.Scanner;

public class Exercicio24 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        final int produtos = 10;
        final int armazem = 5;
        int maiorEstoque = 0;
        double precoMaiorEstoque = 0;

        double[] preco = new double[produtos];
        int[][] estoque = new int[armazem][produtos];

        System.out.println("Digite os precos");

        for (int i = 0; i < produtos; i++) {
            System.out.print("Produto " + (i + 1) + ": ");
            preco[i] = sc.nextDouble();
        }

        System.out.println("Quantidade estoquada em cada armazen");
        for (int i = 0; i < armazem; i++) {
            System.out.println("Armazém " + (i + 1) + ":");

            for (int j = 0; j < produtos; j++) {
                System.out.print("Produto " + (j + 1) + ": ");
                estoque[i][j] = sc.nextInt();

            }
        }

        System.out.println("Quantidade de produto em cada estoque");

        for (int i = 0; i < armazem; i++) {
            int total = 0;
            for (int j = 0; j < produtos; j++) {
                total += estoque[i][j];
            }
            System.out.println("Armazém " + (i + 1) + ": " + total);
        }

        System.out.println("Quantidade de produto em todos os estoque");
        for (int j = 0; j < produtos; j++) {
            int total = 0;
            for (int i = 0; i < armazem; i++) {
                total += estoque[i][j];
            }
            System.out.println("Produto " + (j + 1) + ": " + total);
        }

        for (int i = 0; i < armazem; i++) {
            for (int j = 0; j < produtos; j++) {
                if (estoque[i][j] > maiorEstoque) {
                    maiorEstoque = estoque[i][j];
                    precoMaiorEstoque = preco[j];
                }
            }
        }
        System.out.println("Preço do produto com maior estoque em um único armazém: R$" + precoMaiorEstoque);
    }
}
