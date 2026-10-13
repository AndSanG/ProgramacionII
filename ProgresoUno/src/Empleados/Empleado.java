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
}
