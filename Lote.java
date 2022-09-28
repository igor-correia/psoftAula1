import  java.util.Date;

public class Produto {
    private int quantidade;
    private Date validade;
    private Produto produto;

    public Lote(int quantidade, Date validade, Produto produto) {
        this.quantidade = quantidade;
        this.validade = validade;
        this.produto = produto;
    }

    public String getQuantidade() {
        return this.quantidade;
    }

    public Date getValidade() {
        return this.validade;
    }

    public Double getProduto() {
        return this.produto;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

    public void setValidade() {
        this.validade = validade;
    }

    public void setProduto() {
        this.produto = produto;
    } 
}