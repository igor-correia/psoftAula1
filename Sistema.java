public class Sistema {
    public static void main(String[] args) {
        ProdutoRepository repositorio = new ProdutoRepository();
        ProdutoService prodServicos = new ProdutoService(repositorio);
        prodServicos.create("eu","eu também", 5.00);
        System.out.println(prodServicos.list());
    }
}