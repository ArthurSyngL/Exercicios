import java.util.Scanner;
public class Exercicio03{
    public static void main(String[] args) {

        int n, i, j;
        double fat, e = 1;

        Scanner input = new Scanner(System.in);

        System.out.println("ESCREVA");
        n = input.nextInt();

        for (i=1;i<=n;i++){

            fat=1;

            for (j=1;j<=i;i++){
                fat = fat * j;
                e = e +1 /fat;
            }

        }
       System.out.println("Numero e " + e);
    }
}
