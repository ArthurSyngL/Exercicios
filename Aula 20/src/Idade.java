/*
Aluno:Arthur Socrates Saavedra Lemos
Turma:2° Informatica
Idade
 */
import java.util.Scanner;
public class Idade {
    public static void main(String[] args) {

        int idade_pai, idade_filho, diferenca;

        Scanner input = new Scanner(System.in);
        System.out.println("Informe a idade do pai");
        idade_pai = input.nextInt();
        idade_filho = input.nextInt();
        diferenca = idade_pai - idade_filho;
        System.out.println("A diferença e" + diferenca);
    }
}