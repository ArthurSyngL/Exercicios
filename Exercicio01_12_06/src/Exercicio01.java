import java.util.Scanner;

public class Exercicio01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int m[][] = new int[5][5];

        // Lendo a matriz 5 por 5

        for (int i = 0; i<5; i++){
            for (int j=0; j<5; j++){
                m[i][j] = sc.nextInt();
            }
        }

        // Exibindo a matriz

        for (int i = 0; i <5; i++){
            for (int j =0; j<5; j++){
                if (i==j){
                    System.out.println("Diagonal Principal: \n"+ m[i][j]);
                }
                if (i+j == 4){
                    System.out.println("Diagonal Secundaria: \n"+ m[i][j]);
                }
                if (i+i>=5){
                    System.out.println("Abaixo da diagonal secundaria: \n"+ m[i][j]);
                }
            }

        }

    }
}
