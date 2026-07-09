package structuras.graphs;

import java.util.List;
import java.util.Set;

import structuras.nodes.Node;

public class PathResult<T> {
    private final Set<T> visitados;
    private final Set<T> path;
    
    public PathResult(Set<T> visitados, Set<T> path) {
        this.visitados = visitados;
        this.path = path;
    }
    public Set<T> getVisitados() {
        return visitados;
    }
    public Set<T> getPath() {
        return path;
    }
    @Override
    
        public String toString() {
        return "PathResult [\n visitados=" + visitados + 
        (!path.isEmpty() 
        ?  "Path= " + path
        
        :" \n No se encontro camino entre los nodos ");
    }
    
    
}
