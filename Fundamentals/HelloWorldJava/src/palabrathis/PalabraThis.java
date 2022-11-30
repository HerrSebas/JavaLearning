package palabrathis;

public class PalabraThis {
    public static void main(String[] args) {
        Persona persona = new Persona("Juan", "Perez");
        System.out.println("nombre: " + persona.nombre);
    }
}

class Persona{
    String nombre;
    String apellido;

    Persona(String nombre, String apellido) {
        //super();
        this.nombre = nombre;
        this.apellido = apellido;
        System.out.println("Person nombre: " + this);
        new Imprimir().imprimir(this);
    }

    
}

class Imprimir{
    public void imprimir(Persona persona){
        System.out.println("persona desde imprimir: " + persona);
        System.out.println("Impresion del objeto actual " + this);
    }
}