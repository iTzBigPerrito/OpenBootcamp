import javax.print.attribute.standard.PresentationDirection;

public class Main {
    public static void main(String[] args) {
        /*
        Primera parte:
        Crear una función con tres parámetros que sean números que se suman entre sí.
        Llamar a la función en el main y darle valores.
        */
        sumarNumeros(5,2,7);
        /*
        Segunda parte:
        Crear una clase coche.
        Dentro de la clase coche, una variable numérica que almacene el número de puertas que tiene.
        Una función que incremente el número de puertas que tiene el coche.
        Crear un objeto miCoche en el main y añadirle una puerta.
        Mostrar el número de puertas que tiene el objeto.
        */
        coche miCoche =  new coche();
        miCoche.sumarPuertas();
        System.out.println("Número de puertas: " + miCoche.puertas);
    }
     public static void sumarNumeros(int a, int b, int c){
        int res = a + b + c;
        System.out.println("El resultado es: " + res);
    }
}
class coche{
    public int puertas = 0;
    public void sumarPuertas(){
        this.puertas++;
    }
}