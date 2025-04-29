package main.java.map.Pesquisa;

public class Produto {
    private String nome;
    private long cod;
    private int quantidade;
    private double preco;

    public int getQuantidade() {
        return quantidade;
    }

    public String getNome() {
        return nome;
    }

    public double getPreco() {
        return preco;
    }

    public long getCod() {
        return cod;
    }

    public Produto(long cod, String nome, int quantidade, double preco) {
        this.cod = cod;
        this.nome = nome;
        this.quantidade = quantidade;
        this.preco = preco;
    }

    @Override
    public String toString() {
        return "Produto{" +
                "nome='" + nome + '\'' +
                ", cod=" + cod +
                ", quantidade=" + quantidade +
                ", preco=" + preco +
                '}';
    }
}
