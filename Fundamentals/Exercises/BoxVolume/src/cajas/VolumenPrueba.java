
package cajas;

import java.util.Scanner;

public class VolumenPrueba {

    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("Creando la caja..");
        Caja caja = new Caja();
        Scanner console = new Scanner(System.in);
        
        System.out.println("ingrese el ancho de la caja");
        caja.ancho = console.nextInt();
        
        System.out.println("ingrese el largo de la caja");
        caja.largo = console.nextInt();
        
        System.out.println("ingrese el alto de la caja");
        caja.alto = console.nextInt();
        
        System.out.println("El volumen de su caja es " + caja.Volumen() + "metros cúbicos");
    }
    
}
