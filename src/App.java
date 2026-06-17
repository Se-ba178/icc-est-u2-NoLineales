import java.net.Socket;

import structuras.arboles.IntTree;
import structuras.nodes.Node;

public class App {
    public static void main(String[] args) throws Exception {
        runIntTree();
    }

    private static void runIntTree(){
        IntTree arbolNumeros = new IntTree();

        // arbolNumeros.setRoot(10);
        // System.out.println("Raiz" + arbolNumeros.getRoot());

        // Node<Integer> node2 = new Node<>(20);
        // Node<Integer> node3 = new Node<>(30);
        // Node<Integer> node4 = new Node<>(40);
        // Node<Integer> node5 = new Node<>(50);

        // Node<Integer> root = arbolNumeros.getRoot();
        // root.setLeft(node2);
        // root.setRight(node3);

        // node2.setLeft(node3);
        // node4.setLeft(node4);
        // node5.setLeft(root);
        
        arbolNumeros.insert(10);
        arbolNumeros.insert(20);
        arbolNumeros.insert(30);
        arbolNumeros.insert(40);
        arbolNumeros.insert(50);

        System.out.println("Pos order");
        arbolNumeros.posOrder();
        System.out.println("Pre order");
        arbolNumeros.preOrder();

        
        


    }
}
