package n06_busquedabinaria;

public class BusquedaBinaria {

    public static void main(String[] args) {

        String[] ciudades = {
            "Brest", "Carcassonne", "Estocolmo", "Marsella", "Montpellier",
            "Munich", "Oslo", "Roma", "Sevilla", "Venecia"
        };

        String ciudadABuscar = "Munich"; // nombre de ciudad existente en el array
        // String ciudadABuscar = "Nápoles"; // nombre de ciudad no existente en el array

        boolean ciudadEncontrada = false;
        int limiteInferiorIntervalo = 0;
        int limiteSuperiorIntervalo = ciudades.length - 1;
        int posicionAComparar = (limiteInferiorIntervalo + limiteSuperiorIntervalo) / 2;

        while ((limiteInferiorIntervalo <= limiteSuperiorIntervalo) && (!ciudadEncontrada)) {
            visualizaValoresProcesoBusqueda(ciudades, ciudadABuscar, limiteInferiorIntervalo,
                    limiteSuperiorIntervalo, posicionAComparar);
            if (ciudades[posicionAComparar].compareTo(ciudadABuscar) == 0) {
                ciudadEncontrada = true;
            } else {
                if (ciudades[posicionAComparar].compareTo(ciudadABuscar) < 0) {
                    limiteInferiorIntervalo = posicionAComparar + 1;
                } else {
                    limiteSuperiorIntervalo = posicionAComparar - 1;
                }
                posicionAComparar = (limiteInferiorIntervalo + limiteSuperiorIntervalo) / 2;
            }
        }

        if (ciudadEncontrada)
            System.out.println("Se encontró el nombre de ciudad : " + ciudades[posicionAComparar] +
                    " ubicada en la posición : " + posicionAComparar + " del array");
        else
            System.out.println("No se encontró el nombre de ciudad : " + ciudadABuscar);
    }

    public static void visualizaValoresProcesoBusqueda(String[] ciudades, String ciudadABuscar,
            int limiteInferiorIntervalo, int limiteSuperiorIntervalo, int posicionAComparar) {
        System.out.println("límite inferior intervalo : " + limiteInferiorIntervalo);
        System.out.println("límite superior intervalo : " + limiteSuperiorIntervalo);
        System.out.println("posición a comparar : " + posicionAComparar);
        int resultadoComparacion = ciudades[posicionAComparar].compareTo(ciudadABuscar);
        System.out.println(resultadoComparacion);
        System.out.println("-----------------------------------------");
    }
}
