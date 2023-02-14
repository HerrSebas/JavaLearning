public class Cuenta {
    private double saldo;
    private int agencia;
    private int numero;
    private Cliente titular;

    
    public double getSaldo() {
        return saldo;
    }


    public int getAgencia() {
        return agencia;
    }

    public void setAgencia(int agencia) {
        this.agencia = agencia;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public Cliente getTitular() {
        return titular;
    }

    public void setTitular(Cliente titular) {
        this.titular = titular;
    }

    public void depositar(double valor) {
        this.saldo += valor;
    }

    public boolean retirar(double valor){
        if (this.saldo >= valor) {
            this.saldo -= valor;
            return true;
        } else {
            return false;
        }   
    }

    public boolean trasnferir (double valor, Cuenta cuenta) {
        if (this.saldo >= valor) {
            cuenta.depositar(valor);

            this.saldo -= valor;
            return true;
        } else {
            return false;
        } 
    }
}
