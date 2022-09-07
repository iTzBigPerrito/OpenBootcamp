public class Main {
    public static void main(String[] args) {
        /*
        Para practicar la encapsulación:
        Crear clase Persona.
        Crear variables las privadas edad, nombre y telefono de la clase Persona.
        Crear gets y sets de cada propiedad.
        Crear un objeto persona en el main.
        Utiliza los gets y sets para darle valores a las propiedades edad, nombre y telefono,
        por último muéstralas por consola.
        */
        Persona yoPuesQuienMas = new Persona();
        yoPuesQuienMas.setEdad(22);
        yoPuesQuienMas.setNombre("Daniel");
        yoPuesQuienMas.setTelefono("1002003001");
        String miNombre = yoPuesQuienMas.getNombre();
        int miEdad = yoPuesQuienMas.getEdad();
        String miNumero = yoPuesQuienMas.getTelefono();
        System.out.println("Mi nombre es: " + miNombre);
        System.out.println("Tengo " + miEdad + " años");
        System.out.println("Mi número es :" + miNumero);

    }
}
class Persona{
    private int edad;
    private String nombre;
    private String telefono;
    // Get y Set para edad
    public int getEdad() {
        return edad;
    }
    public void setEdad(int edad) {
        this.edad = edad;
    }
    // Get y Set para nombre
    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    // Get y Set para teléfono
    public String getTelefono() {
        return telefono;
    }
    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }
}