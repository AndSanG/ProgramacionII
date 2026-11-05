import n01_ejerciciosarrays1.EjerciciosArrays1;
import n02_ejerciciosarrays2.EjerciciosArrays2;
import n03_ejerciciosarrays3.EjerciciosArrays3;
import n04_ejerciciosarrays4.EjerciciosArrays4;
import n05_busquedasecuencial.BusquedaSecuencial;
import n06_busquedabinaria.BusquedaBinaria;
import n07_ejerciciosarraylist.EjerciciosArrayList;
import n08_ejerciciosvector.EjerciciosVector;
import n09_ejerciciosset.EjerciciosSet;
import n10_ejerciciosmap.EjerciciosMap;
import n11_ejerciciosproperties.EjerciciosProperties;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        if (args.length > 0) {
            ejecutarOpcion(args[0]);
            return;
        }

        System.out.println("===============================================================");
        System.out.println("     PROGRESO DOS - CAPÍTULO 6: COLECCIONES Y ARRAYS EN JAVA   ");
        System.out.println("===============================================================");
        System.out.println("Seleccione una opción para ejecutar:");
        System.out.println(" 1. EjerciciosArrays1 (Array Unidimensional Pluviometría)");
        System.out.println(" 2. EjerciciosArrays2 (Array Bidimensional Ciudades x Meses)");
        System.out.println(" 3. EjerciciosArrays3 (Array de Objetos Estado)");
        System.out.println(" 4. EjerciciosArrays4 (Array Heterogéneo de Objetos Object[])");
        System.out.println(" 5. BusquedaSecuencial (Búsqueda en Array)");
        System.out.println(" 6. BusquedaBinaria (Búsqueda Dicotómica en Array Ordenado)");
        System.out.println(" 7. EjerciciosArrayList (Recorridos for, Iterator, Enumeration)");
        System.out.println(" 8. EjerciciosVector (Clase Vector y sus recorridos)");
        System.out.println(" 9. EjerciciosSet (LinkedHashSet y control de duplicados)");
        System.out.println("10. EjerciciosMap (LinkedHashMap con clave-valor)");
        System.out.println("11. EjerciciosProperties (Properties y persistencia en fichero)");
        System.out.println("12. Ejecutar TODOS los ejemplos secuencialmente");
        System.out.println(" 0. Salir");
        System.out.println("===============================================================");
        System.out.print("Ingrese su opción: ");

        try (Scanner scanner = new Scanner(System.in)) {
            if (scanner.hasNextLine()) {
                String input = scanner.nextLine().trim();
                ejecutarOpcion(input);
            }
        } catch (Exception e) {
            System.out.println("Ejecutando todos los ejemplos por defecto:");
            ejecutarTodos();
        }
    }

    public static void ejecutarOpcion(String opcion) {
        switch (opcion) {
            case "1":
                System.out.println("\n>>> [1] EJECUTANDO: EjerciciosArrays1 <<<");
                EjerciciosArrays1.main(new String[]{});
                break;
            case "2":
                System.out.println("\n>>> [2] EJECUTANDO: EjerciciosArrays2 <<<");
                EjerciciosArrays2.main(new String[]{});
                break;
            case "3":
                System.out.println("\n>>> [3] EJECUTANDO: EjerciciosArrays3 <<<");
                EjerciciosArrays3.main(new String[]{});
                break;
            case "4":
                System.out.println("\n>>> [4] EJECUTANDO: EjerciciosArrays4 <<<");
                EjerciciosArrays4.main(new String[]{});
                break;
            case "5":
                System.out.println("\n>>> [5] EJECUTANDO: BusquedaSecuencial <<<");
                BusquedaSecuencial.main(new String[]{});
                break;
            case "6":
                System.out.println("\n>>> [6] EJECUTANDO: BusquedaBinaria <<<");
                BusquedaBinaria.main(new String[]{});
                break;
            case "7":
                System.out.println("\n>>> [7] EJECUTANDO: EjerciciosArrayList <<<");
                EjerciciosArrayList.main(new String[]{});
                break;
            case "8":
                System.out.println("\n>>> [8] EJECUTANDO: EjerciciosVector <<<");
                EjerciciosVector.main(new String[]{});
                break;
            case "9":
                System.out.println("\n>>> [9] EJECUTANDO: EjerciciosSet <<<");
                EjerciciosSet.main(new String[]{});
                break;
            case "10":
                System.out.println("\n>>> [10] EJECUTANDO: EjerciciosMap <<<");
                EjerciciosMap.main(new String[]{});
                break;
            case "11":
                System.out.println("\n>>> [11] EJECUTANDO: EjerciciosProperties <<<");
                EjerciciosProperties.main(new String[]{});
                break;
            case "12":
            case "all":
                ejecutarTodos();
                break;
            case "0":
                System.out.println("Saliendo.");
                break;
            default:
                System.out.println("Opción no válida. Ejecutando todos los ejemplos:");
                ejecutarTodos();
                break;
        }
    }

    public static void ejecutarTodos() {
        System.out.println("\n=======================================================");
        System.out.println(">>> 1. EjerciciosArrays1 <<<");
        EjerciciosArrays1.main(new String[]{});

        System.out.println("\n=======================================================");
        System.out.println(">>> 2. EjerciciosArrays2 <<<");
        EjerciciosArrays2.main(new String[]{});

        System.out.println("\n=======================================================");
        System.out.println(">>> 3. EjerciciosArrays3 <<<");
        EjerciciosArrays3.main(new String[]{});

        System.out.println("\n=======================================================");
        System.out.println(">>> 4. EjerciciosArrays4 <<<");
        EjerciciosArrays4.main(new String[]{});

        System.out.println("\n=======================================================");
        System.out.println(">>> 5. BusquedaSecuencial <<<");
        BusquedaSecuencial.main(new String[]{});

        System.out.println("\n=======================================================");
        System.out.println(">>> 6. BusquedaBinaria <<<");
        BusquedaBinaria.main(new String[]{});

        System.out.println("\n=======================================================");
        System.out.println(">>> 7. EjerciciosArrayList <<<");
        EjerciciosArrayList.main(new String[]{});

        System.out.println("\n=======================================================");
        System.out.println(">>> 8. EjerciciosVector <<<");
        EjerciciosVector.main(new String[]{});

        System.out.println("\n=======================================================");
        System.out.println(">>> 9. EjerciciosSet <<<");
        EjerciciosSet.main(new String[]{});

        System.out.println("\n=======================================================");
        System.out.println(">>> 10. EjerciciosMap <<<");
        EjerciciosMap.main(new String[]{});

        System.out.println("\n=======================================================");
        System.out.println(">>> 11. EjerciciosProperties <<<");
        EjerciciosProperties.main(new String[]{});
        System.out.println("\n=======================================================");
        System.out.println(">>> TODOS LOS EJEMPLOS EJECUTADOS EXITOSAMENTE <<<");
    }
}
