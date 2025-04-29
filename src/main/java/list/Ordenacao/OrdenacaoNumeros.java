package main.java.list.Ordenacao;

import java.util.ArrayList;

import java.util.Collections;
import java.util.List;
public class OrdenacaoNumeros  {

        public class Numero implements Comparable<Numero> {
            int valor;
            public Numero (int valor){
                this.valor = valor;
            }

            public int getValor() {
                return valor;
            }

            @Override
            public String toString() {
                return "Numero{" +
                        "valor=" + valor +
                        '}';
            }

            @Override
            public int compareTo(Numero n) {
                return Integer.compare(valor, n.getValor());
            }

        }


      private List<Numero> numeros;

      public OrdenacaoNumeros() {
            this.numeros = new ArrayList<>();
        }

    public  List<Numero> ordenarNumerosCrescente(){
      List<Numero>listaOrdenada = new ArrayList<Numero>(numeros);
        Collections.sort(listaOrdenada);
      return listaOrdenada;
    }

    public List<Numero>OrdenarNumerosDecrescente(){
      List<Numero>listaOrdenada = new ArrayList<Numero>(numeros);
      Collections.sort(listaOrdenada);
      Collections.reverse(listaOrdenada);
      return listaOrdenada;
    }

    public void adicionarNumero(int numero){
        numeros.add(new Numero(numero));
    }

    public static void main(String[] args) {
          OrdenacaoNumeros ordenacaoNumeros = new OrdenacaoNumeros();
          ordenacaoNumeros.adicionarNumero(9);
          ordenacaoNumeros.adicionarNumero(1);
          ordenacaoNumeros.adicionarNumero(8);
          ordenacaoNumeros.adicionarNumero(2);
          ordenacaoNumeros.adicionarNumero(7);
          ordenacaoNumeros.adicionarNumero(3);
          ordenacaoNumeros.adicionarNumero(6);
          ordenacaoNumeros.adicionarNumero(4);

        System.out.println(ordenacaoNumeros);
        System.out.println("Lista ordenada Crescente" + ordenacaoNumeros.ordenarNumerosCrescente());
        System.out.println("============================================================");
        System.out.println("Lisa ordenada Decrecente" + ordenacaoNumeros.OrdenarNumerosDecrescente());
    }



}



