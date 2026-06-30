package collections.mapas;

import java.security.KeyStore.Entry;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

public class Maps {

    //Map<TipoClave, TipoValor>
    //Map<K, V>
    //Interfaz no se puede instanciar 
    //Las clases si se pueden instanciar 
    //Map<String , Integer>
    public Map<String , Integer> construirHashMap(){
        Map<String, Integer> map = new HashMap<>();
        map.put("A", 10);
        map.put("B", 20);
        map.put("C", 30);
        map.put("A", 50);
        System.out.println(map.size());
        System.out.println(map);
        System.out.println(map.values().toArray());

        System.out.println("--------Uno a Uno-------------");
        for (int i = 0; i < map.size(); i++) { // Mapa se ocupa el size y no el lenght
            //Mapa a -> Valores a  un arreglo  -> Array cada posicion
            // MAP ->V -> VALORES -> ARRAY ->ARRAY[POS]
            System.out.println(map.values().toArray()[i]);  
        }
        
        System.out.println("--------------");
        // MAP ->K -> KEYS -> SET -> Valor del set 
        for ( String key: map.keySet()) {
            System.out.println(key);   //Pasan al set porque nunca se pueden repetir 
        } //A , B , C

        System.out.println("----------------");
        // SET<T>
        for(Map.Entry<String, Integer> entry : map.entrySet()){
            System.out.println(entry);
        }
        return map;
    }

    public LinkedHashMap<String, Integer> contruirLinkedHashMap(){
        LinkedHashMap<String, Integer > lMap = new LinkedHashMap<>();
        lMap.put("A", 2);
        lMap.put("B", 3);
        lMap.put("A", 5);
        lMap.put("C", 50);
        lMap.put("D", 5);
        lMap.put("F", 3);
        lMap.put("G", 8);
        lMap.put("H", 85);
        lMap.put("I", 5);
        System.out.println(lMap);
        System.out.println(lMap.entrySet());

        return lMap;


    }

    public Map<String, Integer> construirTreeMap(){
        Map<String, Integer > lMap = new TreeMap<>();
        lMap.put("A", 2);
        lMap.put("B", 3);
        lMap.put("A", 5);
        lMap.put("C", 50);
        lMap.put("D", 5);
        lMap.put("F", 3);
        lMap.put("G", 8);
        lMap.put("H", 85);
        lMap.put("I", 5);
        System.out.println(lMap);
        System.out.println(lMap.entrySet());
        return lMap;

    }
    
}
