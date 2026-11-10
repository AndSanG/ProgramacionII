// Hora 1: ejemplo resuelto con un arreglo lleno. Los pasos 1 y 2 se programan en vivo;
// los pasos 3 y 4 los completan las parejas en la hoja (sección 2).
public class EjemploParqueadero {
    public static void main(String[] args) {
        TicketParqueadero[] tickets = new TicketParqueadero[4];
        tickets[0] = new TicketParqueadero("PCD1234");
        tickets[1] = new TicketParqueadero("GBA5678");
        tickets[2] = new TicketParqueadero("TAX0101");
        tickets[3] = new TicketParqueadero("PBX2020");

        // Un arreglo paralelo con los minutos: la posición i corresponde al ticket i
        int[] minutos = {20, 75, 400, 130};
        for (int i = 0; i < tickets.length; i++) {
            tickets[i].registrarTiempo(minutos[i]);
        }

        // 1. Mostrar todos los tickets
        System.out.println("== Tickets del día ==");
        for (int i = 0; i < tickets.length; i++) {
            tickets[i].mostrarDatos();
        }

        // 2. Recaudación esperada del día: un acumulador
        double total = 0;
        for (int i = 0; i < tickets.length; i++) {
            total += tickets[i].calcularValor();
        }
        System.out.println("\nRecaudación esperada: $" + total);

        // 3. (Completar) Ticket con más minutos: se supone que el primero es el mayor y se compara
        int posMayor = 0;
        for (int i = 1; i < tickets.length; i++) {
            if (tickets[i].getMinutosEstacionado() > tickets[posMayor].getMinutosEstacionado()) {
                posMayor = i;
            }
        }
        System.out.println("Más tiempo: " + tickets[posMayor].getPlaca());

        // 4. (Completar) Cuántos tickets no pagan nada (30 minutos o menos): un contador
        int gratis = 0;
        for (int i = 0; i < tickets.length; i++) {
            if (tickets[i].calcularValor() == 0) {
                gratis++;
            }
        }
        System.out.println("Sin costo: " + gratis);
    }
}
