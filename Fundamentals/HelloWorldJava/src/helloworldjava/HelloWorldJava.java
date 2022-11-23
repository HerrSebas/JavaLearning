/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package helloworldjava;

import java.util.Scanner;

import javax.print.attribute.SupportedValuesAttribute;

/**
 *
 * @author sebna
 */
public class HelloWorldJava {

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        String nombre;
        int id, precio;
        Boolean envioGratuito;
        Scanner input = new Scanner(System.in);
        System.out.println("Proporcione el nombre");
        nombre = input.nextLine();
        System.out.println("Proporciona el id");
        id = input.nextInt();
        System.out.println("Proporciona el precio");
        precio = input.nextInt();
        System.out.println("Proporciona el envio gratiuto");
        envioGratuito = input.nextBoolean();

        System.out.println(nombre + " #" + id);
        System.out.println("Precio: $" + precio);
        System.out.println("Envio gratuito: " + envioGratuito);
    }
}
