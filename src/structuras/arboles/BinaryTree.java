package structuras.arboles;

import java.util.LinkedList;
import java.util.Queue;

import structuras.nodes.Node;

public class BinaryTree <T extends Comparable<T>>{

    private Node<T> root;
    private int peso;  //Variable para hacer la complejidad de peso recursivo O(n)--> a O(1) con el getPeso creado nuevo 

    public BinaryTree() {
        this.root = null;
    }

    public boolean isEmpty() {
        return root == null;
    }

    public Node<T> getRoot() {
        return root;
    }

    public void setRoot(Node<T> node) {
        root = node;
    }

    //Se crea una variable y se le va a sumar cuando se inserte un nodo y se crea un get para retornar el peso y le hicimos a una O(1)
    public int getPeso(){
        return peso;
    }

    public void setRoot(T value) {
        Node<T> node = new Node<T>(value);
        root = node;
    }

    public void insert(T value) {
        Node<T> node = new Node<T>(value);
        root = insertRecursive(root, node);
        peso ++ ; 
    }

    // Arbol binario creacion
    private Node<T> insertRecursive(Node<T> actual, Node<T> nodeIngresado) {
        if (actual == null) {
            return nodeIngresado;
        }
        // Validar si es mayor o menor y decidir si lo ingreso a la derecha o a la
        // izquierda
        if (actual.getValue().compareTo(nodeIngresado.getValue()) > 0 ) {       //PREGUNTA DE PRUEBA 
            actual.setLeft(insertRecursive(actual.getLeft(), nodeIngresado)); /// Izquierda se guarda
        } else {
            actual.setRight(insertRecursive(actual.getRight(), nodeIngresado));// A la derecha

        }

        return actual;

    }

    public void preOrder() {

        preOrderRecursivo(root);

    }

    private void preOrderRecursivo(Node<T> actual) {
        if (actual == null) {
            return;
        }

        System.out.println(actual + " ");
        // Subarbol izquierdo
        preOrderRecursivo(actual.getLeft());
        // SubArbol izquierdo
        preOrderRecursivo(actual.getRight());

    }

    public void posOrder() {
        posOrderRecursivo(root);
    }

    private void posOrderRecursivo(Node<T> actual) {
        if (actual == null) {
            return;
        }

        // Recorrer subárbol izquierdo
        posOrderRecursivo(actual.getLeft());

        // Recorrer subárbol derecho
        posOrderRecursivo(actual.getRight());

        // Visitar la raíz (nodo actual)
        System.out.print(actual.getValue() + " ");
    }

    public void inOrder() {
        inOrderRecursivo(root);
    }

    private void inOrderRecursivo(Node<T> actual) {
        if (actual == null) {
            return;
        }
        // Recorrer subárbol izquierdo
        inOrderRecursivo(actual.getLeft());

        // Visitar la raíz (nodo actual)
        System.out.println(actual.getValue() + " ");

        // Recorrer subárbol derecho
        inOrderRecursivo(actual.getRight());

    }

    public void Anchura() {
        if (root == null) {
            return;
        }

        Queue<Node<T>> cola = new LinkedList<>();
        cola.add(root);

        while (!cola.isEmpty()) {
            // Sacamos el primer nodo de la cola
            Node<T> actual = cola.poll();
            System.out.print(actual.getValue() + " ");

            // Si el nodo tiene hijo izquierdo a la cola
            if (actual.getLeft() != null) {
                cola.add(actual.getLeft());
            }

            // Si el nodo tiene hijo derecho a la cola
            if (actual.getRight() != null) {
                cola.add(actual.getRight());
            }
        }
    }

    //Anchura


    public int altura() {
        return alturaRecursivo(root);
    }

    private int alturaRecursivo(Node<T> actual) {
        // Caso base: si el nodo es nulo, la altura es 0
        if (actual == null) {
            return 0;
        }

        // Calculamos la altura de cada lado
        int leftHeight = alturaRecursivo(actual.getLeft());
        int rightHeight = alturaRecursivo(actual.getRight());

        // La altura es el mayor de los dos lados + 1 (por el nodo actual)
        return 1 + Math.max(leftHeight, rightHeight);
    }

    //Cantidad de nodos totales == Peso  O(2n)
    public int peso(){
        return pesoRecursivo(root);

        
    }

    private int pesoRecursivo(Node<T> actual) {
        if(actual == null){
            return 0;
        }

        // Calculamos la altura de cada lado
        int leftHeight = pesoRecursivo(actual.getLeft());
        int rightHeight = pesoRecursivo(actual.getRight());

        //Se suma en vez 
        return (leftHeight + rightHeight) + 1;
    }

    

    


}
