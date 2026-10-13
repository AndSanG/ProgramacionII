package Empleados;

import java.util.Calendar;
import java.util.GregorianCalendar;

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
        return dia + "/" + mes + "/" + anio;
    }

    // Asigna al objeto la fecha de hoy.
    public void inicializarHoy() {
        // Calendario gregoriano inicializado en el dia de hoy
        GregorianCalendar gc = new GregorianCalendar();

        // Se sacan los valores de dia, mes y año del calendario (los meses empiezan en 0)
        dia = gc.get(Calendar.DAY_OF_MONTH);
        mes = gc.get(Calendar.MONTH) + 1;
        anio = gc.get(Calendar.YEAR);
    }
}
