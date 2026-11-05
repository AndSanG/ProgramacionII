package n09_ejerciciosset;

import n03_ejerciciosarrays3.Estado;
import java.util.Collections;
import java.util.Enumeration;
import java.util.Iterator;
import java.util.LinkedHashSet;

public class EjerciciosSet {

    public static void main(String[] args) {

        Estado estado1;

        // INSTANCIACION Set
        LinkedHashSet<Estado> estados = new LinkedHashSet<Estado>();

        // INSTANCIACION DE OBJETOS Y AGLUTINADO AL Set
        estado1 = new Estado(1, "España", 46570000);
        estados.add(estado1);
        estado1 = new Estado(2, "Portugal", 10310000);
        estados.add(estado1);
        estado1 = new Estado(3, "Alemania", 82790000);
        estados.add(estado1);
        estado1 = new Estado(4, "Francia", 67120000);
        estados.add(estado1);
        estado1 = new Estado(5, "Italia", 60590000);
        estados.add(estado1);

        Estado estadoADuplicar = new Estado(4, "Francia", 67120000);
        estados.add(estadoADuplicar);

        if (estados.contains(estadoADuplicar))
            System.out.println("Ya existe este objeto en el Set");

        System.out.println("------------------ RECORRIDO Iterator ------------------");
        Estado estado2;
        Iterator<Estado> iteratorEstados = estados.iterator();
        while (iteratorEstados.hasNext()) {
            estado2 = iteratorEstados.next();
            System.out.println("identificador de estado : " + estado2.getIdEstado());
            System.out.println("nombre del estado : " + estado2.getNombre());
            System.out.println("número de habitantes del estado : " + estado2.getNumeroHabitantes());
            System.out.println("----------------------------------------------");
        }

        System.out.println("------------------ RECORRIDO Enumeration -------------------");
        Estado estado3;
        Enumeration<Estado> enumerationEstados = Collections.enumeration(estados);
        while (enumerationEstados.hasMoreElements()) {
            estado3 = enumerationEstados.nextElement();
            System.out.println("identificador de estado : " + estado3.getIdEstado());
            System.out.println("nombre del estado : " + estado3.getNombre());
            System.out.println("número de habitantes del estado : " + estado3.getNumeroHabitantes());
            System.out.println("----------------------------------------------");
        }
    }
}
