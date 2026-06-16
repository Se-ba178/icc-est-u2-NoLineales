package structuras.nodes;


public class Node<T> {
    
    private T value;
    private Node<T> left;
    private Node<T> rigth;

    public Node (T value){
        this.value = value;
        this.

    }

    public T getValue() {
        return value;
    }

    public void setValue(T value) {
        this.value = value;
    }

    public Node<T> getLeft() {
        return left;
    }

    public void setLeft(Node<T> left) {
        this.left = left;
    }

    public Node<T> getRigth() {
        return rigth;
    }

    public void setRigth(Node<T> rigth) {
        this.rigth = rigth;
    }

    @Override
    public String toString() {
        return "Node [value=" + value + "]";
    }
    

    
}
