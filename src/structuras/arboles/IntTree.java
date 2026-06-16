package structuras.arboles;

public class IntTree {
    private Node<Interger> rool;

    public IntTree(){
        this.rool = null;
    }

    public void insertar(int value){
        rool = insertRec(rool , value);
        

    }




    
}
