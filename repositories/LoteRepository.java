import java.util.ArrayList;

public class LoteRepository {
    private ArrayList<Lote> lotes;

    public LoteRepository() {
        this.lotes = new ArrayList<Lote>();
    }

    public void add(Lote lote) {
        this.lotes.add(lote);
    }

    public Lote[] list() {
        this.lotes;
    }
}