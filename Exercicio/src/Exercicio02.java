/*
Aluno:Arthur Socrates Saavedra Lemos
Turma:2° Informatica
Media ponteirada
 */

import java.util.Scanner;

public class Exercicio02 {
    public static void main(String[] args) {
        double n1, n2, n3,n4, mp;
        int p1, p2, p3, p4;

        Scanner Input = new Scanner(System.in);


        System.out.println("Informe as notas");
        n1 = Input.nextDouble();

        System.out.println("Informe as notas");
        n2 = Input.nextDouble();

        System.out.println("Informe as notas");
        n3 = Input.nextDouble();

        System.out.println("Informe as notas");
        n4 = Input.nextDouble();


        System.out.println("Informe o peso 1");
        p1 = Input.nextInt();

        System.out.println("Informe o peso 2");
        p2 = Input.nextInt();

        System.out.println("Informe o peso 3");
        p3 = Input.nextInt();

        System.out.println("Informe o peso 4");
        p4 = Input.nextInt();
        mp=((n1*p1)+(n2*p2)+(n3*p3)+(n4*p4))/(p1+p2+p3+p4);

        System.out.println("A media pondeirada e:"+ mp);
    }
}