package structuras.arboles;

import structuras.nodes.Node;

public class IntTree {
    private Node<Integer> root; 

    public IntTree() {
        this.root = null;
    }

    
    public boolean isEmpty() {
        return root == null;
    }

    
    public Node<Integer> getRoot() {
        return root;
    }
    public void setRoot(Node<Integer> node){
        root = node;
    }

    public void setRoot(Integer value){
        Node<Integer> node = new Node<Integer>(value);
        root = node;
    }

    public void insert(Integer value){
        Node<Integer> node = new Node<Integer>(value);
        root = insertRecursive(root, node);
    }

    //Arbol binario creacion
    private Node<Integer> insertRecursive(Node<Integer> actual, Node<Integer> nodeIngresado) {
        if(actual == null){
            return nodeIngresado;

        }
        //Validar si es mayor o menor y decidir si lo ingreso a la derecha o a la izquierda 
        if(actual.getValue() > nodeIngresado.getValue() ){
            actual.setLeft(insertRecursive(actual.getLeft(), nodeIngresado)); ///Izquierda se guarda 
        }else{
            actual.setRight(nodeIngresado); //A la derecha 

        }

    
        return actual;
    
    }

    public void preOrder(){

        preOrderRecursivo(root);

    }


    private void preOrderRecursivo(Node<Integer> actual) {
        if(actual == null){
            return ;
        }


        System.out.println(actual + " ");
        //Subarbol izquierdo
        preOrderRecursivo(actual.getLeft());
        //SubArbol izquierdo
        preOrderRecursivo( actual.getRight());

    }

    public void posOrder(){
        posOrderRecursivo(root);
    }


   

    private void posOrderRecursivo(Node<Integer> actual) {
        if (actual == null) {
            return;
        }

        // 1. Recorrer subárbol izquierdo
        posOrderRecursivo(actual.getLeft());
        
        // 2. Recorrer subárbol derecho
        posOrderRecursivo(actual.getRight());
        
        // 3. Visitar la raíz (nodo actual)
        System.out.print(actual.getValue() + " "); 
    }






}
