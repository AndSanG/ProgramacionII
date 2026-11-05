package n07_ejerciciosarraylist;

import n03_ejerciciosarrays3.Estado;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Enumeration;
import java.util.Iterator;

public class EjerciciosArrayList {

    public static void main(String[] args) {

        Estado estado1;

        // INSTANCIACION ArrayList
        ArrayList<Estado> estados = new ArrayList<Estado>();
        // ArrayList estados = new ArrayList();

        // INSTANCIACION DE OBJETOS Y AGLUTINADO AL ArrayList
        estado1 = new Estado(1, "España", 46570000);
        estados.add(estado1);
        estado1 = new Estado(2, "Portugal", 10310000);
        estados.add(estado1);
        Estado estadoAEliminar = estado1; // retenemos el valor de la referencia para eliminarlo posteriormente
        estado1 = new Estado(3, "Alemania", 82790000);
        estados.add(estado1);
        estado1 = new Estado(4, "Francia", 67120000);
        estados.add(estado1);
        estado1 = new Estado(5, "Italia", 60590000);
        estados.add(estado1);

        System.out.println("------------------ RECORRIDO size() get() ------------------");
        Estado estado2;
        for (int i = 0; i < estados.size(); i++) {
            estado2 = estados.get(i);
            // estado2 = (Estado)listaEstados.get(i);
            System.out.println("identificador de estado : " + estado2.getIdEstado());
            System.out.println("nombre del estado : " + estado2.getNombre());
            System.out.println("número de habitantes del estado : " + estado2.getNumeroHabitantes());
            System.out.println("----------------------------------------------");
        }

        System.out.println("------ RECORRIDO for (Estado estado3 : listaEstados) -------");
        for (Estado estado3 : estados) {
            System.out.println("identificador de estado : " + estado3.getIdEstado());
            System.out.println("nombre del estado : " + estado3.getNombre());
            System.out.println("número de habitantes del estado : " + estado3.getNumeroHabitantes());
            System.out.println("----------------------------------------------");
        }

        System.out.println("-------------------- RECORRIDO Iterator --------------------");
        Estado estado4;
        Iterator<Estado> iteratorEstados = estados.iterator();
        while (iteratorEstados.hasNext()) {
            estado4 = iteratorEstados.next();
            System.out.println("identificador de estado : " + estado4.getIdEstado());
            System.out.println("nombre del estado : " + estado4.getNombre());
            System.out.println("número de habitantes del estado : " + estado4.getNumeroHabitantes());
            System.out.println("----------------------------------------------");
        }

        System.out.println("------------------ RECORRIDO Enumeration -------------------");
        Estado estado5;
        Enumeration<Estado> enumerationEstados = Collections.enumeration(estados);
        while (enumerationEstados.hasMoreElements()) {
            estado5 = enumerationEstados.nextElement();
            System.out.println("identificador de estado : " + estado5.getIdEstado());
            System.out.println("nombre del estado : " + estado5.getNombre());
            System.out.println("número de habitantes del estado : " + estado5.getNumeroHabitantes());
            System.out.println("----------------------------------------------");
        }

        System.out.println("---------------- RECORRIDO desde el array ------------------");
        Object[] arrayEstados = estados.toArray();
        for (int i = 0; i < arrayEstados.length; i++) {
            System.out.println("identificador de estado : " + ((Estado) arrayEstados[i]).getIdEstado());
            System.out.println("nombre del estado : " + ((Estado) arrayEstados[i]).getNombre());
            System.out.println("número de habitantes del estado : " + ((Estado) arrayEstados[i]).getNumeroHabitantes());
            System.out.println("----------------------------------------------");
        }

        estados.remove(estadoAEliminar); // eliminamos el objeto retenido (Portugal)
        System.out.println("Después de haber eliminado un estado, quedan en el ArrayList " + estados.size() + " objetos");

        estados.clear();
        System.out.println("Después de haber aplicado el método clear() quedan en el ArrayList " + estados.size() + " objetos");
    }
}
