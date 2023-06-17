/*
Aluno:Arthur Socrates Saavedra Lemos
Turma:2° Informatica
Numero Nultiplo 3
 */
import java.util.Scanner;
public class Exercicio01 {
    public static void main(String[] args) {

        //DECLARAÇÃO DE VARIAVEIS

        int n;

        //DECLARAR E INICIALIZAR A VARIAVEL INPUT - Pacote SCANNER

        Scanner input = new Scanner(System.in);

        // DADOS RECEBIDOS

        System.out.println("Digite o numero");
        n = input.nextInt();

        //VENDO SE O NUMERO E MULTIPLO DE 3

        if(n%3==0){

            //Exibindo se o numero multiplo de 3

            System.out.println("O numero e Multiplo de 3");

        }else{

            //Exibindo se o numero nao e multiplo de 3

            System.out.println("O numero nao e multiplo de 3");
        }
    }
}
