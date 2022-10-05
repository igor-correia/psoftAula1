import java.util.Date;

public class Lote {
    private int quantidade;
    private Date validade;
    private Produto produto;

    public Lote(int quantidade, Date validade, Produto produto) {
        this.quantidade = quantidade;
        this.validade = validade;
        this.produto = produto;
    }

    public int getQuantidade() {
        return this.quantidade;
    }

    public Date getValidade() {
        return this.validade;
    }

    public Produto getProduto() {
        return this.produto;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

    public void setValidade(Date validade) {
        this.validade = validade;
    }

    public void setProduto(Produto produto) {
        this.produto = produto;
    } 
}