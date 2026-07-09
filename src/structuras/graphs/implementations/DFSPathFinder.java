package structuras.graphs.implementations;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

import structuras.graphs.Graph;
import structuras.graphs.PathFinder;
import structuras.graphs.PathResult;
import structuras.nodes.Node;

public class DFSPathFinder<T> implements PathFinder<T> {

    @Override
    public PathResult<T> find(Graph<T> graph, T start, T end) {
        Set<T> visited = new LinkedHashSet<>();
        Set<T> path = new LinkedHashSet<>();

        boolean encontrado = dfs(graph, start, end, visited, path);
        if (!encontrado) {
            path.clear();
        }

        return new PathResult<>(visited, path);

    }

    private boolean dfs(Graph<T> graph, T current, T end, Set<T> visited, Set<T> path) {

        visited.add(current);
        path.add(current);

        // Caso base
        Node<T> nC = new Node<T>(current);
        Node<T> nE = new Node<T>(end);

        if (nC.equals(nE)) {
            return true;

        }
        // Metodo recursivo

        for (Node<T> vecino : graph.getVecinos(current)) {
            if (!visited.contains(vecino.getValue())) {
                boolean encontrado = dfs(graph, vecino.getValue(), end, visited, path);
                if (encontrado) {
                    return true;

                }
            }
        }
        path.remove(current);

        return false;

    }

}
