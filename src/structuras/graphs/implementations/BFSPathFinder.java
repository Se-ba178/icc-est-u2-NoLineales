package structuras.graphs.implementations;

import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.Map;
import java.util.Queue;
import java.util.Set;
import java.util.Stack;

import structuras.graphs.Graph;
import structuras.graphs.PathFinder;
import structuras.graphs.PathResult;
import structuras.nodes.Node;

public class BFSPathFinder<T> implements PathFinder<T> {

    @Override
    public PathResult<T> find(Graph<T> graph, T start, T end){

        // Cola para recorrer el grafo
        Queue<T> queue = new LinkedList<>();

        // Guarda los nodos ya vistos
        Set<T> visitados = new LinkedHashSet<>();

        // Guarda de dónde viene cada nodo
        Map<Node<T>, Node<T>> parent = new LinkedHashMap<>();

        // Guarda el orden del recorrido
        Set<T> viseted = new LinkedHashSet<>();

        // Empieza desde el nodo inicial
        queue.add(start);
        visitados.add(start);
        parent.put(new Node<>(start), null);

        // Mientras haya nodos por revisar
        while (!queue.isEmpty()) {

            // Saca el primer nodo
            T current = queue.poll();
            viseted.add(current);

            // Si llegó al final
            if(current.equals(end)){
                return new PathResult<>(viseted, buildPath(parent, end));
            }

            // Revisa los vecinos
            for (Node<T> vecino : graph.getVecinos(current)) {

                // Si no fue visitado
                if(!visitados.contains(vecino.getValue())){
                    visitados.add(vecino.getValue());
                    parent.put(vecino, new Node<>(current));
                    queue.add(vecino.getValue());
                }
            }
        }

        // Si no encontró el destino
        return new PathResult<>(viseted, new HashSet<>());
    }

    // Arma el camino encontrado
    private Set<T> buildPath(Map<Node<T>, Node<T>> parent, T end) {

        Set<T> path = new LinkedHashSet<>();
        Node<T> nEnd = new Node<>(end);
        Stack<T> pila = new Stack<>();

        // Va hacia atrás hasta el inicio
        for (Node<T> at = nEnd; at != null; at = parent.get(at)) {
            pila.push(at.getValue());
        }
        while (!pila.isEmpty()) {
            path.add(pila.pop());
        }
        
        
        return  path;
    }
}