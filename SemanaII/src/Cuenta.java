public class Cuenta {
    String numero;
    String titular;
    private double saldo;
    float interesAnual;

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
    
}
