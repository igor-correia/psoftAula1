import  java.util.Date;

public class Main {
    public static void main(String[] args) {
        Produto produto = new Produto("leite", "nestlé", 10.00);
        Date data = new Date();
        Lote lote = new Lote(5, data, produto);
    }
}