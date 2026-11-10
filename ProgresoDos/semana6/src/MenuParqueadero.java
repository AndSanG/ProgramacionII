import java.util.Scanner;

public class MenuParqueadero {
    public static void main(String[] args) {
        final int PUESTOS = 5;
        TicketParqueadero[] tickets = new TicketParqueadero[PUESTOS];
        int ocupados = 0;
        double recaudado = 0;
        Scanner sc = new Scanner(System.in);
        int opc;

        do {
            System.out.println("\n1. Entrada  2. Registrar tiempo  3. Cobrar y salir  4. Reporte  0. Salir");
            System.out.print("Opción: ");
            opc = Integer.parseInt(sc.nextLine());

            if (opc == 1) {
                if (ocupados < PUESTOS) {
                    System.out.print("Placa: ");
                    TicketParqueadero nuevo = new TicketParqueadero(sc.nextLine());
                    // Validar antes de guardar: si la placa no pasó el set, quedó la genérica
                    if (nuevo.getPlaca().equals("AAA0000")) {
                        System.out.println("No se registró la entrada.");
                    } else if (buscar(tickets, ocupados, nuevo.getPlaca()) != -1) {
                        System.out.println("Ese auto ya está adentro.");
                    } else {
                        tickets[ocupados] = nuevo;
                        ocupados++;
                        System.out.println("Entrada registrada. Puestos libres: " + (PUESTOS - ocupados));
                    }
                } else {
                    System.out.println("Parqueadero lleno.");
                }
            } else if (opc == 2) {
                System.out.print("Placa: ");
                int pos = buscar(tickets, ocupados, sc.nextLine());
                if (pos == -1) {
                    System.out.println("Ese auto no está en el parqueadero.");
                } else {
                    System.out.print("Minutos: ");
                    tickets[pos].registrarTiempo(Integer.parseInt(sc.nextLine()));
                    tickets[pos].mostrarDatos();
                }
            } else if (opc == 3) {
                System.out.print("Placa: ");
                int pos = buscar(tickets, ocupados, sc.nextLine());
                if (pos == -1) {
                    System.out.println("Ese auto no está en el parqueadero.");
                } else {
                    double valor = tickets[pos].calcularValor();
                    System.out.print("A pagar $" + valor + ". Monto entregado: ");
                    double monto = Double.parseDouble(sc.nextLine());
                    if (tickets[pos].pagar(monto)) {
                        recaudado += valor;
                        // Reto: el auto sale y el último ticket ocupa su puesto (el orden no importa)
                        tickets[pos] = tickets[ocupados - 1];
                        tickets[ocupados - 1] = null;
                        ocupados--;
                    }
                }
            } else if (opc == 4) {
                double pendiente = 0;
                // Hasta ocupados, no hasta length: los puestos vacíos son null
                for (int i = 0; i < ocupados; i++) {
                    tickets[i].mostrarDatos();
                    pendiente += tickets[i].calcularValor();
                }
                System.out.println("Puestos ocupados: " + ocupados + " de " + PUESTOS);
                System.out.println("Recaudado: $" + recaudado + " | Por cobrar: $" + pendiente);
            } else if (opc != 0) {
                System.out.println("Opción inválida.");
            }
        } while (opc != 0);
    }

    // Devuelve la posición del ticket con esa placa, o -1 si no está
    public static int buscar(TicketParqueadero[] tickets, int ocupados, String placa) {
        String limpia = placa.trim().toUpperCase();
        for (int i = 0; i < ocupados; i++) {
            if (tickets[i].getPlaca().equals(limpia)) {
                return i;
            }
        }
        return -1;
    }
}
