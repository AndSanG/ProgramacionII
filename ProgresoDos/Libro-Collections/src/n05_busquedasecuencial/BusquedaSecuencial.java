package n05_busquedasecuencial;

public class BusquedaSecuencial {

    public static void main(String[] args) {

        String[] ciudades = {
            "Marsella", "Roma", "Montpellier", "Sevilla", "Oslo",
            "Estocolmo", "Venecia", "Carcassonne", "Munich", "Brest"
        };

        String ciudadABuscar = "Estocolmo"; // nombre de ciudad existente en el array
        // String ciudadABuscar = "Nápoles"; // nombre de ciudad no existente en el array

        boolean ciudadEncontrada = false;
        int posicionCiudadEncontrada = 0;
        int contadorPosiciones = 0;

        while ((contadorPosiciones < ciudades.length) && (!ciudadEncontrada)) {
            if (ciudades[contadorPosiciones].compareTo(ciudadABuscar) == 0) {
                posicionCiudadEncontrada = contadorPosiciones;
                ciudadEncontrada = true;
            }
            contadorPosiciones++;
        }

        if (ciudadEncontrada)
            System.out.println("Se encontró el nombre de ciudad : " + ciudades[posicionCiudadEncontrada] +
                    " ubicada en la posición : " + posicionCiudadEncontrada + " del array");
        else
            System.out.println("No se encontró el nombre de ciudad : " + ciudadABuscar);
    }
}
