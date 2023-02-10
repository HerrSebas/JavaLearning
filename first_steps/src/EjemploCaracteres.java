public class EjemploCaracteres {
    public static void main(String[] args) {
        //char variables accept one letter between single quote
        char caracter = 'a';
        System.out.println("This is a caracter " + caracter);

        //we can also write caracters with ASCCI values
        char caracterValue = 65;
        System.out.println(caracterValue);

        caracter = 65 + 1;
        System.out.println(caracter);

        //This is also valid
        System.out.println((char)(caracter + 2));   
    }
}
