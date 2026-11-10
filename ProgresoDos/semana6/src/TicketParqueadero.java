public class TicketParqueadero {
    private String placa;
    private int minutosEstacionado;
    private boolean pagado;

    // Constructor por defecto: ticket con placa genérica, sin minutos y sin pagar
    public TicketParqueadero() {
        placa = "AAA0000";
        minutosEstacionado = 0;
        pagado = false;
    }

    // Constructor por parámetros: parte de los valores por defecto y valida con el set
    public TicketParqueadero(String placa) {
        this.placa = "AAA0000";
        minutosEstacionado = 0;
        pagado = false;
        setPlaca(placa);
    }

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        String limpia = placa.trim().toUpperCase();
        if (limpia.length() == 7 && !limpia.contains("-")) {
            this.placa = limpia;
        } else {
            System.out.println("Placa inválida: use el formato ABC1234, sin guion.");
        }
    }

    public int getMinutosEstacionado() {
        return minutosEstacionado;
    }

    public boolean isPagado() {
        return pagado;
    }

    public boolean registrarTiempo(int minutos) {
        if (minutos <= 0) {
            System.out.println("Los minutos deben ser positivos.");
            return false;
        }
        minutosEstacionado += minutos;
        return true;
    }

    // Hasta 30 minutos es gratis; desde ahí, $1 por hora completa o iniciada, con un máximo de $5
    public double calcularValor() {
        if (minutosEstacionado <= 30) {
            return 0;
        }
        double horas = Math.ceil(minutosEstacionado / 60.0);
        return Math.min(horas * 1.0, 5.0);
    }

    public boolean pagar() {
        return pagar(calcularValor());
    }

    public boolean pagar(double montoEntregado) {
        if (pagado) {
            System.out.println("El ticket ya fue pagado.");
            return false;
        }
        double valor = calcularValor();
        if (montoEntregado < valor) {
            System.out.println("Monto insuficiente. Debe pagar $" + valor);
            return false;
        }
        pagado = true;
        System.out.println("Pago registrado. Vuelto: $" + (montoEntregado - valor));
        return true;
    }

    public void mostrarDatos() {
        System.out.println("Placa: " + placa + " | Minutos: " + minutosEstacionado);
        System.out.println("Valor a pagar: $" + calcularValor() + " | Estado: " + (pagado ? "PAGADO" : "PENDIENTE"));
    }
}
