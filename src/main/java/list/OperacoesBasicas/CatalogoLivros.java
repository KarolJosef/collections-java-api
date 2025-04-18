package main.java.list.OperacoesBasicas;

import java.util.ArrayList;
import java.util.List;

public class CatalogoLivros {
    List<Livro> livro = new ArrayList<>();

    public void adicionarLivro(String titulo, String autor, int anoPublicacao) {
            livro.add(new Livro(titulo, autor, anoPublicacao));
    }
    public List<Livro>livro(String autor) {
        List<Livro> pequisaPorAutor = new ArrayList<>();
        for(Livro t : livro){
            if(t.getAutor().equalsIgnoreCase(autor)){
                pequisaPorAutor.add(t);
            }
        }
        return pequisaPorAutor;
    }
    public void imprimirLista() {
        System.out.println(livro);
    }

    public static void main(String[] args) {
        CatalogoLivros cv = new CatalogoLivros();
        cv.adicionarLivro("titulo 1", "autor1", 1990);
        cv.adicionarLivro("titulo 2", "autor1", 1992);
        cv.adicionarLivro("titulo 3", "autorDiferente", 2089);
        cv.imprimirLista();
        cv.livro("autor1");
        System.out.println(cv.livro("autor1"));

    }
}
