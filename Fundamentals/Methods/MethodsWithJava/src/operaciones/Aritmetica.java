package operaciones;

public class Aritmetica {
    int a;
    int b;
    
    //Constructor vacio
    public Aritmetica (){
        System.out.println("Ejecutando constructor");
    }
    
    public Aritmetica(int arg1, int arg2){
        this.a = arg1;
        this.b = arg2;
    }
    //Metodo
    public void sumar(){
        int resultado = a + b;
        System.out.println(resultado);
    }
    
    public int sumarConRetorno(){
        //int resultado = a + b;
        return a + b;
    }
    
    public int sumarConArgumentos(int arg1, int arg2){
        a = arg1;
        b = arg2;
        return sumarConRetorno();
    }
}
