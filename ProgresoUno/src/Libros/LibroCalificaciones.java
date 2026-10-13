package Libros;

public class LibroCalificaciones {
    private String nombreDelCurso;

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

    public void mostrarMensaje() {
        System.out.println("Bienvenido al libro de calificaciones para \n" + obtenerNombreDelCurso());
    }
}
