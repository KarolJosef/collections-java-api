package main.java.list.OperacoesBasicas;

import java.util.ArrayList;
import java.util.List;

public class CarrinhoDeCompras {
    private List<Item> item;

    public CarrinhoDeCompras(){
        this.item = new ArrayList<>();
    }

    public void adicionarCarrinhoDeCompras(){
        item.add(new Item("compra 1", 300, 5));
        item.add(new Item("compra 2", 209, 2));
        item.add(new Item("compra 3", 408, 3));
    }
    public void RemoverItem(String nome) {
        List<Item> listaItemsARemover = new ArrayList<>();
        for(Item t : item) {
            if(t.getNome().equalsIgnoreCase(nome)){
                listaItemsARemover.add(t);
            }
        }
        item.removeAll(listaItemsARemover);
    }
    public void calcularValorTotal() {
        double valorTotal = 0;
        for(Item t : item) {
            valorTotal += t.getPreco();
        }
        System.out.println("Valor Total : " + valorTotal);

    }

    public void exibirItens() {
        System.out.println(item);
    }

    public static void main(String[] args) {
        CarrinhoDeCompras carrinhoDeCompras = new CarrinhoDeCompras();
        carrinhoDeCompras.adicionarCarrinhoDeCompras();
        carrinhoDeCompras.exibirItens();
        carrinhoDeCompras.RemoverItem("compra 1");
        carrinhoDeCompras.exibirItens();
        carrinhoDeCompras.calcularValorTotal();
    }
}
