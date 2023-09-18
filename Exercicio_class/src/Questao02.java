public class Questao02 {
    public static void main(String[] args) {
        // Criar uma instância de Fatura
        Questao01 fatura1 = new Questao01("001", "Mouse", 5, 25.0);

        // Imprimir os detalhes da fatura
        System.out.println("Número: " + fatura1.getNumero());
        System.out.println("Descrição: " + fatura1.getDescricao());
        System.out.println("Quantidade: " + fatura1.getQuantidade());
        System.out.println("Preço por Item: " + fatura1.getPrecoPorItem());

        // Calcular e imprimir o valor total da fatura
        System.out.println("Total da Fatura: " + fatura1.getTotalFatura());
    }
}
