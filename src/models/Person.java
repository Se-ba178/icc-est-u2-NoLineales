package models;

public class Person  implements Comparable<Person>{

    private String nombre;
    private int edad;
    
    public Person(String nombre, int edad) {
        this.nombre = nombre;
        this.edad = edad;
    }
    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public int getEdad() {
        return edad;
    }
    public void setEdad(int edad) {
        this.edad = edad;
    }


    @Override
    public String toString() {
        return "Person [nombre=" + nombre + ", edad=" + edad + "]";
    }
    @Override
    public int compareTo(Person otra) {
        //return this.nombre.compareTo(otra.getNombre());
        int compararEdad = Integer.compare(this.edad, otra.getEdad());  //Metodo importante del persona 
        if(compararEdad != 0) 
            return compararEdad;

        return this.nombre.compareTo(otra.getNombre());

    }

    
    
}
