package main.java.set.Pesquisa;

import java.util.HashSet;
import java.util.Set;

public class ListaTarefas {
    Set<Tarefa> tarefas;

    public ListaTarefas() {
        this.tarefas = new HashSet<>();
    }

    public void exibirTarefas() {
        System.out.println(tarefas);
    }

    public void adicionarTarefa(String descricao) {
        tarefas.add(new Tarefa(descricao));
    }

    public void removerTarefa(String descricao) {
        Tarefa tarefaARemover = null;
        if (tarefas.isEmpty()) {
            throw new RuntimeException("Conjunto vazio");
        }
        for (Tarefa t : tarefas) {
            if (t.getDescricao().equalsIgnoreCase(descricao)) {
                tarefaARemover = t;
                break;
            }
        }
        if (tarefaARemover != null) {
            tarefas.remove(tarefaARemover);
        } else {
            System.out.println("Descrição não encontrada");
        }
    }

    public void contarTarefas() {
        System.out.println("Quantidade de tarefas: " + tarefas.size());
    }

    public void marcarTarefaConcluida(String descricao) {
        for (Tarefa t : tarefas) {
            if (t.getDescricao().equalsIgnoreCase(descricao)) {
                t.setConcluida(true);
            }
        }
    }

    public void obterTarefasConcluidas() {
        Tarefa tarefasConcluida = null;
        for (Tarefa t : tarefas) {
            if (t.getConcluida()) {
                tarefasConcluida = t;
            }
        }
        if (tarefasConcluida == null) {
            System.out.println("Não há tarefas concluidas");
        } else {
            System.out.println(tarefasConcluida);
        }
    }


    public static void main(String[] args) {
        ListaTarefas tarefa = new ListaTarefas();
        tarefa.adicionarTarefa("tarefa1");
        tarefa.adicionarTarefa("tarefa2");
        tarefa.adicionarTarefa("tarefa3");

        tarefa.exibirTarefas();
        tarefa.removerTarefa("tarefa2");
        tarefa.exibirTarefas();
        tarefa.contarTarefas();
        tarefa.marcarTarefaConcluida("tarefa3");
        tarefa.exibirTarefas();
        tarefa.obterTarefasConcluidas();

    }
}
