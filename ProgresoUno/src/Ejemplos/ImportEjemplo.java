package Ejemplos;

import Banco.Cuenta;
import java.util.*;          // comentar esta linea: List, ArrayList y Collections dejan de compilar
import java.time.LocalDate;  // comentar esta linea: LocalDate deja de compilar

public class ImportEjemplo {

    public static void main(String[] args) {
        Cuenta c = new Cuenta("123456789", "Juan Perez");
        c.depositar(900);
        c.interesAnual = 0.05f;

        // Math y System vienen de java.lang: funcionan siempre, sin import.
        List<Double> proyeccion = new ArrayList<>();
        for (int anios = 1; anios <= 5; anios++) {
            double futuro = c.consultarSaldo() * Math.pow(1 + c.interesAnual, anios);
            proyeccion.add(Math.round(futuro * 100) / 100.0);
        }
        System.out.println("Proyeccion a 5 anios: " + proyeccion);
        System.out.println("Saldo maximo proyectado: " + Collections.max(proyeccion));

        LocalDate hoy = LocalDate.now();
        System.out.println("Proyeccion calculada el: " + hoy + ", ultimo año: " + hoy.plusYears(5).getYear());
    }
}
