// Hora 1: ejemplo resuelto con un arreglo lleno. Los pasos 1 y 2 se programan en vivo;
// los pasos 3 y 4 los completan las parejas en la hoja (sección 2).
public class EjemploEstacion {
    public static void main(String[] args) {
        TarjetaTransporte[] tarjetas = new TarjetaTransporte[4];
        tarjetas[0] = new TarjetaTransporte("MQ00000001", "NORMAL");
        tarjetas[1] = new TarjetaTransporte("MQ00000002", "PREFERENCIAL");
        tarjetas[2] = new TarjetaTransporte("MQ00000003", "NORMAL");
        tarjetas[3] = new TarjetaTransporte("MQ00000004", "PREFERENCIAL");

        // Un arreglo paralelo con las recargas: la posición i corresponde a la tarjeta i
        double[] recargas = {10, 2.5, 20, 5};
        for (int i = 0; i < tarjetas.length; i++) {
            tarjetas[i].recargar(recargas[i]);
        }
        tarjetas[0].pagarPasaje(3);
        tarjetas[2].pagarPasaje();

        // 1. Mostrar todas las tarjetas
        System.out.println("== Tarjetas de la estación ==");
        for (int i = 0; i < tarjetas.length; i++) {
            tarjetas[i].mostrarDatos();
        }

        // 2. Tarjeta con menor saldo: se supone que la primera es la menor y se compara con las demás
        int posMenor = 0;
        for (int i = 1; i < tarjetas.length; i++) {
            if (tarjetas[i].getSaldo() < tarjetas[posMenor].getSaldo()) {
                posMenor = i;
            }
        }
        System.out.println("\nMenor saldo: " + tarjetas[posMenor].getCodigo() + " con $" + tarjetas[posMenor].getSaldo());

        // 3. (Completar) Cuántas tarjetas son preferenciales: un contador que sube dentro del for
        int preferenciales = 0;
        for (int i = 0; i < tarjetas.length; i++) {
            if (tarjetas[i].getTipoPasajero().equals("PREFERENCIAL")) {
                preferenciales++;
            }
        }
        System.out.println("Preferenciales: " + preferenciales);

        // 4. (Completar) Saldo total de la estación: un acumulador
        double total = 0;
        for (int i = 0; i < tarjetas.length; i++) {
            total += tarjetas[i].getSaldo();
        }
        System.out.println("Saldo total: $" + Math.round(total * 100) / 100.0);
    }
}

