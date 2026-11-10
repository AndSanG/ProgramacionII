public class Main {

    public static void main(String[] args) {
        int fragmento = 1;

        if (fragmento == 1) {
            // Un arreglo de tipo primitivo nace lleno con el valor por defecto
            double[] saldos = new double[3];
            System.out.println(saldos[0]);       // 0.0
            System.out.println(saldos.length);   // 3
        }

    }
}
