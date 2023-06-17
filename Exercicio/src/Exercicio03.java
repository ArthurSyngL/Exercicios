/*
Aluno:Arthur Socrates Saavedra Lemos
Turma:2° Informatica
Valor desconto
 */

import java.util.Scanner;

public class Exercicio03 {
    public static void main(String[] args) {

        double novo_valor_produto;
        float valor_produto;

        Scanner input = new Scanner(System.in);

        System.out.println("informe o valor");
        valor_produto = input.nextFloat();
        novo_valor_produto = valor_produto - (valor_produto *0.09);
        System.out.println("o valor do produto com desconto e:"+ novo_valor_produto);
    }
}