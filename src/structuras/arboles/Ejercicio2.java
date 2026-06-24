package structuras.arboles;

import structuras.nodes.Node;

public class Ejercicio2 {

    public Node<Integer> invert(Node<Integer> root) {
        return invertRecursive(root);
    }
    public void insert(int[] numeros) {
        BinaryTree<Integer> binario = new BinaryTree<>();
        for (int numero : numeros) {
            binario.insert(numero);
        }
        System.out.println("Arbol in order");
        printTree(binario.getRoot());
        Node<Integer> invertido = invert(binario.getRoot());

        System.out.println("Arbol invertido");
        printTree(invertido);

    }
    private Node<Integer> invertRecursive(Node<Integer> root) {
        if (root == null) {
            return null;
        }
        Node<Integer> left = invertRecursive(root.getLeft());
        Node<Integer> right = invertRecursive(root.getRight());
        root.setLeft(right);
        root.setRight(left);
        return root;
    }

    public void printTree(Node<Integer> root) {
        System.out.println("Imprimiendo el arbol");
        printTreeFinal(root, 0);
    }
    public static void printTreeFinal(Node<Integer> actual, int root) {
        if (actual == null) {
            return;
        }
        printTreeFinal(actual.getRight(), root + 1);
        System.out.println("\t".repeat(root) + actual.getValue());
        printTreeFinal(actual.getLeft(), root + 1);
    }

}