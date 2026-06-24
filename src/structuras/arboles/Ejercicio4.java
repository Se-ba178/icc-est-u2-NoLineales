package structuras.arboles;

import structuras.nodes.Node;

public class Ejercicio4 {
    
    public void insert(int[] numeros) {
        BinaryTree<Integer> binario = new BinaryTree<>();
        for (int numero : numeros) {
            binario.insert(numero);
        }
        System.out.println("Arbol in order");
        printTree(binario.getRoot());
        //Guardar en una variable el metodo profundidad maxima 
        int profundidadMaxima = maxDepth(binario.getRoot());
        System.out.println("La profundidad máxima del árbol es: " + profundidadMaxima);
    }
    public int maxDepth(Node<Integer> root) {
        if (root == null) {
            return 0;
        }
        int profundidadIzquierda = maxDepth(root.getLeft());
        int profundidadDerecha = maxDepth(root.getRight());
        return Math.max(profundidadIzquierda, profundidadDerecha) + 1;
    }
    public void printTree(Node<Integer> root) {
        System.out.println("Input");
        printTreeFinal(root, 0);
    }
    public static void printTreeFinal(Node<Integer> actual, int root) {
        if (actual == null) {
            return;
        }
        printTreeFinal(actual.getLeft(), root + 1);
        System.out.println("\t".repeat(root) + actual.getValue());
        printTreeFinal(actual.getRight(), root + 1);
    }
}