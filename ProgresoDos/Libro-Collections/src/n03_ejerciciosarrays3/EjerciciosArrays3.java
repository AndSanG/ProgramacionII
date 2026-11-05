package n03_ejerciciosarrays3;

public class EjerciciosArrays3 {

    public static void main(String[] args) {

        /*
        Estado[] estados = {
            new Estado(1, "España", 46570000),
            new Estado(2, "Portugal", 10310000),
            new Estado(3, "Alemania", 82790000),
            new Estado(4, "Francia", 67120000),
            new Estado(5, "Italia", 60590000)
        };
        */

        // DECLARACION E INSTANCIACION DEL ARRAY
        Estado[] estados = new Estado[5];

        // INSTANCIACION DE OBJETOS
        estados[0] = new Estado(1, "España", 46570000);
        estados[1] = new Estado(2, "Portugal", 10310000);
        estados[2] = new Estado(3, "Alemania", 82790000);
        estados[3] = new Estado(4, "Francia", 67120000);
        estados[4] = new Estado(5, "Italia", 60590000);

        for (int i = 0; i < estados.length; i++) {
            System.out.println("identificador de estado : " + estados[i].getIdEstado());
            System.out.println("nombre del estado : " + estados[i].getNombre());
            System.out.println("número de habitantes del estado : " + estados[i].getNumeroHabitantes());
            System.out.println("----------------------------------------------");
        }

        // BUSQUEDA DE LOS ESTADOS CON MAYOR Y MENOR NUMERO DE HABITANTES
        int posicionEstadoMasPoblado = 0;
        int poblacionMaxima = estados[0].getNumeroHabitantes();

        int posicionEstadoMenosPoblado = 0;
        int poblacionMinima = estados[0].getNumeroHabitantes();

        for (int i = 1; i < estados.length; i++) {
            if (estados[i].getNumeroHabitantes() > poblacionMaxima) {
                posicionEstadoMasPoblado = i;
                poblacionMaxima = estados[i].getNumeroHabitantes();
            } else if (estados[i].getNumeroHabitantes() < poblacionMinima) {
                posicionEstadoMenosPoblado = i;
                poblacionMinima = estados[i].getNumeroHabitantes();
            }
        }

        System.out.println("El estado de mayor población es " + estados[posicionEstadoMasPoblado].getNombre() +
                " que cuenta con " + estados[posicionEstadoMasPoblado].getNumeroHabitantes());
        System.out.println("El estado de menor población es " + estados[posicionEstadoMenosPoblado].getNombre() +
                " que cuenta con " + estados[posicionEstadoMenosPoblado].getNumeroHabitantes());
    }
}
