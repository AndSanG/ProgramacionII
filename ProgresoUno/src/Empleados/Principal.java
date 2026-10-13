package Empleados;

public class Principal {
    public static void main(String args[]) {
        Fecha f1 = new Fecha(12, 10, 1980);
        Fecha f2 = new Fecha(2, 5, 2013);
        System.out.println(f1);
        System.out.println(f2);

        // Los atributos fechaNac y fechaIng reciben los objetos f1 y f2.
        Empleado emp = new Empleado("123", "Sonia", "Torres", 'f', 2000000.0, f1, f2);
        System.out.println(emp);
        System.out.println("Edad de " + emp.getNombre() + ": " + emp.calcularEdad());

        System.out.println("Prestaciones: " + emp.calcularPrestaciones());

        // Modificar el salario
        emp.setSalario(2500000.0);
        System.out.println("Prestaciones con el nuevo salario: " + emp.calcularPrestaciones());

        // Se ejecuta el constructor de 4 parametros: salario en 0 y fechas en null.
        Empleado x = new Empleado("456", "Juan", "Díaz", 'm');
        System.out.println(x);

        Fecha f3 = new Fecha("27/01/1971");
        System.out.println("Fecha desde un String: " + f3);

        Fecha hoy = new Fecha();
        hoy.inicializarHoy();
        System.out.println("Hoy es: " + hoy);
    }


}
