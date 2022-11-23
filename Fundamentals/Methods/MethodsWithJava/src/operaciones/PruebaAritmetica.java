package operaciones;

public class PruebaAritmetica {
    public static void main(String[] args) {
        Aritmetica aritmetica1 = new Aritmetica();

        aritmetica1.a = 2;
        aritmetica1.b = 4;
        System.out.println(aritmetica1.sumarConRetorno());
        
        System.out.println(aritmetica1.sumarConArgumentos(5,6));
    }
 
}
