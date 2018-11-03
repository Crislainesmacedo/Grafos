package Grafo;

import java.util.ArrayList;
import java.util.Collections;

public class No<E> {

    ArrayList<Conexao<E>> ligadoA;
    public E valor;
    public int grauDeEntrada;
    boolean visitado;

    public No(E valor) {
        ligadoA = new ArrayList<>();
        this.valor = valor;
        this.grauDeEntrada = 0;
    }

    public void conectarA(No<E> no) {
        no.grauDeEntrada++;
        ligadoA.add(new Conexao<E>(no));
    }

    public void conectarEspelho(No<E> no) {
        no.grauDeEntrada++;
        conectarA(no);
        no.conectarA(this);
    }

    public void conectarA(No<E> no, double valor) {
        no.grauDeEntrada++;
        ligadoA.add(new Conexao<E>(no, valor));
    }

    public void conectarEspelho(No<E> no, double valor) {
        grauDeEntrada++;
        no.grauDeEntrada++;
        conectarA(no, valor);
        no.conectarA(this, valor);
    }
    
    void resetarGrau () {
        grauDeEntrada = ligadoA.size();
    }

    public void remover(No<E> no) {
        ligadoA.removeAll(Collections.singleton(new Conexao<E>(no)));
    }
}
