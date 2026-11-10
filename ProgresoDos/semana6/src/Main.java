public class Main {

    public static void main(String[] args) {
        int fragmento = 2;

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
    }
}
