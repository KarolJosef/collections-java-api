package main.java.list.OperacoesBasicas;

import java.util.ArrayList;
import java.util.List;

public class ListaTarefa {
    private List<Tarefa> tarefaList;

    public ListaTarefa(){
        this.tarefaList = new ArrayList<>();
    }

    public void adicionarTarefa(String descricao) {
        tarefaList.add(new Tarefa(descricao));
    }
    public void removerTarefa(String descricao) {
        List<Tarefa> tarefasParaRemover = new ArrayList<>();
        for(Tarefa t : tarefaList){
            if (t.getDescricao().equalsIgnoreCase(descricao)){
                tarefasParaRemover.add(t);
                System.out.println(tarefasParaRemover);
            }
        }
        tarefaList.removeAll(tarefasParaRemover);
    }

    public int obterNumeroTotalTarefas(){
        return tarefaList.size();
    }
    public void obterDescricoesTarefas(){
        System.out.println(tarefaList);
    }

    public static void main(String[] args) {
        ListaTarefa listTarefa = new ListaTarefa();
        System.out.println("O numero total de elementos na lista é: " +listTarefa.obterNumeroTotalTarefas());

        listTarefa.adicionarTarefa("tarefa1");
        listTarefa.adicionarTarefa("tarefa2");
        listTarefa.adicionarTarefa("tarefa3");
        System.out.println("O numero total de elementos na lista é: " +listTarefa.obterNumeroTotalTarefas());

        listTarefa.removerTarefa("tarefa1");
        System.out.println("O numero total de elementos na lista é: " +listTarefa.obterNumeroTotalTarefas());

        listTarefa.obterDescricoesTarefas();



    }
}
