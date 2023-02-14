public class PruebaCliente {
    public static void main(String[] args) {
        Cliente cliente = new Cliente();
        Cuenta cuenta = new Cuenta();
        
        cuenta.setTitular(cliente);
        System.out.println(cuenta.getSaldo());
        cuenta.depositar(1000);
        System.out.println(cuenta.getSaldo());
    }

}
