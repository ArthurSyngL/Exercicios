/*
Aluno:Arthur Socrates Saavedra Lemos
Turma:2° Informatica
Media aritimetica
 */

import java.util.Scanner;

public class Exercicio01 {
    public static void main(String[] args) {
        double n1, n2, n3,n4, ma;
        String nome;

        Scanner Input = new Scanner(System.in);
        System.out.println("Qual seu nome?");
        nome = Input.next();

        System.out.println("Informe as notas");
        n1 = Input.nextDouble();

        System.out.println("Informe as notas");
        n2 = Input.nextDouble();

        System.out.println("Informe as notas");
        n3 = Input.nextDouble();

        System.out.println("Informe as notas");
        n4 = Input.nextDouble();

        ma= n1+n2+n3+n4/4;

        System.out.println("A media e:"+ ma +"Nome:"+ nome);
    }
}