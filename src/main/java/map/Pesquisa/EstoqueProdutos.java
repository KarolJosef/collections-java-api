package main.java.map.Pesquisa;

import java.util.HashMap;
import java.util.Map;

public class EstoqueProdutos {
    private Map<Long,Produto> estoqueProdutosMap;

    public EstoqueProdutos() {
        this.estoqueProdutosMap = new HashMap<>();
    }

    public void adicionaProduto(long cod, String nome, int quantidade, double preco) {
        estoqueProdutosMap.put(cod, new Produto(cod, nome, quantidade, preco));
    }
    public void exibeEstoqueProdutos() {
        System.out.println(estoqueProdutosMap);
    }
    public double calculaValorTotalEstoque() {
        double total = 0;
        if (!estoqueProdutosMap.isEmpty()) {
            for(Produto p : estoqueProdutosMap.values()) {
                total += p.getPreco() * p.getQuantidade();
            }
        }
        return total;
    }
    public Produto obterProdutoMaisCaro() {
        Produto produtoMaisCaro = null;
        double maiorPreco = Double.MIN_VALUE;
        for(Produto p : estoqueProdutosMap.values()) {
            if(p.getPreco() > maiorPreco) {
                produtoMaisCaro = p;
            }
        }
        return produtoMaisCaro;
    }

    public static void main(String[] args) {
        EstoqueProdutos estoqueProdutos = new EstoqueProdutos();
        estoqueProdutos.exibeEstoqueProdutos();
        estoqueProdutos.adicionaProduto(1L,"Produto A", 10, 5.0);
        estoqueProdutos.adicionaProduto(2L, "Produto B", 5, 10.0);
        estoqueProdutos.adicionaProduto(3L, "Produto C", 2, 15.0);
        estoqueProdutos.exibeEstoqueProdutos();

        System.out.println("Valor total do estoque" + estoqueProdutos.calculaValorTotalEstoque());
        System.out.println("Valor produto mas caro" + estoqueProdutos.obterProdutoMaisCaro());


    }
}
