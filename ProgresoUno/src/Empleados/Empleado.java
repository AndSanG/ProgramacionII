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
        this.cedula = cedula;
        this.nombre = nombre;
        this.apellido = apellido;
        this.genero = genero;
        this.salario = salario;
        this.fechaNac = fechaNac;
        this.fechaIng = fechaIng;
    }
}
