package structuras.graphs;
//Interface --> 
// -No contiene logica interna  
// -Define los  metoso
// -No se puede instanciar
 public interface PathFinder <T>{
    PathResult<T> find(Graph<T> graph, T start, T end);
}
