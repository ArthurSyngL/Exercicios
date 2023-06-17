/*
Aluno:Arthur Socrates Saavedra Lemos
Turma:2° Informatica
Dolar
 */

import java.util.Scanner;

public class Exercicio04 {
    public static void main(String[] args) {
        float qd, d, vf;
        Scanner Input = new Scanner(System.in);

        System.out.println("Informe a quantidade do dolar");
        qd = Input.nextFloat();

        System.out.println("Informe o preco do dolar");
        d = Input.nextFloat();

        vf=qd*d;

        System.out.println("O valor e:"+ vf);
    }
}