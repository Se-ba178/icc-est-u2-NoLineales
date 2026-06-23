package structuras.arboles;

import structuras.nodes.Node;

public class Ejercicio2 {

    public Node<Integer> invert(Node<Integer> root) {
        return invertRecursive(root);
    }

    private Node<Integer> invertRecursive(Node<Integer> root) {

        if (root == null) {
            return null;
        }

        Node<Integer> temp = root.getLeft();

        root.setLeft(root.getRight());
        root.setRight(temp);

        return root;

    }

    public static void  printTree(Node<Integer> actual , int root){
        if (actual == null) {
            return;
        }

        printTree(actual.getRight(), root + 1);

        System.out.println("\t".repeat(root) + actual.getValue());

        printTree(actual.getLeft(), root + 1);



    }


}