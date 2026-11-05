package n11_ejerciciosproperties;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Enumeration;
import java.util.Iterator;
import java.util.Properties;

public class EjerciciosProperties {

    public static void main(String[] args) {

        // INSTANCIACION Properties
        Properties estados = new Properties();

        // AGLUTINADO DE CADENAS AL Properties
        estados.put("1", "España");
        estados.put("2", "Portugal");
        estados.put("3", "Alemania");
        estados.put("4", "Francia");
        estados.put("5", "Italia");

        System.out.println("------------------ RECORRIDO Iterator ------------------");
        Iterator iteratorEstados = estados.keySet().iterator();
        while (iteratorEstados.hasNext()) {
            String keyEstado = (String) iteratorEstados.next();
            System.out.println("identificador de estado : " + keyEstado);
            System.out.println("nombre del estado : " + estados.getProperty(keyEstado));
            System.out.println("----------------------------------------------");
        }

        System.out.println("---- BUSQUEDA DEL VALOR CORRESPONDIENTE A UNA CLAVE ----");
        String claveBuscada = "2"; // valor de clave existente
        // String claveBuscada = "15"; // valor de clave no existe

        if (estados.containsKey(claveBuscada)) {
            System.out.println("identificador de estado : " + claveBuscada);
            System.out.println("nombre del estado : " + estados.getProperty(claveBuscada));
        } else {
            System.out.println("Valor de clave no existe en el Properties");
        }

        try {
            // Nota: El libro original utilizaba la ruta de Windows "D:\\archivos_creados_Java\\estados.properties".
            // Para asegurar la compatibilidad y portabilidad en cualquier sistema (macOS/Linux/Windows), se usa una ruta local:
            File archivo = new File("estados.properties");
            estados.store(new FileOutputStream(archivo), "Estados");

            Properties estadosLeidosDesdeArchivo = new Properties();
            estadosLeidosDesdeArchivo.load(new FileInputStream(archivo));

            System.out.println("--- RECORRIDO Enumeration Properties leido desde archivo --");
            Enumeration enumerationEstados = estadosLeidosDesdeArchivo.keys();
            while (enumerationEstados.hasMoreElements()) {
                String keyEstado = (String) enumerationEstados.nextElement();
                System.out.println("identificador de estado : " + keyEstado);
                System.out.println("nombre del estado : " + estadosLeidosDesdeArchivo.getProperty(keyEstado));
                System.out.println("----------------------------------------------");
            }
        } catch (IOException excepcion) {
            System.out.println("Problema con fichero para almacenar el Properties");
        }
    }
}
