package Main;

import Grafo.Grafo;
import Grafo.No;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Grafo<String> grafo = new Grafo<>();
        
        No<String> A = new No<>("A");
        No<String> B = new No<>("B");
        No<String> C = new No<>("C");
        
        grafo.inserirNo(A);
        grafo.inserirNo(B);
        grafo.inserirNo(C);
        
        A.conectarA(B);
        B.conectarA(A);
        C.conectarA(A);
        
        ArrayList<No> nos = grafo.ordenacaoTopologica();
        
        for (No<String> no: nos) {
            System.out.println(no.getValor());
        }
        
        ArrayList<ArrayList<No<String>>> cmpn = grafo.fortementeConexos();
        
        for (ArrayList<No<String>> lista: cmpn) {
            System.out.println("Lista:");
            for (No<String> no: lista) {
                System.out.println(no.getValor());
            }
        }
    }
}
