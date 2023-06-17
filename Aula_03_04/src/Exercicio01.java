import java.util.Scanner;

public class Exercicio01 {
    public static void main(String[] args) {

        int i;
        double nota, soma=0;
        String n;
        Scanner input = new Scanner(System.in);

        for (i=0;i<28;i++){
            System.out.print("Esxcreva o nome do aule:");
            n = input.next();
            System.out.print("Informe a nota do aulo");
            nota = input.nextDouble();
            soma=soma + nota;
        }
        System.out.println("A soma nota e"+soma );
    }
}