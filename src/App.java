// import java.net.Socket;
// import java.util.LinkedList;
// import java.util.List;
// import java.util.Random;

import java.util.List;
import java.util.Set;
import java.util.TreeSet;

import collections.mapas.Maps;
import collections.sets.Sets;
// import models.Person;
// import structuras.arboles.BinaryTree;
// import structuras.arboles.Ejercicio1;
// import structuras.arboles.Ejercicio2;
// import structuras.arboles.Ejercicio3;
// import structuras.arboles.Ejercicio4;
// import structuras.arboles.IntTree;
// import structuras.nodes.Node;
import models.Contacto;
import structuras.graphs.Graph;
import structuras.graphs.PathResult;
import structuras.graphs.implementations.DFSPathFinder;

public class App {
    public static void main(String[] args) throws Exception {
        // runIntTree();
        // runPersonTree();
        // runEjercicio();
        // runEjercicio2();
        // runEjercicio3();
        // runEjercicio4();
        // runSets();
        // runMaps();
        // runGraphs();
        runGrafoDos();
        
        
        

    }

    private static void runGrafoDos() {
        Graph<String> g = new Graph<>();
        g.addEdge("A", "B");
        g.addEdge("A", "C");
        g.addEdge("B", "D");
        g.addEdge("C", "J");
        g.addEdge("D", "F");
        g.addEdgeUni("D", "E");
        g.addEdge("E", "F");
        g.addEdgeUni("K", "J");
        DFSPathFinder<String> dfs = new DFSPathFinder<String>();
        PathResult<String> result = dfs.find(g, "A", "F");
        PathResult<String> result2 = dfs.find(g, "A", "J");
        PathResult<String> result3 = dfs.find(g, "A", "K");
        System.out.println(result);
        System.out.println("------------");
        System.out.println(result2);
        System.out.println("-----------");
        System.out.println(result3);

    }

    // private static void runGraphs() {
    //     Graph<String> grafo = new Graph<>();
    //     grafo.add("A");
    //     grafo.add("B");
    //     grafo.add("C");
    //     grafo.add("D");
    //     grafo.add("J");
  
        
    //     grafo.addEdgeUni("A", "B");
    //     grafo.addEdgeUni("B", "C");
    //     grafo.addEdgeUni("C", "A");
    //     grafo.addEdgeUni("B", "D");
    //     grafo.addEdge("J", "D");
    //     grafo.addEdge("D", "C");


    //     grafo.printGraph();
        
    // }

    // private static void runSets() {
    //     Sets sets = new Sets();
    //     //Primera implementacion HashSet
    //     System.out.println();
    //     System.out.println("----- HashSet -----");
    //     Set<String> hashSet = sets.construirHashSet();   //No permite duplicados
    //     System.out.println(hashSet);
    //     System.out.println("Tamaño :" + hashSet.size());
    //     System.out.println(hashSet.contains("F"));

    //     //Segunda implementacion 
    //     System.out.println();
    //     Set<String> lhSets = sets.construirLinkedHashSet();
    //     System.out.println("----- LinkedHashSet -----");
    //     System.out.println(lhSets);
    //     System.out.println("Tamaño :" + lhSets.size());
    //     System.out.println(lhSets.contains("D"));

    //     //Tercera Implemetacion
    //     System.out.println();
    //     Set<String> Tset = sets.construirTreeSet();
    //     System.out.println("----- TreeSet -----");
    //     System.out.println(Tset);                    //Solo compara el primer caracter
    //     System.out.println("Tamaño :" + Tset.size());
    //     System.out.println(Tset.contains("D"));

    //     //Cuarta Implemetacion
    //     System.out.println();
    //     Set<Contacto> tCSet = sets.construirTreeSetConComparador();
    //     System.out.println("----- TreeSet  con comparador-----");
    //     System.out.println(tCSet);                    //Solo compara el primer caracter
    //     System.out.println("Tamaño :" + tCSet.size());
        

    //     //Quinta
    //     System.out.println();
    //     Set<Contacto> hCoSet = sets.construirHashSetContacto();
    //     System.out.println("----- hashSetConatcto-----");
    //     System.out.println(hCoSet);                    //Solo compara el primer caracter
    //     System.out.println("Tamaño :" + hCoSet.size());
        
    // }
    
    // private static void runMaps(){
    //     Maps maps = new Maps();
    //     maps.construirHashMap();
    //     System.out.println("---------------");
    //     maps.contruirLinkedHashMap();
    //     System.out.println("-------------");
    //     maps.construirTreeMap();
    // }

    // public void eliminarDuplicadosAndSort(List<Contacto> contactos){
    //           //Antes era con for y otro for hy tanta cosa 
    //         Set<Contacto> tset = new TreeSet<>();
    //         for(Contacto contacto : contactos){
    //             tset.add(contacto);
                
    //         }

        


    // }



    // private static void runIntComparativaPesos() {
    // IntTree tree = new IntTree();
    // Random random = new Random();

    // final int TOTAL_NODOS = 50_000;
    // final int MIN = 1;
    // final int MAX = 50_000;

    // // Insertar 50 000 números aleatorios entre 1 y 50 000
    // for (int i = 0; i < TOTAL_NODOS; i++) {
    // int value = random.nextInt(MAX - MIN + 1) + MIN;
    // tree.insert(value);
    // }

    // // Medir peso con variable acumulada
    // long inicioPesoVariable = System.nanoTime();

    // int pesoVariable = tree.getPeso();

    // long finPesoVariable = System.nanoTime();

    // double tiempoPesoVariableMs = (finPesoVariable - inicioPesoVariable) /
    // 1_000_000.0;

    // // Medir peso recursivo
    // long inicioPesoRecursivo = System.nanoTime();

    // int pesoRecursivo = tree.peso();

    // long finPesoRecursivo = System.nanoTime();

    // double tiempoPesoRecursivoMs = (finPesoRecursivo - inicioPesoRecursivo) /
    // 1_000_000.0;

    // // Resultados
    // System.out.println("Cantidad de nodos insertados: " + TOTAL_NODOS);
    // System.out.println("Peso usando variable: " + pesoVariable);
    // System.out.println("Peso usando recursion: " + pesoRecursivo);

    // System.out.println();

    // System.out.println("Tiempo getPeso(): "
    // + tiempoPesoVariableMs + " ms");

    // System.out.println("Tiempo pesoRecursivo(): "
    // + tiempoPesoRecursivoMs + " ms");
    // }

    // private static void runPersonTree(){
    // BinaryTree<Person> personTree = new BinaryTree<>();
    // personTree.insert(new Person("Alice", 30));
    // personTree.insert(new Person("Bob", 25));
    // personTree.insert(new Person("Diego", 35));
    // personTree.insert(new Person("Rafael", 35));
    // personTree.insert(new Person("Ana", 35));

    // System.out.println("iN ORDER" );
    // personTree.inOrder();
    // System.out.println();
    // System.out.println("PRE ORDER ");
    // personTree.preOrder();

    // }

    // private static void runIntTree(){
    // IntTree arbolNumeros = new IntTree();

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

    // arbolNumeros.insert(10);
    // arbolNumeros.insert(5);
    // arbolNumeros.insert(3);
    // arbolNumeros.insert(8);
    // arbolNumeros.insert(20);
    // arbolNumeros.insert(15);

    // System.out.println("Pos order");
    // arbolNumeros.posOrder();
    // System.out.println("Pre order");
    // arbolNumeros.preOrder();
    // System.out.println("In Order");
    // arbolNumeros.inOrder();
    // System.out.println();
    // System.out.println("Anchura");
    // arbolNumeros.Anchura();
    // System.out.println();
    // System.out.println("Altura ; ");
    // arbolNumeros.altura();
    // System.out.println(arbolNumeros.altura());

    // System.out.println("Peso ; ");
    // arbolNumeros.peso();
    // System.out.println(arbolNumeros.peso());

    // }

    // 
    

    //EJERCICIO DE GRAFOS


}
