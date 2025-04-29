package main.java.set.OperacoesBasicas;

import java.util.HashSet;
import java.util.Set;

public class ConjuntoPalavrasUnicas {
    private Set<String> palavras;

    @Override
    public String toString() {
        return "ConjuntoPalavrasUnicas{" +
                "palavras=" + palavras +
                '}';
    }

    public ConjuntoPalavrasUnicas() {
        this.palavras = new HashSet<>();
    }

    public void adicionarPalavra(String palavra) {
        palavras.add(palavra);
    }

    public boolean verificarPalavra(String palavra) {
        if (!palavra.isEmpty()) {
            return palavras.contains(palavra);
        } else {
            throw new RuntimeException("Set List está vazio");
        }
    }

    public void removerPalavra(String palavra) {
        if (!palavras.isEmpty()) {
            if (verificarPalavra(palavra)) {
                palavras.remove(palavra);
            } else {
                System.out.println("Palavra não encontrada");
            }
        } else {
            throw new RuntimeException("Conjunto esta vazio");
        }

    }

    public void exibirPalavrasUnicas() {
        System.out.println(palavras);
    }

    public static void main(String[] args) {
        ConjuntoPalavrasUnicas conjunto = new ConjuntoPalavrasUnicas();
//        conjunto.adicionarPalavra("Casa");
//        conjunto.adicionarPalavra("Carro");
//        conjunto.adicionarPalavra("fejão");
//        conjunto.adicionarPalavra("vinho");

        conjunto.exibirPalavrasUnicas();
        conjunto.verificarPalavra("Casa");
        conjunto.removerPalavra("Caa");
        conjunto.exibirPalavrasUnicas();
    }
}
