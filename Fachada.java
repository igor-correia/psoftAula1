import java.util.Date;

public class Fachada {
    private ProdutoService prodServ;
    private LoteService loteServ;

    public Fachada() {
        ProdutoRepository prodRepo = new ProdutoRepository();
        this.prodServ = new ProdutoService(prodRepo);
        LoteRepository loteRepo = new LoteRepository();
        this.loteServ = new LoteService(loteRepo);
    }
    public Produto[] listaProduto() {
        return prodServ.list();
    }
    public Lote[] listaLote() {
        return loteServ.list();
    };
    public Produto criaProduto(String nome, String fabricante, Double preco) {
        return prodServ.create(nome,fabricante,preco);
    };
    public Lote criaLote(int quantidade, Date validade, Produto produto) {
        return loteServ.create(quantidade, validade, produto);
    };
}