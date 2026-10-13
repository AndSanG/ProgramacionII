package Libros;

public class PruebaLibroCalificaciones {
    public static void main(String args[]) {
        System.out.println("Universidad:" + LibroCalificaciones.universidad);
        // Se puede llamar sin haber creado ninguna instancia.
        LibroCalificaciones.mostrarUniversidad();
        LibroCalificaciones miLibro = new LibroCalificaciones("JA00 Introducción a Java");
        LibroCalificaciones miLibro1 = new LibroCalificaciones("CSO Estructura de Datos");
        System.out.println("Universidad en objeto:" + miLibro1.universidad);
        System.out.println("El nombre del curso es:" + miLibro.obtenerNombreDelCurso());
        System.out.println("El nombre del curso es:" + miLibro1.obtenerNombreDelCurso());
    }
}
