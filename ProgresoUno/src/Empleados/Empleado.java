package Empleados;

public class Empleado {
    private String cedula;
    private String nombre;
    private String apellido;
    private char genero;
    private double salario;
    private Fecha fechaNac;
    private Fecha fechaIng;

    // Constructor por default: cedula, nombre y apellido en null, genero ' ', salario 0.0 y fechas en null.
    public Empleado() {
    }

    public Empleado(String cedula, String nombre, String apellido, char genero,
                    double salario, Fecha fechaNac, Fecha fechaIng) {
        setCedula(cedula);
        setNombre(nombre);
        setApellido(apellido);
        setGenero(genero);
        setSalario(salario);
        setFechaNac(fechaNac);
        setFechaIng(fechaIng);
    }

    // Constructor sobrecargado: los atributos que no se envian quedan con el valor por default.
    public Empleado(String cedula, String nombre, String apellido, char genero) {
        setCedula(cedula);
        setNombre(nombre);
        setApellido(apellido);
        setGenero(genero);
    }

    public void setCedula(String cedula) {
        this.cedula = cedula;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public void setGenero(char genero) {
        this.genero = genero;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public void setFechaNac(Fecha fechaNac) {
        this.fechaNac = fechaNac;
    }

    public void setFechaIng(Fecha fechaIng) {
        this.fechaIng = fechaIng;
    }

    @Override
    public String toString() {
        return "Empleado{\n"
                + "cedula=" + cedula + "\n"
                + "nombre=" + nombre + "\n"
                + "apellido=" + apellido + "\n"
                + "genero=" + genero + "\n"
                + "salario=" + salario + "\n"
                + "fechaNac=" + fechaNac + "\n"
                + "fechaIng=" + fechaIng + "\n"
                + "}";
    }

    // Edad del empleado: años completos entre su fecha de nacimiento y hoy.
    public int calcularEdad() {
        Fecha hoy = new Fecha();
        hoy.inicializarHoy();
        return fechaNac.calcularAnios(hoy);
    }

    public String getNombre() {
        return nombre;
    }
}
