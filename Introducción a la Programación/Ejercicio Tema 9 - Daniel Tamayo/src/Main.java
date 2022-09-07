public class Main {
    public static void main(String[] args) {
        /*
        Crea una clase Persona con las siguientes variables:
        La edad
        El nombre
        El teléfono
        Una vez creada la clase, crea una nueva clase Cliente que herede de Persona,
        esta nueva clase tendrá la variable credito solo para esa clase.
        Crea ahora un objeto de la clase Cliente que debe tener como propiedades la edad,
        el telefono, el nombre y el credito, tienes que darles valor y mostrarlas por pantalla.
        Una vez hecho esto, haz lo mismo con la clase Trabajador que herede de Persona,
        y con una variable salario que solo tenga la clase Trabajador.
        */
        Cliente cliente = new Cliente(22,"Daniel","1002003001",2000000);
        System.out.println("Mi nombre es " + cliente.getNombre() + "\nTengo " + cliente.getEdad() +
                " años, mi número es " + cliente.getTelefono() + " y mi crédito es de $" + cliente.getCredito());
        Trabajador trabajador = new Trabajador(60, "Roberto", "1002003002", 2500);
        System.out.println("Mi nombre es " + trabajador.getNombre() + "\nTengo " + trabajador.getEdad() +
                " años, mi número es " + trabajador.getTelefono() + " y  mi salario es de $" + trabajador.getSalario());
    }
}

class Persona{
    private int edad;
    private String nombre;
    private String telefono;

    public int getEdad() {
        return edad;
    }
    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getTelefono() {
        return telefono;
    }
    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }
}

class Cliente extends Persona{
    private int credito;

    public Cliente(int edad, String nombre, String telefono, int credito){
        setEdad(edad);
        setNombre(nombre);
        setTelefono(telefono);
        setCredito(credito);
    }

    public int getCredito() {
        return credito;
    }
    public void setCredito(int credito) {
        this.credito = credito;
    }
}

class Trabajador extends Persona{
    private int salario;

    public Trabajador(int edad, String nombre, String telefono,int salario) {
        setEdad(edad);
        setNombre(nombre);
        setTelefono(telefono);
        setSalario(salario);
    }

    public int getSalario() {
        return salario;
    }
    public void setSalario(int salario) {
        this.salario = salario;
    }
}