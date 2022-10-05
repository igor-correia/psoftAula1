public class ProdutoService(ProdutoRepository repositorio) implements Fachada<Produto>{
    private ProdutoRepository repositorio;
    
    public ProdutoService(ProdutoRepository repositorio) {
        this.repositorio = repositorio;
    }
    
    public Produto create(String nome, String fabricante, Double preco) {
        Produto novoProduto = new Produto(nome, fabricante, preco);
        this.repositorio.add(novoProduto);
        return novoProduto;
    }

    public Produto[] list() {
        return this.repositorio.getAll();
    }
}