import javax.swing.JOptionPane;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Entrada y salida de datos en Java (consola con BufferedReader y ventanas con JOptionPane).
 * Todo lo que se lee es String: los numeros y el char se convierten al tipo que corresponda.
 */
public class EntradaSalida {

    public static void main(String[] args) throws IOException {
        salidaConsola();
        Cuenta porConsola = entradaConsola();
        System.out.println(porConsola);

        Cuenta porVentana = entradaVentanas();
        salidaVentanas(porVentana);
    }

    // Salida de datos por consola:
    // System.out.print(...) imprime y el cursor se queda posicionado despues del mensaje impreso.
    // System.out.println(...) imprime y el cursor hace un retorno de carro (baja a la siguiente linea).
    static void salidaConsola() {
        int r = 234354;
        System.out.print("Este es un mensaje. ");
        System.out.println("Este es otro mensaje"); // imprime un mensaje
        System.out.println(r);                      // imprime el valor de la variable r
        System.out.println("el valor de r es: " + r); // imprime un mensaje concatenado (+) con la variable r
    }

    // Entrada de datos por consola:
    // Todos los datos que se leen en Java son de tipo String, asi que si se requiere leer datos
    // de otro tipo se debe hacer la conversion al tipo de dato correspondiente.
    static Cuenta entradaConsola() throws IOException {
        // Se debe crear un objeto para leer datos. En este ejemplo se llama br
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("Numero de cuenta: ");
        // El metodo readLine() se utiliza para leer por consola. Se invoca con el objeto br.
        String numero = br.readLine();

        System.out.println("Nombre del titular: ");
        String titular = br.readLine();

        System.out.println("Deposito inicial: ");
        // Cuando se van a leer valores numericos se debe hacer la conversion al tipo de dato a almacenar
        // (para un entero seria Integer.parseInt(br.readLine())).
        double monto = Double.parseDouble(br.readLine());

        System.out.println("Tipo de cuenta, ahorros (a) o corriente (c)? ");
        // Para leer un char se obtiene el primer valor del String con el metodo charAt() de la clase String.
        // Como br.readLine() es un String, charAt(0) saca el caracter 0 del String leido.
        char tipo = br.readLine().charAt(0);
        System.out.println("Tipo elegido: " + tipo);

        Cuenta cuenta = new Cuenta(numero, titular);
        cuenta.depositar(monto);
        return cuenta;
    }

    // Entrada de datos grafica con ventanas emergentes:
    // El metodo showInputDialog() de la clase JOptionPane muestra una ventana para capturar (leer) datos.
    // El valor leido a traves de la ventana se asigna a la variable. Tambien devuelve String,
    // por eso se convierte con Double.parseDouble (o Integer.parseInt para enteros).
    static Cuenta entradaVentanas() {
        String numero = JOptionPane.showInputDialog("Numero de cuenta: ");
        String titular = JOptionPane.showInputDialog("Nombre del titular: ");
        double monto = Double.parseDouble(JOptionPane.showInputDialog("Deposito inicial: "));

        Cuenta cuenta = new Cuenta(numero, titular);
        cuenta.depositar(monto);
        return cuenta;
    }

    // Salida de datos grafica con ventanas emergentes:
    // El metodo showMessageDialog() de la clase JOptionPane muestra una ventana para mostrar mensajes o datos.
    // Cuando no se esta trabajando en una Interfaz Grafica de Usuario (GUI) el primer parametro es null
    // y el segundo corresponde a lo que se quiere imprimir.
    static void salidaVentanas(Cuenta cuenta) {
        JOptionPane.showMessageDialog(null, cuenta);
    }
}
