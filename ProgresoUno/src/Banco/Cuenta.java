package Banco;

/**
 * Representa una cuenta bancaria con un titular, un saldo y una tasa de interes anual.
 * <p>
 * El saldo es privado: solo se puede modificar mediante {@link #depositar(double)}
 * y {@link #retirar(double)}, que validan las cantidades.
 * </p>
 *
 * @author Andrés Sánchez
 * @version 1.0
 */
public class Cuenta {
    /** Numero identificador de la cuenta. */
    public String numero;

    /** Nombre del titular de la cuenta. */
    public String titular;

    /** Dinero disponible en la cuenta. Es privado para controlar su acceso. */
    private double saldo;

    /** Tasa de interes anual expresada como fraccion (por ejemplo, 0.05 equivale a 5%). */
    public float interesAnual;

    /**
     * Crea una cuenta con saldo inicial 0 y una tasa de interes anual de 0.5.
     *
     * @param numero  numero identificador de la cuenta
     * @param titular nombre del titular de la cuenta
     */
    public Cuenta(String numero, String titular) {
        this.numero = numero;
        this.titular = titular;
        this.saldo = 0;
        this.interesAnual = 0.5f;
    }

    /**
     * Crea una cuenta vacia. Los atributos {@code numero}, {@code titular}
     * e {@code interesAnual} se asignan despues; el saldo inicia en 0.
     */
    public Cuenta(){}

    //public double getSaldo() {
    /**
     * Consulta el saldo actual de la cuenta.
     *
     * @return el saldo disponible
     */
    public double consultarSaldo() {
        return saldo;
    }

    //public void setSaldo(double cantidad) {
    /**
     * Deposita dinero en la cuenta. Si la cantidad no es mayor que 0,
     * muestra un mensaje de error y el saldo no cambia.
     *
     * @param cantidad monto a depositar, debe ser mayor que 0
     */
    public void depositar(double cantidad) {
        if (cantidad <= 0) {
            System.out.println("Error: el deposito debe ser mayor que 0.");
            return;
        }
        saldo += cantidad;
    }

    /**
     * Retira dinero de la cuenta. Si la cantidad no es mayor que 0 o supera
     * el saldo disponible, muestra un mensaje de error y el saldo no cambia.
     *
     * @param cantidad monto a retirar, debe ser mayor que 0 y no superar el saldo
     */
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

    /**
     * Devuelve una representacion en texto de la cuenta, con un atributo por linea.
     *
     * @return texto con el numero, titular, saldo e interes anual de la cuenta
     */
    @Override
    public String toString() {
        return "Cuenta{\n"
                + "numero=" + numero + "\n"
                + "titular=" + titular + "\n"
                + "saldo=" + saldo + "\n"
                + "interesAnual=" + interesAnual + "\n"
                + "}";
    }

}
