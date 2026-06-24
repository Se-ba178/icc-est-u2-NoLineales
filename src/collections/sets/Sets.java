package collections.sets;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

import models.Contacto;

public class Sets {

    
    public Sets() {
    }


    //Metodos
    public Set<String> construirHashSet(){
        Set<String> hashSet = new HashSet<>();
        hashSet.add("A");
        hashSet.add("B");
        hashSet.add("C");
        hashSet.add("A");
        hashSet.add("D");
        hashSet.add("E");
        hashSet.add("F");
        hashSet.add("1Ggggggeegeg");
        hashSet.add("2G2gggggeegeg");
        hashSet.add("3Gggggeegeg");
        hashSet.add("4Ggggggeegeg");
        hashSet.add("5Ggggggeegeg");
        hashSet.add("5Ggggggeegeg");
        hashSet.add("6Ggggggeegeg");
        hashSet.add("G7gggggeegeg");
        return hashSet;

    }

    public Set<String> construirLinkedHashSet(){
        Set<String> linkedhashSet = new LinkedHashSet<>();
        linkedhashSet.add("A");
        linkedhashSet.add("B");
        linkedhashSet.add("C");
        linkedhashSet.add("A");
        linkedhashSet.add("D");
        linkedhashSet.add("E");
        linkedhashSet.add("F");
        linkedhashSet.add("1Ggggggeegeg");
        linkedhashSet.add("2G2gggggeegeg");
        linkedhashSet.add("3Gggggeegeg");
        linkedhashSet.add("4Ggggggeegeg");
        linkedhashSet.add("5Ggggggeegeg");
        linkedhashSet.add("5Ggggggeegeg");
        linkedhashSet.add("6Ggggggeegeg");
        linkedhashSet.add("G7gggggeegeg");
        return linkedhashSet;

        

    }

    public Set<String> construirTreeSet(){
        Set<String> Tset = new TreeSet<>();
        Tset.add("A");
        Tset.add("B");
        Tset.add("C");
        Tset.add("A");
        Tset.add("D");
        Tset.add("E");
        Tset.add("F");
        Tset.add("1Ggggggeegeg");
        Tset.add("2G2gggggeegeg");
        Tset.add("3Gggggeegeg");
        Tset.add("4Ggggggeegeg");
        Tset.add("5Ggggggeegeg");
        Tset.add("5Ggggggeegeg");
        Tset.add("6Ggggggeegeg");
        Tset.add("G7gggggeegeg");
        return Tset;
        

    }

    public Set<Contacto> construirTreeSetConComparador(){

        // Set<Contacto> tCSet = new TreeSet<>((c1,c2) -> {   //Funcion flecha 
        //     return c1.getNombre().compareTo(c2.getNombre()
        // );} );
        Set<Contacto> tCSet = new TreeSet<>();
        tCSet.add(new Contacto("Juan", "Perez", "123456789"));
        tCSet.add(new Contacto("Ana", "Gomez", "987654321"));
        tCSet.add(new Contacto("Pedro", "Lopez", "456789123"));
        tCSet.add(new Contacto("Maria", "Rodriguez", "789123456"));
        tCSet.add(new Contacto("Juan", "Perez", "123456789")); // Duplicado, no se agregará
        tCSet.add(new Contacto("Juan", "Lopez", "123456789"));
        
        return tCSet;
    }

    public Set<Contacto>  construirHashSetContacto(){

        Set<Contacto> hCSet = new HashSet<>();
        Contacto c1 = new Contacto("Juan", "Perez", "123456789");
        Contacto c2 = new Contacto("Ana", "Gomez", "987654321");
        Contacto c3 =new Contacto("Pedro", "Lopez", "456789123");
        Contacto c4 = new Contacto("Maria", "Rodriguez", "789123456");
        Contacto c5 = new Contacto("Juan", "Perez", "123456789"); // Duplicado, no se agregará
        Contacto c6 = new Contacto("Juan", "Lopez", "123456789");
        
        hCSet.add(c1);
        hCSet.add(c2);
        hCSet.add(c3);
        hCSet.add(c4);
        hCSet.add(c5);
        hCSet.add(c6);

        
        return hCSet;


    }
    
}
