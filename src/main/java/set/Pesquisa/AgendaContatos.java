package main.java.set.Pesquisa;

import java.util.HashSet;
import java.util.Set;

public class AgendaContatos {

    private Set<Contato> contatoSet;

    public AgendaContatos() {
        this.contatoSet= new HashSet<>();
    }
    public void adicionarContato(String nome, int numero){
        this.contatoSet.add(new Contato(nome, numero));
    }
    public  void exibirContato(){
        System.out.println(contatoSet);
    }
    public Set<Contato>  pesquisarPorNome(String nome){
        Set<Contato>contatosPorNome = new HashSet<>();
        for (Contato c : contatoSet){
            if (c.getNome().startsWith(nome)){
                contatosPorNome.add(c);
            }
        }
        return contatosPorNome;
    }
    public Contato atualizarNumeroContato(String nome,int numero) {
        Contato contatoAtualizado = null;
        for (Contato c : contatoSet){
            if(c.getNome().equalsIgnoreCase(nome)){
                c.setNumero(numero);
                contatoAtualizado =  c;
                break;
            }
        }
        return contatoAtualizado;
    }

    public static void main(String[] args) {
        AgendaContatos agendaContatos = new AgendaContatos();

        agendaContatos.exibirContato();
        agendaContatos.adicionarContato("Camila", 123456);
        agendaContatos.adicionarContato("Camila"  , 1111);
        agendaContatos.adicionarContato("Aloizio Camila Cavalcante", 11111111);
        agendaContatos.adicionarContato("Camila DIO" , 98765);

        agendaContatos.exibirContato();
        System.out.println("=============================================");
        System.out.println(agendaContatos.pesquisarPorNome("Camila"));


        System.out.println("contato atualizado: " + agendaContatos.atualizarNumeroContato("Camila", 890987) );
        agendaContatos.exibirContato();

    }

}
