import java.util.ArrayList;

public class Predicciones {
    public static void main(String[] args) {
        int fragmento = 3;

        if (fragmento == 1) {
            // La lista nace vacía y crece con add: size cuenta elementos, no lugares
            ArrayList<String> codigos = new ArrayList<>();
            System.out.println(codigos.size());   // 0
            codigos.add("MQ00000001");
            codigos.add("MQ00000002");
            System.out.println(codigos.size());   // 2
            System.out.println(codigos.get(1));   // MQ00000002
        }
        // manejo  declarativo, add y remove se encarga de mantener los objetos juntos.
        if (fragmento == 2) {
            // remove corre los elementos: no queda un hueco
            ArrayList<String> codigos = new ArrayList<>();
            codigos.add("MQ00000001");
            codigos.add("MQ00000002");
            codigos.add("MQ00000003");
            codigos.remove(0);
            System.out.println(codigos.get(0));   // MQ00000002
            System.out.println(codigos.size());   // 2
        }
        // usar Integer en lugar de int para almacenar datos primitivos.
        if (fragmento == 3) {
            // No guarda int: usa la clase envoltorio Integer. set reemplaza y contains busca
            ArrayList<Integer> viajes = new ArrayList<>();
            viajes.add(4);
            viajes.add(0);
            viajes.add(7);
            viajes.set(1, 9);
            System.out.println(viajes);               // [4, 9, 7]
            System.out.println(viajes.contains(0));   // false
        }
    }
}
