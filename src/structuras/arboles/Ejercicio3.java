package structuras.arboles;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

import structuras.nodes.Node;

public class Ejercicio3 {
    private BinaryTree<Integer> arbol = new BinaryTree<>();
    public void insert(int[] numeros) {
        // 1. Inserción de datos en el árbol
        for (int numero : numeros) {
            arbol.insert(numero);
        }  
        List<LinkedList<Integer>> niveles = listLevels(arbol.getRoot());
        System.out.println("Ejercicio 3 :");
        System.out.println("Entrada:");
        int espaciosArbol = niveles.size() * 4;
        for (LinkedList<Integer> nivel : niveles) {
            for (int i = 0; i < espaciosArbol; i++) {
                System.out.print(" ");
            }
            for (Integer valor : nivel) {
                System.out.print(valor + "   ");
            }
            System.out.println();
            espaciosArbol -= 2;
        }
        System.out.println();
        System.out.println("Salida:");
        imprimirNiveles(niveles);
    }
    public List<LinkedList<Integer>> listLevels(Node<Integer> root) {
        List<LinkedList<Integer>> nivelesLista = new ArrayList<>();
        if (root == null) {
            return nivelesLista;
        }
        listarNiveles(root, 0, nivelesLista);
        return nivelesLista;
    }
    private void listarNiveles(Node<Integer> actual, int nivel, List<LinkedList<Integer>> nivelesLista) {
        if (actual == null) {
            return;
        }
        if (nivelesLista.size() == nivel) {
            nivelesLista.add(new LinkedList<>());
        }
        nivelesLista.get(nivel).add(actual.getValue());
        listarNiveles(actual.getLeft(), nivel + 1, nivelesLista);
        listarNiveles(actual.getRight(), nivel + 1, nivelesLista);
    }
    public void imprimirNiveles(List<LinkedList<Integer>> nivelesLista) {
        for (LinkedList<Integer> nivel : nivelesLista) {
            for (int i = 0; i < nivel.size(); i++) {
                System.out.print(nivel.get(i));
                if (i < nivel.size() - 1) {
                    System.out.print(" -> ");
                }
            }
            System.out.println();
        }
    }

}
