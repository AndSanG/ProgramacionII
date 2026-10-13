package Libros;

public class LibroCalificaciones {
    private String nombreDelCurso;
    public static String universidad = "UDLA";
    
    public LibroCalificaciones(String nombre) {
        nombreDelCurso = nombre;
    }

    // java no obliga a usar set get pero por convencion se usan así.
    // public void setNombreDelCurso(String nombre){
    public void establecerNombreDelCurso(String nombre) {
        nombreDelCurso = nombre;
    }

    // public String getNombreDelCurso(){
    public String obtenerNombreDelCurso() {
        return nombreDelCurso;
    }

    // Un metodo estatico se llama con el nombre de la clase, sin crear un objeto.
    // Solo puede usar variables y metodos estaticos: aqui no puede acceder a nombreDelCurso.
    public static void mostrarUniversidad() {
        System.out.println("Libros de calificaciones de la universidad " + universidad);
    }

    public void mostrarMensaje() {
        System.out.println("Bienvenido al libro de calificaciones para \n" + obtenerNombreDelCurso());
    }
}
