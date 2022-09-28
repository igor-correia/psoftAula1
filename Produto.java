public class Produto {
    private String nome;
    private String fabricante;
    private Double preco;

    public Produto(String nome, String fabricante, Double preco) {
        this.nome = nome;
        this.fabricante = fabricante;
        this.preco = preco;
    }

    public String getFabricante() {
        return this.fabricante;
    }

    public String getNome() {
        return this.nome;
    }

    public Double getPreco() {
        return this.preco;
    }

    public void setFabricante() {
        this.fabricante = fabricante;
    }

    public void setNome() {
        this.nome = nome;
    }

    public void setPreco() {
        this.preco = preco;
    }    
}