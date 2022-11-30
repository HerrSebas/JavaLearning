package test;

import dominio.Persona;

public class PersonaPrueba {
    public static void main(String[] args) {
        Persona persona = new Persona("Juan", 5000, false);
        
        /* System.out.println(persona.getNombre());
        System.out.println(persona.getSueldo());
        System.out.println(persona.isEliminado()); */

        System.out.println(persona);
    }
}
