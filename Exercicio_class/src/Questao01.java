public class Questao01 {
    private String numero;
    private String descricao;
    private int quantidade;
    private double precoporitem;

    public Questao01(String numero,String descricao, int quantidade, double precoporitem) {
        this.numero = numero;
        this.descricao = descricao;
        setQuantidade(quantidade);
        setPrecoPorItem(precoporitem);
    }
    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }
    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        if (quantidade > 0) {
            this.quantidade = quantidade;
        } else {
            this.quantidade = 0;
        }
    }

    // Método get para o preço por item
    public double getPrecoPorItem() {
        return precoporitem;
    }

    public void setPrecoPorItem(double precoporitem) {
        if (precoporitem > 0.0) {
            this.precoporitem = precoporitem;
        } else {
            this.precoporitem = 0.0;
        }
    }

    public double getTotalFatura() {
        return quantidade * precoporitem;
    }
}
