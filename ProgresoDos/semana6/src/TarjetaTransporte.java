public class TarjetaTransporte {
    private String codigo;
    private double saldo;
    private String tipoPasajero;
    private int viajesRealizados;

    // Constructor por defecto: tarjeta genérica, sin saldo
    public TarjetaTransporte() {
        codigo = "MQ00000000";
        saldo = 0;
        tipoPasajero = "NORMAL";
        viajesRealizados = 0;
    }

    // Constructor por parámetros: parte de los valores por defecto y valida con los set
    public TarjetaTransporte(String codigo, String tipoPasajero) {
        this.codigo = "MQ00000000";
        this.tipoPasajero = "NORMAL";
        saldo = 0;
        viajesRealizados = 0;
        setCodigo(codigo);
        setTipoPasajero(tipoPasajero);
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        String limpio = codigo.trim().toUpperCase();
        if (limpio.length() == 10 && limpio.startsWith("MQ")) {
            this.codigo = limpio;
        } else {
            System.out.println("Código inválido: debe tener 10 caracteres y empezar con MQ.");
        }
    }

    public double getSaldo() {
        return saldo;
    }

    public String getTipoPasajero() {
        return tipoPasajero;
    }

    public void setTipoPasajero(String tipoPasajero) {
        if (tipoPasajero.equalsIgnoreCase("NORMAL") || tipoPasajero.equalsIgnoreCase("PREFERENCIAL")) {
            this.tipoPasajero = tipoPasajero.toUpperCase();
        } else {
            System.out.println("Tipo inválido: use NORMAL o PREFERENCIAL.");
        }
    }

    public int getViajesRealizados() {
        return viajesRealizados;
    }

    public double obtenerTarifa() {
        if (tipoPasajero.equals("PREFERENCIAL")) {
            return 0.22;
        }
        return 0.45;
    }

    public boolean recargar(double monto) {
        if (monto <= 1 || monto > 20) {
            System.out.println("La recarga debe ser mayor que $1 y de hasta $20.");
            return false;
        }
        saldo = Math.round((saldo + monto) * 100) / 100.0;
        return true;
    }

    public boolean pagarPasaje() {
        return pagarPasaje(1);
    }

    // El titular paga su tarifa; los acompañantes pagan siempre la tarifa normal
    public boolean pagarPasaje(int pasajeros) {
        if (pasajeros < 1 || pasajeros > 5) {
            System.out.println("Se pueden pagar de 1 a 5 pasajes a la vez.");
            return false;
        }
        double total = obtenerTarifa() + (pasajeros - 1) * 0.45;
        if (total > saldo) {
            System.out.println("Saldo insuficiente.");
            return false;
        }
        saldo = Math.round((saldo - total) * 100) / 100.0;
        viajesRealizados += pasajeros;
        return true;
    }

    public boolean cumpleCriterios(String tipo, double saldoMinimo) {
        return tipoPasajero.equalsIgnoreCase(tipo) && saldo >= saldoMinimo;
    }

    public void mostrarDatos() {
        System.out.println("Tarjeta: " + codigo + " (" + tipoPasajero + ")");
        System.out.println("Saldo: $" + saldo + " | Tarifa: $" + obtenerTarifa());
        System.out.println("Viajes realizados: " + viajesRealizados);
    }
}
