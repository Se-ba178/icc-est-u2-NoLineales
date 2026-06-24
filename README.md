# Práctica: Estructuras Dinámicas Lineales

## Datos del Estudiante
- **Nombre:** Christian Villa
- **Curso:** Grupo 3
- **Fecha:** 17/06/2026

---
## Practica 1 
- **Fecha:** 16/06/2026

**Descripción General de la Practica 1 :**
En esta primera practica creamos algunos metodos los cuales nos vana  permitir imprimir un arbol binario en los siguientes ordenes ; PreOrden , InOrder,PosOrder, todos estos para poder determinar si un arbol binario ya dado se puede visualizar de una mejor manera todo este codigo para eso nos ayudamos de una clase `IntTree ` en la cual pondremos todos los metodos para poder organizar los arboles y en el `App ` solo los llamamos para imprimirlos. 

## Creacion de la clase `Node`
Lo q va a hacer esta clase va a ser que va a tener un valor de tipo entero el cual va a tener referencia de su hijo derecho y de su hijo izquierdo lo cual es bueno ya que nos va a permitir tener la estructura del arbol binario.
Esta clase recibira tres atributos:
```java
    private T value;
    private Node<T> left;
    private Node<T> right;
```
Ademas de sus respectivos metodos como lo son 
```java
    public Node<T> getValue(){}
    public Node<T> getLeft(){}
    public Node<T> getRight(){}
    // Y el toString
    @Override
    public String toString() {
        return "Node [   Raiz = " + value + "]";
    }
```
## Creacion de la clase `IntTree`
En esta clase vamos a tener todos los metodos para crear el arbol binario y  realizar las distintas clases de impresiones  determinar la altura su peso , estos metodos son:
```java
private Node<Integer> insertRecursive(Node<Integer> actual, Node<Integer> nodeIngresado) {}

public void preOrder() {}

private void preOrderRecursivo(Node<Integer> actual) {}

public void posOrder() {}

private void posOrderRecursivo(Node<Integer> actual) {}

public void inOrder() {}

private void inOrderRecursivo(Node<Integer> actual) {}

public void Anchura() {}

public int altura() {}

private int alturaRecursivo(Node<Integer> actual) {}

public int peso(){}

private int pesoRecursivo(Node<Integer> actual) {}
```

Estos metodos son los que nos ayudaran a imprimir el arbol en las diferentes formas que conocemos como `InOrder`- `PostOrder`-`PreOrder` ademas podremos ver la `Altura` y el `Peso` de nuestro arbol.

### App
```java
private static void runIntTree(){
    IntTree arbolNumeros = new IntTree();

    arbolNumeros.setRoot(10);
    System.out.println("Raiz" + arbolNumeros.getRoot());

    Node<Integer> node2 = new Node<>(20);
    Node<Integer> node3 = new Node<>(30);
    Node<Integer> node4 = new Node<>(40);
    Node<Integer> node5 = new Node<>(50);

    Node<Integer> root = arbolNumeros.getRoot();
    root.setLeft(node2);
    root.setRight(node3);

    node2.setLeft(node3);
    node4.setLeft(node4);
    node5.setLeft(root);

    arbolNumeros.insert(10);
    arbolNumeros.insert(5);
    arbolNumeros.insert(3);
    arbolNumeros.insert(8);
    arbolNumeros.insert(20);
    arbolNumeros.insert(15);

    System.out.println("Pos order");
    arbolNumeros.posOrder();
    System.out.println("Pre order");
    arbolNumeros.preOrder();
    System.out.println("In Order");
    arbolNumeros.inOrder();
    System.out.println();
    System.out.println("Anchura");
    arbolNumeros.Anchura();
    System.out.println();
    System.out.println("Altura ; ");
    arbolNumeros.altura();
    System.out.println(arbolNumeros.altura());

    System.out.println("Peso ; ");
    arbolNumeros.peso();
    System.out.println(arbolNumeros.peso());

    }
```
En la clase App  vamos a añadir diferentes valores a los distintos nodos para despues con los metodos que creamos en la clase `InTree` los cuales nos van a permitir tener los diferentes tiposd e impresiones que hemos venido visualizando.

## Captura de salidas en consola


![alt text](image-5.png)


## Practica 2 
- **Fecha:** 17/06/2026

**Descripción General de la Practica 2 :**
En la practica del dia de hoy hicimos una clase `BinartTree ` en la cual aremos los mismos metodos de la clase anterior creada q es la `IntTree` pero con la diferencia que en la clase`BinaryTree` la vamos a hacer una clase generica , ademas de los metodos ya creados vamos a crear otros dos en los cuales vamos a determinar la `Altura` de nuestro arbol y otra que nos ayudara a ver el peso osea cuantos nodos en total tiene el arbol con un metodo para calcular dicho `Peso` y tambien probamos este arbol pero comparandolo entre nombres embes de valores por lo cual nos podemos ayudar mucho del `CompareTo` esto ara que comparemos los valores por edad y por nombres.

Clase `BinaryTree` Metodos en esta clase:
```java
private Node<T> insertRecursive(Node<T> actual, Node<T> nodeIngresado) {}

public void preOrder() {}

private void preOrderRecursivo(Node<T> actual) {}

public void posOrder() {}

private void posOrderRecursivo(Node<T> actual) {}

public void inOrder() {}

private void inOrderRecursivo(Node<T> actual) {}

public void Anchura() {}

public int altura() {}

private int alturaRecursivo(Node<T> actual) {}

public int peso(){}

private int pesoRecursivo(Node<T> actual) {}

```
Son Exactamente los mimso metodos que en la clase IntTree
Los cuales nos van a  ayudar a imprimir de la misma forma que en la clase `IntTree` pero a diferencia que la clase `BinaryTree` es una clase Generica lo cual hace que en los metodos tengan un tipo de dato`Node<T> actual`.

### App
```java
private static void runPersonTree(){
    BinaryTree<Person> personTree = new BinaryTree<>();
    personTree.insert(new Person("Alice", 30));
    personTree.insert(new Person("Bob", 25));
    personTree.insert(new Person("Diego", 35));
    personTree.insert(new Person("Rafael", 35));
    personTree.insert(new Person("Ana", 35));

    System.out.println("iN ORDER" );
    personTree.inOrder();
    System.out.println();
    System.out.println("PRE ORDER ");
    personTree.preOrder();

    }
```

### Captura de salidas en consola
![alt text](image.png)


## Practica 24/96/2026
metodos 

## Conclusiones

El estudiante debe redactar al menos tres conclusiones propias relacionadas con los arboles.

- Conclusión 1: Como mi primera conclusion puedo decir que todos los metodos creados facilitan mucho a la visualizacion de estos arboles.
- Conclusión 2:Al crear metodos de impresion y otros para comparar hace muy entendible el tema lo que si hay q tener cuidado al comparar datos y tener en cuenta que datos comparamos etc.
- Conclusión 3: Hay que tener cuidado al comparar datos ya que si no son compatibles la comparacion no servira y el codigo nos dara error para eso exisen muchos metodos que nos van a permitir saber como  si la comparacion es correcta solo queda pensar bien.



