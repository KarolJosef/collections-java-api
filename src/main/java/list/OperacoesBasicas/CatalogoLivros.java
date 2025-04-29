package main.java.list.OperacoesBasicas;

import java.util.ArrayList;
import java.util.List;

public class CatalogoLivros {
    List<Livro> livro = new ArrayList<>();

    public void adicionarLivro(String titulo, String autor, int anoPublicacao) {
            livro.add(new Livro(titulo, autor, anoPublicacao));
    }
    public List<Livro>pesquisaPorAutor(String autor) {
        List<Livro> ListaPesquisaPorAutor = new ArrayList<>();
        for(Livro t : livro){
            if(!livro.isEmpty()){
                if(t.getAutor().equalsIgnoreCase(autor)){
                    ListaPesquisaPorAutor.add(t);
                }
            }else{
                System.out.println("Lista Vazia");
            }
        }
        return ListaPesquisaPorAutor;
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
        System.out.println(cv.pesquisaPorAutor("autor1"));

    }
}
