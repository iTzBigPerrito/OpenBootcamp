package com.mipaquete;

import java.util.Vector;

public class Ejercicio3y4 {
    /*
    Crea un "Vector" del tipo de dato que prefieras, y añádele 5 elementos.
    Elimina el 2o y 3er elemento y muestra el resultado final.
    Indica cuál es el problema de utilizar un Vector con la capacidad por defecto
    si tuviésemos 1000 elementos para ser añadidos al mismo.
    */
    public static void main(String[] args) {
        // Declaración e inicialización del Vector marcas
        Vector<String> marcas = new Vector<>();
        marcas.add("Apple");
        marcas.add("Samsung");
        marcas.add("Xiaomi");
        marcas.add("ROG");
        marcas.add("One Plus");
        System.out.println("Datos del Vector: " + marcas);

        // Eliminación del 2do y 3er elemento del vector
        marcas.remove(2);
        marcas.remove(1);
        // Aclarar que al eliminar un dato de un vector, todos los datos se reorganizan ya que se modifica el tamaño
        // del vector. Lo correcto sería eliminar los datos que se requieran del último al primero, por lo que
        // se elimina primero el dato N° 3 (posición 2) y luego el dato N° 2 (posición 1).
        System.out.println("Datos del Vector: " + marcas);
        /*
        El problema de utilizar Vectores con su capacidad por defecto es:
        Un vector tiene una capacidad por defecto de 10 elementos. Mientras esa capacidad no se sobrepase, el Vector
        almacenará únicamente 10 elementos.
         */
        System.out.println("Tamaño del vector: " + marcas.size() + " y capacidad: " + marcas.capacity());
        /*
        Si se sobrepasa la capacidad del Vector añadiendo más de 10 elementos, como en la siguiente simulación en la
        que añadí 11 elementos en total, el Vector duplica su capacidad actual.
         */
        marcas.add("Marca4");
        marcas.add("Marca5");
        marcas.add("Marca6");
        marcas.add("Marca7");
        marcas.add("Marca8");
        marcas.add("Marca9");
        marcas.add("Marca10");
        marcas.add("Marca11");
        /*
        Mediante los métodos .size() y .capacity() podemos darnos cuenta de que la capacidad de un Vector cuando
        se la utiliza por defecto y se sobrepasa constantemente, sigue la lógica (capacity = capacity * 2).
        Esto conlleva un problema considerable si trabajamos con muchos elementos. Si utilizamos un Vector para
        1000 elementos y sobrepasamos su capacidad, ahora tendríamos un Vector de capacidad 2000, el cual si no se
        optimiza, simplemente consumiría recursos innecesarios a la vez que ralentizaría muchísimo la ejecución
        del programa.
        Es por esto que es recomendable controlar la capacidad de un Vector y su incremento si se llegara a sobrepasar
        la capacidad especificada.
         */
        System.out.println("Tamaño del vector: " + marcas.size() + " y capacidad: " + marcas.capacity());
    }
}