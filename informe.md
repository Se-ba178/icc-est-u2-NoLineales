## Informe Ejercicio hechos en Clase de Arboles Binarios

Nombre: Christian Villa

Fecha: 22/06/2026

Practica: Ejercicios hechos en clase 

# Ejercicios
## Ejercicio 1
`Arbol en in-orden en vertical`
Clase Ejercicio 1 - Metodos:
```java
public void insert(int[] numeros) {
        BinaryTree<Integer> binario = new BinaryTree<>();
        for (int numero : numeros) {
            binario.insert(numero);
        }
        System.out.println("Arbol in order");
        printTree(binario.getRoot());
}
```

Metodo Insert del Ejercicio 1 : Lo que hace este metodo es crear un arbol binario vacio y con el `for`  va colocando cada numero del arreglo dentro del arbol  , y al final lo imprime en In-Order

```java
    public void printTree(Node<Integer> root) {
        System.out.println("Imprimiendo el arbol");
        printTreeRecursivo(root, 0);
    }

    
    public void printTreeRecursivo(Node<Integer> actual, int nivel) {
        if (actual == null) {
            return;
        }
        printTreeRecursivo(actual.getRight(), nivel + 1);
        System.out.println("\t".repeat(nivel) + actual.getValue());
        printTreeRecursivo(actual.getLeft(), nivel + 1);
    }
```
Metodos `printTree` y `printTreeRecursivo` del Ejercicio 1 : El primer metodo es solo el que va a iniciar todo el proceso empezando desde la raiz y llamando al metodo `printTreeRecursivo` y le indica que tiene q ir desde el nivel 0 .Ahora el metodo `printTreeRecursivo` es el que va a recorrer de forma recurisiva todo el arbol  empezando por el lado derecho despues el nodo actual y al ultimo el nodo izquierdo y al final podremos ver en la terminal la imp#resion del arbol en forma vertical.

### App
```java
    private static void runEjercicio() {
        Ejercicio1 ejercicio = new Ejercicio1();

        int[] datos = new int[] { 5, 3, 7, 2, 4, 6, 8 };
        ejercicio.insert(datos);

    }
```
App Del Ejercicio 1: Para hacer mas facil la llamada en el app hacemos un metodo que se llame `runEjercicio()` en el cual vamos a insertar el arreglo de numeros que hayamos tenido como ejemplo y despues llamar al metodo insert de la clase `Ejercicio1` el cual nos dara el arbol binario ya hecho y listo para mostrar en el terminal. y lo llamamos solamente con `  runEjercicio(); `

### Impresion en el Terminal

![alt text](image-1.png)


## Ejercicio 2 
`Imprimir un arbol original y un arbol invertido`
Clase Ejercicio2 - Metodos:
```java
    public Node<Integer> invert(Node<Integer> root) {
        return invertRecursive(root);
    }
```
Metodo `invert` del Ejercicio1: Este metodo es el que va a recibir la raiz de un arbol ,Este metodo manda  a otro metodo `invertRecursive` y manda dicha raiz  para que el otro metodo haga todo lo de invertir y eso.

```java
    private Node<Integer> invertRecursive(Node<Integer> root) {

       // Caso base: si el nodo es null, no hay nada que invertir
        if (root == null) {
          return null;
        }

        // Llamada recursiva para invertir el subárbol izquierdo
        Node<Integer> left = invertRecursive(root.getLeft());

        // Llamada recursiva para invertir el subárbol derecho
        Node<Integer> right = invertRecursive(root.getRight());

        // Intercambia los hijos del nodo actual
        // El izquierdo pasa a ser el derecho invertido
        root.setLeft(right);
        // El derecho pasa a ser el izquierdo invertido
        root.setRight(left);
        // Retorna el nodo ya con sus hijos invertidos
        return root;
    }
```

Metodo`invertRecursive` del Ejercicio2 : Este es el metodo que se encarga de invertir todo el arbol empezando con una comparacion para verificar que haya elementos en dicho arbol y despues continua con las llamadas recursivas tanto a la izquierda y a la derecha para asi al final intercambiar el derecho al izquierdo y el izquierdo con el derecho , y finalmente retornar el nodo ya con los hijos invertidos.

```java
public void printTree(Node<Integer> root) {
    System.out.println("Imprimiendo el arbol");
    printTreeFinal(root, 0);
}

public static void printTreeFinal(Node<Integer> actual, int root) {
    if (actual == null) {
        return;
    }
    printTreeFinal(actual.getRight(), root + 1);
    System.out.println("\t".repeat(root) + actual.getValue());
    printTreeFinal(actual.getLeft(), root + 1);
}
```
Metodos `printTree` y `printTreeFinal` del Ejercicio2: En el primer metodo tendremos los mismo que en el ejercicio 1 le mandaremos una raiz indicandole desde que nivel debe empezar, para asi seguir con el metodo `printTreeFinal` el cual primero recibira esa raiz la verificara sisque hay algo y despues empezara recorriendo el subarbol derecho para imprimirlo en la parte superior imprimir los nodos y al final recorrer el subarbol izquierdo para imprimirlo en la parte inferior.

### App
```java
private static void runEjercicio2() {
        BinaryTree<Integer> arbol = new BinaryTree<>();

        int[] datos2 = {4, 2, 7, 1, 3, 6, 9};

        for (int dato : datos2) {
            arbol.insert(dato);
        }

        Ejercicio2 ejercicio2 = new Ejercicio2();

        System.out.println("Árbol original:");
        ejercicio2.printTree(arbol.getRoot());

        Node<Integer> raizIn = ejercicio2.invert(arbol.getRoot());

        System.out.println("Árbol invertido:");
        ejercicio2.printTree(raizIn);
    
    }
```

`App` del Ejercicio2 : En este ejercicio igual que el anterior vamos a crear un metodo q se llame `runEjercicio2()` a este metodo vamos a crear un arbol vacio para despues asiganrle datos y despues con la ayuda del For ir llenando ese arbol , Despues instanciamos una variable con la `Clase Ejercicio2` para asi poder usar sus metodos de ahi primero imprimimos el arbol normal y por ultimo llamar al arbol invertido guardarlo en una variable  e imprimirlo. y finalmenet llamamos al metodo asi `runEjercicio2`.

### Impresion en el Terminal

![alt text](image-2.png)


### Ejercicio 3 :





## Tabla de resultados 
| Ejercicio | Evidencia de código | Evidencia de consola | Observación |
|----------|---------------------|----------------------|-------------|
| Ejercicio 01: Insertar en BST |![alt text](image-3.png)  | ![alt text](image-1.png) |Es un ejercicio interesante aunque primero no sabes ni por dodne empezar pero de ahi te das cuenta que es medio facil seguir la estructura de primero verificar de ahi crear metodos que nos permitan invertir o insertar directamente pero al final se hace medio facil entender el codigo |
| Ejercicio 02: Invertir árbol binario |![alt text](image-4.png) | ![alt text](image-2.png) | Podeos ver que la estrcutura del codigo es como lo que ya hemso venido practicando hace un tiempo es cierto que cambian ciertas cosas pero son medio faciles de entender como la modificacion del orden en el q se van a aimprimir como recorremos los subarboles y como los intercambiamos.|
| Ejercicio 03: Listar niveles | Código de ListLevels y método listLevels | Salida mostrando una lista por cada nivel | |
| Ejercicio 04: Profundidad máxima | Código de Depth y método maxDepth | Salida mostrando la profundidad calculada | |







