import java.util.Date;

public class LoteService(LoteRepository repositorio) implements Fachada<Lote> {
    private LoteRepositorio repositorio;
    
    public LoteService(LoteRepository repositorio) {
        this.repositorio = repositorio;
    }
    
    public Lote create(int quantidade, Date validade, Produto produto) {
        Lote novoLote = new Lote(quantidade, validade, produto);
        this.repositorio.add(novoLote);
        return novoLote;
    }

    public Lote[] list() {
        return this.repositorio.getAll();
    }
}