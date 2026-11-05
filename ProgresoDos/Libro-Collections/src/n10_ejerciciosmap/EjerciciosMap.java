package n10_ejerciciosmap;

import n03_ejerciciosarrays3.Estado;
import java.util.Iterator;
import java.util.LinkedHashMap;

public class EjerciciosMap {

    public static void main(String[] args) {

        Estado estado1;

        // INSTANCIACION Map
        LinkedHashMap<Integer, Estado> estados = new LinkedHashMap<Integer, Estado>();

        // INSTANCIACION DE OBJETOS Y AGLUTINADO AL Map
        estado1 = new Estado(1, "España", 46570000);
        estados.put(estado1.getIdEstado(), estado1);
        estado1 = new Estado(2, "Portugal", 10310000);
        estados.put(estado1.getIdEstado(), estado1);
        estado1 = new Estado(3, "Alemania", 82790000);
        estados.put(estado1.getIdEstado(), estado1);
        estado1 = new Estado(4, "Francia", 67120000);
        estados.put(estado1.getIdEstado(), estado1);
        estado1 = new Estado(5, "Italia", 60590000);
        estados.put(estado1.getIdEstado(), estado1);

        System.out.println("------------------ RECORRIDO Iterator ------------------");
        Iterator<Integer> iteratorEstados = estados.keySet().iterator();
        while (iteratorEstados.hasNext()) {
            Integer keyEstado = iteratorEstados.next();
            System.out.println("identificador de estado : " + estados.get(keyEstado.intValue()).getIdEstado());
            System.out.println("nombre del estado : " + estados.get(keyEstado.intValue()).getNombre());
            System.out.println("número de habitantes del estado : " + estados.get(keyEstado.intValue()).getNumeroHabitantes());
            System.out.println("----------------------------------------------");
        }

        System.out.println("---- BUSQUEDA DEL VALOR CORRESPONDIENTE A UNA CLAVE ----");
        Integer claveBuscada = Integer.valueOf(2); // valor de clave existente
        // Integer claveBuscada = Integer.valueOf(15); // valor de clave no existe

        if (estados.containsKey(claveBuscada)) {
            Estado estado2 = estados.get(claveBuscada);
            System.out.println("identificador de estado : " + estado2.getIdEstado());
            System.out.println("nombre del estado : " + estado2.getNombre());
            System.out.println("número de habitantes del estado : " + estado2.getNumeroHabitantes());
        } else {
            System.out.println("Valor de clave no existe en el Map");
        }
    }
}
