public class Main {
    public static void main(String[] args) {
        /*
        En este ejercicio practicarás las estructuras de control, para ello deberás crear:
        Usando un if, crear una condición que compare si la variable numeroIf es positivo, negativo, o 0.
        Pista: Los números inferiores a 0 son negativos y los superiores, positivos.

        Crea un bucle While, este bucle tendrá que tener como condición que la variable numeroWhile sea inferior a 3,
        el bloque de código que tendrá el bucle deberá:
        Incrementar el valor de la variable en uno cada vez que se ejecute.
        Mostrarlo por pantalla cada vez que se ejecute.

        Para el bucle Do While, deberás crear la misma estructura que en el While, pero solo se debe ejecutar una vez.

        Para el bucle For, crea una variable numeroFor, esta variable tendrá como valor 0 y su condición será que la variable
        sea igual o menor que 3, se irá incrementando en 1 su valor cada vez que se ejecute y deberá mostrarse por pantalla.

        Por último, para el Switch, deberás crear la variable estacion, y distintos case para las cuatro estaciones del año.
        Dependiendo del valor de la variable estacion se deberá mandar un mensaje por consola informando de la estación en la que está.
        También habrá que poner un default para cuando el valor de la variable no sea una estación.
        */
        int numeroIf = 10;
        if (numeroIf > 0)
            System.out.println("El número es mayor que 0");
        if(numeroIf == 0)
            System.out.println("El número es igual a 0");
        if(numeroIf < 0)
            System.out.println("El número es menor que 0");

        int numeroWhile = 0;
        while(numeroWhile < 3){
            numeroWhile += 1;
            System.out.println("Bucle While: " + numeroWhile);
        }

        int numeroDoWhile = 0;
        do{
            numeroDoWhile += 1;
            System.out.println("Bucle Do While: " + numeroDoWhile);
        }while(numeroDoWhile > 3);

        int numeroFor = 0;
        for (;numeroFor <= 3; numeroFor++){
            System.out.println(numeroFor);
        }

        String estacion = "primavera";
        switch (estacion){
            case "verano":
                System.out.println("La estación es verano");
                break;
            case "invierno":
                System.out.println("La estación es invierno");
                break;
            case "otoño":
                System.out.println("La estación es otoño");
                break;
            case "primavera":
                System.out.println("La estación es primavera");
                break;
            default:  System.out.println("No se sabe que estación es...");
                break;
        }
    }
}