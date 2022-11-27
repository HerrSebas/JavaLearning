
package cajas;

public class Caja {
    int ancho;
    int largo;
    int alto;
    
    public void Caja(){
        System.out.println("Ejecutando ocnstructor vacío");
    }
    
    public void Caja(int ancho, int largo, int alto){
        this.ancho = ancho;
        this.largo = largo;
        this.alto = alto;
    }
    
    public int Volumen(){
        return ancho*largo*alto;
    }
}
