package Main;

import Grafo.Grafo;
import Grafo.No;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Grafo<String> grafo = new Grafo<>();
        
        No<String> A = new No<String>("A");
        No<String> B = new No<String>("B");
        No<String> C = new No<String>("C");
        
        grafo.inserirNo(A);
        grafo.inserirNo(B);
        grafo.inserirNo(C);
        
        A.conectarA(B);
        A.conectarA(C);
        B.conectarA(C);
        
        ArrayList<No> nos = grafo.ordenacaoTopologica();
        
        for (No<String> no: nos) {
            System.out.println(no.valor);
        }
    }
}
