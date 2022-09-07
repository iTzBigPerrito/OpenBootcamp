package com.mipaquete;


import java.io.IOException;

public class Ejercicio7 {
    /*
    Crea una función DividePorCero. Esta, debe generar una excepción ("throws") a su llamante
    del tipo ArithmeticException que será capturada por su llamante (desde "main", por ejemplo).
    Si se dispara la excepción, mostraremos el mensaje "Esto no puede hacerse".
    Finalmente, mostraremos en cualquier caso: "Demo de código".
    */
    public static void main(String[] args) {
        // En una sentencia try-catch-finally se llama a la función DividePorCero, la cual lanza una excepción de tipo
        //ArithmeticException. Esta se captura en el catch para continuar con la ejecución del programa.
        try {
            int division = DividePorCero(7,0);
            System.out.println("El resultado es: " + division);
        }catch (ArithmeticException e){
            System.out.println("Esto no puede hacerse: " + e.getClass());
        }finally {
            System.out.println("Demo de código");
        }
    }
    // Esta función recibe 2 parámetros de tipo int y los divide. Si el segundo parámetro es 0, la función arroja una
    // excepción de tipo ArithmeticException.
    public static int DividePorCero(int num1, int num2) throws ArithmeticException{
        int resultado;
        try {
            resultado = num1 / num2;
        }catch (ArithmeticException e){
            throw new ArithmeticException();
        }
        return resultado;
    }
}
