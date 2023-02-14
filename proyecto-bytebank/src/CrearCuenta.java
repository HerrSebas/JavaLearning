public class CrearCuenta {

    public static void main(String[] args) {
        Cuenta cuentaSebas = new Cuenta();

       /*  cuentaSebas.saldo = 1000;
        System.out.println(cuentaSebas.saldo);

        cuentaSebas.depositar(400);
        System.out.println(cuentaSebas.saldo);
        //cuentaSebas.titular = "Sebastian Naranjo"; */

        cuentaSebas.retirar(100);

        Cuenta otraCuenta = new Cuenta();
        otraCuenta.depositar(10000);
        otraCuenta.trasnferir(200, cuentaSebas);
    }
}


