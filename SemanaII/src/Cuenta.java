public class Cuenta {
    String numero;
    String titular;
    private double saldo;
    float interesAnual;

    public Cuenta(String numero, String titular) {
        this.numero = numero;
        this.titular = titular;
        this.saldo = 0;
        this.interesAnual = 0.5f;
    }

    public Cuenta(){}
    //public double getSaldo() {
    public double consultarSaldo() {
        return saldo;
    }

    //public void setSaldo(double cantidad) {
    public void depositar(double cantidad) {
        if (cantidad <= 0) {
            System.out.println("Error: el deposito debe ser mayor que 0.");
            return;
        }
        saldo += cantidad;
    }

    public void retirar(double cantidad) {
        if (cantidad <= 0) {
            System.out.println("Error: el retiro debe ser mayor que 0.");
            return;
        }
        if (cantidad > saldo) {
            System.out.println("Error: saldo insuficiente.");
            return;
        }
        saldo -= cantidad;
    }
    
}
