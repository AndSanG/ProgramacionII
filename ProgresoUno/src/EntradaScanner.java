import java.util.Scanner;

/**
 * Lectura de datos por teclado con Scanner (cierre de la sesion 7).
 * Ojo: nextDouble() deja el Enter pendiente; por eso se llama a nextLine() una vez antes de leer otro texto.
 */
public class EntradaScanner {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nombre del titular: ");
        String nombre = sc.nextLine();
        System.out.print("Deposito inicial: ");
        double monto = sc.nextDouble();
        sc.nextLine(); // consume el salto de linea que deja nextDouble()
        System.out.print("Numero de cuenta: ");
        String numero = sc.nextLine();

        Cuenta nueva = new Cuenta(numero, nombre);
        nueva.depositar(monto);
        System.out.println(nueva);
        sc.close();
    }
}
