import java.util.Scanner;
public class Exercicio04 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        double i, num, alt, maior = 0, num_maior, menor, num_menor;
        for (i=0;i<10;i++){
            num = input.nextInt();
            alt = input.nextInt();
            if (i == 1){
                maior = alt;
                num_maior = num;
                menor = alt;
                num_menor = num;
            }else if(alt > maior){
                maior = alt;

            }
            
        }
    }
}
