package structuras.graphs;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

import structuras.nodes.Node;

public class Graph<T> {
    // Set HasSet, TreSet, Map, Hash , Tree Map
    
    private Map<Node<T>, Set<Node<T>>> graph;
    
    public Graph(){
        this.graph = new HashMap<Node<T>, Set<Node<T>>>();
        

    }
    public void add(T data){
        Node<T> node = new Node<T>(data);
        // if(! graph.containsKey(node)){
        //     graph.put(node, new HashSet<Node<T>>());
        // }
        graph.putIfAbsent(node, new HashSet<Node<T>>());  //--> Es lo mismo que las tres lineas del if 
    }

    public void addEdge(T v1, T v2){
        Node<T> nv1 = new Node<T>(v1);
        Node<T> nv2 = new Node<T>(v2);

        add(v1);
        add(v2);

        graph.get(nv1).add(nv2);
        graph.get(nv2).add(nv1);
    }

    public void addEdge(Node<T> nv1, Node<T> nv2){
        graph.get(nv1).add(nv2);
        graph.get(nv2).add(nv1);
    }

    public void addEdgeUni(T v1, T v2){
        Node<T> nv1 = new Node<T>(v1);
        Node<T> nv2 = new Node<T>(v2);
        add(v1);
        add(v2);
        graph.get(nv1).add(nv2);     // Uno le conoce al otro
    }
    public void printGraph(){
        for (Map.Entry<Node<T>, Set<Node<T>>> entry : graph.entrySet() ){
            System.out.print(entry.getKey() + "--> ");
            for(Node<T> coneccion : entry.getValue()){
                System.out.print(coneccion);
            }

            System.out.println();

        }
    }




    

}
