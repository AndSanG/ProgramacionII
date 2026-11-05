package n01_ejerciciosarrays1;

public class EjerciciosArrays1 {

    public static void main(String[] args) {

        // DECLARACION, INSTANCIACION, Y ASIGNACION DE VALORES
        String[] meses = {
            "Enero", "Febrero", "Marzo", "Abril", "Mayo", "Junio",
            "Julio", "Agosto", "Septiembre", "Octubre", "Noviembre", "Diciembre"
        };

        // DECLARACION E INSTANCIACION DEL ARRAY
        int[] lluvia = new int[12];
        // int lluvia[] = new int[12];

        // INTRODUCCION DE DATOS A SUS COMPONENTES
        lluvia[0] = 23;
        lluvia[1] = 15;
        lluvia[2] = 34;
        lluvia[3] = 51;
        lluvia[4] = 68;
        lluvia[5] = 20;
        lluvia[6] = 10;
        lluvia[7] = 15;
        lluvia[8] = 120;
        lluvia[9] = 180;
        lluvia[10] = 90;
        lluvia[11] = 68;

        // int[] lluvia = {23, 15, 34, 51, 68, 20, 10, 15, 120, 180, 90, 68};

        // VISUALIZACION DE DATOS ALMACENADOS EN LOS COMPONENTES DE LOS ARRAYS
        for (int i = 0; i < lluvia.length; i++) {
            System.out.println("la lluvia recogida en el mes " + meses[i] + " es : " + lluvia[i] + " l/m2");
        }

        // CALCULAR LLUVIA ACUMULADA ANUAL
        int acumulaLluvia = 0;
        for (int i = 0; i < lluvia.length; i++) {
            acumulaLluvia += lluvia[i];
        }
        System.out.println("la pluviometría total anual es : " + acumulaLluvia + " l/m2");

        // OBTENER LA PLUVIOMETRIA MEDIA MENSUAL
        float mediaMensualLluvia = ((float) acumulaLluvia) / lluvia.length;
        System.out.println("la pluviometría media mensual es : " + String.format("%8.2f", mediaMensualLluvia) + " l/m2");

        for (int lluviaMes : lluvia) {
            System.out.println(lluviaMes);
        }

        for (String nombreMes : meses) {
            System.out.println(nombreMes);
        }
    }
}
