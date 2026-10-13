package Libros;

import java.util.Scanner;

public class PruebaLibroCalificaciones {
    public static void main(String args[]) {
        Scanner entrada = new Scanner(System.in);
        LibroCalificaciones miLibroCalificaciones = new LibroCalificaciones();
        System.out.println("El nombre inicial del curso es: " + miLibroCalificaciones.obtenerNombreDelCurso());
        System.out.println("Escriba el nombre del curso:");
        String nombre = entrada.nextLine();
        miLibroCalificaciones.establecerNombreDelCurso(nombre);
        miLibroCalificaciones.mostrarMensaje();
        entrada.close();
    }
}
