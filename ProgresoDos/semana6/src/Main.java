public class Main {

    public static void main(String[] args) {
        int fragmento = 5;

        if (fragmento == 1) {
            // Un arreglo de tipo primitivo nace lleno con el valor por defecto
            double[] saldos = new double[3];
            System.out.println(saldos[0]);       // 0.0
            System.out.println(saldos.length);   // 3
        }

        if (fragmento == 2) {
            // Un arreglo de objetos nace lleno de null: hay lugares, no tarjetas
            TarjetaTransporte[] tarjetas = new TarjetaTransporte[3];
            tarjetas[0] = new TarjetaTransporte("MQ00000001", "NORMAL");
            System.out.println(tarjetas[1]);       // null
            System.out.println(tarjetas.length);   // 3, aunque solo hay una tarjeta
        }

        if (fragmento == 3) {
            // <= en lugar de <: la última vuelta pide la posición 3, que no existe
            int[] viajes = {4, 0, 7};
            for (int i = 0; i <= viajes.length; i++) {
                System.out.println(viajes[i]);
            }
            // ArrayIndexOutOfBoundsException: Index 3 out of bounds for length 3
        }

        if (fragmento == 4) {
            // Llamar a un método sobre un lugar vacío
            TarjetaTransporte[] tarjetas = new TarjetaTransporte[3];
            tarjetas[0] = new TarjetaTransporte("MQ00000001", "NORMAL");
            for (int i = 0; i < tarjetas.length; i++) {
                System.out.println(tarjetas[i].getSaldo());
            }
            // Imprime 0.0 y luego NullPointerException en tarjetas[1]
        }
        // fragmento 2 del 2329
        if (fragmento == 5) {
            // Un arreglo de objetos nace lleno de null: hay puestos, no tickets
            TicketParqueadero[] tickets = new TicketParqueadero[3];
            tickets[0] = new TicketParqueadero("PCD1234");
            System.out.println(tickets[1]);       // null
            System.out.println(tickets.length);   // 3, aunque solo hay un ticket
        }

    }
}
