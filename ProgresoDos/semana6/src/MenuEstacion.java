import java.util.Scanner;

public class MenuEstacion {
    public static void main(String[] args) {
        final int MAX = 5;
        TarjetaTransporte[] tarjetas = new TarjetaTransporte[MAX];
        int contador = 0;
        Scanner sc = new Scanner(System.in);
        int opc;

        do {
            System.out.println("\n1. Registrar tarjeta  2. Recargar  3. Pagar pasajes  4. Reporte  5. Dar de baja  0. Salir");
            System.out.print("Opción: ");
            opc = Integer.parseInt(sc.nextLine());

            if (opc == 1) {
                if (contador < MAX) {
                    System.out.print("Código: ");
                    String codigo = sc.nextLine();
                    System.out.print("Tipo (NORMAL o PREFERENCIAL): ");
                    String tipo = sc.nextLine();
                    TarjetaTransporte nueva = new TarjetaTransporte(codigo, tipo);
                    // Validar antes de guardar: si el código no pasó el set, la tarjeta quedó con el genérico
                    if (nueva.getCodigo().equals("MQ00000000")) {
                        System.out.println("No se registró la tarjeta.");
                    } else if (buscar(tarjetas, contador, nueva.getCodigo()) != -1) {
                        System.out.println("Ya existe una tarjeta con ese código.");
                    } else {
                        tarjetas[contador] = nueva;
                        contador++;
                        System.out.println("Registrada. Lugares libres: " + (MAX - contador));
                    }
                } else {
                    System.out.println("No hay lugar para más tarjetas.");
                }
            } else if (opc == 2) {
                System.out.print("Código: ");
                int pos = buscar(tarjetas, contador, sc.nextLine());
                if (pos == -1) {
                    System.out.println("No existe esa tarjeta.");
                } else {
                    System.out.print("Monto: ");
                    double monto = Double.parseDouble(sc.nextLine());
                    if (tarjetas[pos].recargar(monto)) {
                        System.out.println("Nuevo saldo: $" + tarjetas[pos].getSaldo());
                    }
                }
            } else if (opc == 3) {
                System.out.print("Código: ");
                int pos = buscar(tarjetas, contador, sc.nextLine());
                if (pos == -1) {
                    System.out.println("No existe esa tarjeta.");
                } else {
                    System.out.print("Pasajeros: ");
                    int pasajeros = Integer.parseInt(sc.nextLine());
                    if (tarjetas[pos].pagarPasaje(pasajeros)) {
                        System.out.println("Pagado. Saldo: $" + tarjetas[pos].getSaldo());
                    }
                }
            } else if (opc == 4) {
                if (contador == 0) {
                    System.out.println("No hay tarjetas registradas.");
                } else {
                    double total = 0;
                    int posMenor = 0;
                    // Hasta contador, no hasta length: los lugares vacíos son null
                    for (int i = 0; i < contador; i++) {
                        tarjetas[i].mostrarDatos();
                        total += tarjetas[i].getSaldo();
                        if (tarjetas[i].getSaldo() < tarjetas[posMenor].getSaldo()) {
                            posMenor = i;
                        }
                    }
                    System.out.println("Tarjetas: " + contador + " de " + MAX);
                    System.out.println("Saldo total: $" + Math.round(total * 100) / 100.0);
                    System.out.println("Menor saldo: " + tarjetas[posMenor].getCodigo());
                }
            } else if (opc == 5) {
                // Reto: la última tarjeta pasa al lugar de la que se borra (el orden no importa)
                System.out.print("Código: ");
                int pos = buscar(tarjetas, contador, sc.nextLine());
                if (pos == -1) {
                    System.out.println("No existe esa tarjeta.");
                } else {
                    tarjetas[pos] = tarjetas[contador - 1];
                    tarjetas[contador - 1] = null;
                    contador--;
                    System.out.println("Tarjeta dada de baja. Quedan " + contador);
                }
            } else if (opc != 0) {
                System.out.println("Opción inválida.");
            }
        } while (opc != 0);
    }

    // Devuelve la posición de la tarjeta con ese código, o -1 si no está
    public static int buscar(TarjetaTransporte[] tarjetas, int contador, String codigo) {
        String limpio = codigo.trim().toUpperCase();
        for (int i = 0; i < contador; i++) {
            if (tarjetas[i].getCodigo().equals(limpio)) {
                return i;
            }
        }
        return -1;
    }
}
