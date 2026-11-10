import java.util.ArrayList;

public class Predicciones {
    public static void main(String[] args) {
        int fragmento = 1;

        if (fragmento == 1) {
            // La lista nace vacía y crece con add: size cuenta elementos, no lugares
            ArrayList<String> codigos = new ArrayList<>();
            System.out.println(codigos.size());   // 0
            codigos.add("MQ00000001");
            codigos.add("MQ00000002");
            System.out.println(codigos.size());   // 2
            System.out.println(codigos.get(1));   // MQ00000002
        }
        
    }
}
