package Empleados;

public class Fecha {
    private int dia;
    private int mes;
    private int anio;

    // Constructor por default: no recibe parametros, los atributos quedan en 0.
    public Fecha() {
    }

    // Constructor por parametros: asigna los valores recibidos a los atributos, en el orden en que se invocan.
    public Fecha(int dia, int mes, int anio) {
        this.dia = dia;
        this.mes = mes;
        this.anio = anio;
    }

    // Sobreescribe el toString heredado de Object para imprimir los atributos del objeto.
    @Override
    public String toString() {
        return "dia:" + dia + " mes:" + mes + " año:" + anio;
    }
}
