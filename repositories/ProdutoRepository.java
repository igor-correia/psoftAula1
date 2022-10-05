import java.util.ArrayList;

public class ProdutoRepository {
    private ArrayList<Produto> produtos;

    public ProdutoRepository() {
        this.produtos = new ArrayList<Produto>();
    }

    public void add(Produto produto) {
        this.produtos.add(produto);
    }

    public Produto[] list() {
        this.produtos;
    }
}