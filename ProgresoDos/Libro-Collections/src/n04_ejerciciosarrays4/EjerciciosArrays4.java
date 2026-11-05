package n04_ejerciciosarrays4;

import n03_ejerciciosarrays3.Estado;

public class EjerciciosArrays4 {

    public static void main(String[] args) {

        // DECLARACION E INSTANCIACION DEL ARRAY
        Object[] objetos = new Object[3];

        // INSTANCIACION DE OBJETOS
        objetos[0] = new Estado(1, "España", 46570000);
        objetos[1] = "Lo que el viento se llevó";
        // En versiones anteriores de Java se usaba new Integer(500):
        objetos[2] = Integer.valueOf(500);

        Estado estado = (Estado) objetos[0];
        String cadena = (String) objetos[1];
        Integer entero = (Integer) objetos[2];

        System.out.println("identificador de estado : " + estado.getIdEstado());
        System.out.println("nombre del estado : " + estado.getNombre());
        System.out.println("número de habitantes del estado : " + estado.getNumeroHabitantes());
        System.out.println("----------------------------------------------");
        System.out.println(cadena);
        System.out.println("----------------------------------------------");
        System.out.println("el número encapsulado en el objeto Integer es : " + entero.intValue());
    }
}
