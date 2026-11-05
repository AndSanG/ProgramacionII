package n02_ejerciciosarrays2;

public class EjerciciosArrays2 {

    public static void main(String[] args) {

        // DECLARACION, INSTANCIACION, Y ASIGNACION DE VALORES
        String[] meses = {
            "Enero", "Febrero", "Marzo", "Abril", "Mayo", "Junio",
            "Julio", "Agosto", "Septiembre", "Octubre", "Noviembre", "Diciembre"
        };

        String[] ciudades = {"Madrid", "Sevilla", "Valencia"};

        // DECLARACION E INSTANCIACION DEL ARRAY
        int[][] lluvia = new int[3][12];
        int[] acumulaLluvia = new int[3];
        float[] mediaMensualLluvia = new float[3];

        // INTRODUCCION DE DATOS A SUS COMPONENTES
        lluvia[0][0] = 23;
        lluvia[0][1] = 15;
        lluvia[0][2] = 34;
        lluvia[0][3] = 51;
        lluvia[0][4] = 68;
        lluvia[0][5] = 20;
        lluvia[0][6] = 10;
        lluvia[0][7] = 15;
        lluvia[0][8] = 120;
        lluvia[0][9] = 180;
        lluvia[0][10] = 90;
        lluvia[0][11] = 68;

        lluvia[1][0] = 18;
        lluvia[1][1] = 12;
        lluvia[1][2] = 30;
        lluvia[1][3] = 51;
        lluvia[1][4] = 43;
        lluvia[1][5] = 22;
        lluvia[1][6] = 8;
        lluvia[1][7] = 15;
        lluvia[1][8] = 115;
        lluvia[1][9] = 175;
        lluvia[1][10] = 93;
        lluvia[1][11] = 72;

        lluvia[2][0] = 24;
        lluvia[2][1] = 16;
        lluvia[2][2] = 15;
        lluvia[2][3] = 50;
        lluvia[2][4] = 31;
        lluvia[2][5] = 14;
        lluvia[2][6] = 9;
        lluvia[2][7] = 19;
        lluvia[2][8] = 120;
        lluvia[2][9] = 130;
        lluvia[2][10] = 73;
        lluvia[2][11] = 58;

        // VISUALIZACION DE DATOS ALMACENADOS EN LOS COMPONENTES DE LOS ARRAYS
        for (int i = 0; i <= 2; i++) {
            System.out.println("Ciudad : " + ciudades[i]);
            for (int k = 0; k < lluvia[i].length; k++) {
                System.out.println("la lluvia recogida en el mes " + meses[k] + " es : " + lluvia[i][k] + " l/m2");
            }
        }

        // CALCULO LLUVIA ACUMULADA ANUAL Y PLUVIOMETRIA MEDIA MENSUAL POR CIUDADES
        for (int i = 0; i <= 2; i++) {
            acumulaLluvia[i] = 0;
            for (int k = 0; k < lluvia[i].length; k++) {
                acumulaLluvia[i] += lluvia[i][k];
            }
            mediaMensualLluvia[i] = ((float) acumulaLluvia[i]) / lluvia[i].length;
        }

        // VISUALIZACION PLUVIOMETRIA ANUAL Y PLUVIOMETRIA MEDIA MENSUAL POR CIUDADES
        for (int i = 0; i <= 2; i++) {
            System.out.println("Ciudad : " + ciudades[i]);
            System.out.println("la pluviometría total anual es : " + acumulaLluvia[i] + " l/m2");
            System.out.println("la pluviometría media mensual es : " + String.format("%8.2f", mediaMensualLluvia[i]) + " l/m2");
        }
    }
}
