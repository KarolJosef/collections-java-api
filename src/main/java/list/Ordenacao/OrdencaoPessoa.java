package main.java.list.Ordenacao;

import javax.swing.plaf.basic.BasicDesktopIconUI;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class OrdencaoPessoa  {
    private List<Pessoa> pessoaList;

    public OrdencaoPessoa(){
        this.pessoaList = new ArrayList<>();
    }
    public void adidicionarPessoa(String nome,int idade, double altura){
        pessoaList.add(new Pessoa(nome, idade,altura));

    }

    public List<Pessoa> ordenacaoPorIdade(){
        List<Pessoa> pessoaPorIdade = new ArrayList<>(pessoaList);
        Collections.sort(pessoaPorIdade);
        return pessoaPorIdade;
    }

    public List<Pessoa> ordenarPorAltura(){
        List<Pessoa>pessoaPorAltura = new ArrayList<>(pessoaList);
        Collections.sort(pessoaPorAltura, new ComparatorPorAltura());
        return pessoaPorAltura;
    }
    public List<Pessoa > ordena() {
    pessoaList.sort((p1, p2) -> CharSequence.compare(p1.getNome(), p2.getNome()));
        return pessoaList;
    }


    public static void main(String[] args) {
        OrdencaoPessoa ordencaoPessoa = new OrdencaoPessoa();
        ordencaoPessoa.adidicionarPessoa("nomez", 30,1.67);
        ordencaoPessoa.adidicionarPessoa("nomea", 78, 1.89);
        ordencaoPessoa.adidicionarPessoa("nomeb", 46, 1.90);

        System.out.println("Ordenando por  nome" + ordencaoPessoa.ordena());
        System.out.println("================================================");
        System.out.println("ordenando por idade" + ordencaoPessoa.ordenacaoPorIdade());
        System.out.println("---------------------------------------------------------");
        System.out.println("ordenado por altura" + ordencaoPessoa.ordenarPorAltura());
        System.out.println();
    }

}
