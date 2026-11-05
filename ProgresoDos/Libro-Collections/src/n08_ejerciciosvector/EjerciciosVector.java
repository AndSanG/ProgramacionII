package n08_ejerciciosvector;

import n03_ejerciciosarrays3.Estado;
import java.util.Enumeration;
import java.util.Iterator;
import java.util.Vector;

public class EjerciciosVector {

    public static void main(String[] args) {

        Estado estado1;

        // INSTANCIACION Vector
        Vector<Estado> estados = new Vector<Estado>();

        // INSTANCIACION DE OBJETOS Y AGLUTINADO AL Vector
        estado1 = new Estado(1, "España", 46570000);
        estados.addElement(estado1);
        estado1 = new Estado(2, "Portugal", 10310000);
        estados.addElement(estado1);
        estado1 = new Estado(3, "Alemania", 82790000);
        estados.addElement(estado1);
        estado1 = new Estado(4, "Francia", 67120000);
        estados.addElement(estado1);
        estado1 = new Estado(5, "Italia", 60590000);
        estados.addElement(estado1);

        System.out.println("------------------ RECORRIDO size() get() ------------------");
        Estado estado2;
        for (int i = 0; i < estados.size(); i++) {
            estado2 = estados.elementAt(i);
            // estado2 = (Estado)estados.get(i);
            System.out.println("identificador de estado : " + estado2.getIdEstado());
            System.out.println("nombre del estado : " + estado2.getNombre());
            System.out.println("número de habitantes del estado : " + estado2.getNumeroHabitantes());
            System.out.println("----------------------------------------------");
        }

        System.out.println("-------------------- RECORRIDO Iterator --------------------");
        Estado estado3;
        Iterator<Estado> iteratorEstados = estados.iterator();
        while (iteratorEstados.hasNext()) {
            estado3 = iteratorEstados.next();
            System.out.println("identificador de estado : " + estado3.getIdEstado());
            System.out.println("nombre del estado : " + estado3.getNombre());
            System.out.println("número de habitantes del estado : " + estado3.getNumeroHabitantes());
            System.out.println("----------------------------------------------");
        }

        System.out.println("------------------ RECORRIDO Enumeration -------------------");
        Estado estado4;
        Enumeration<Estado> enumerationEstados = estados.elements();
        while (enumerationEstados.hasMoreElements()) {
            estado4 = enumerationEstados.nextElement();
            System.out.println("identificador de estado : " + estado4.getIdEstado());
            System.out.println("nombre del estado : " + estado4.getNombre());
            System.out.println("número de habitantes del estado : " + estado4.getNumeroHabitantes());
            System.out.println("----------------------------------------------");
        }
    }
}
