package Empleados;

public class Principal {
    public static void main(String args[]) {
        Fecha f1 = new Fecha(12, 10, 1980);
        Fecha f2 = new Fecha(2, 5, 2013);
        System.out.println(f1);
        System.out.println(f2);

        // Los atributos fechaNac y fechaIng reciben los objetos f1 y f2.
        Empleado emp = new Empleado("123", "Sonia", "Torres", 'f', 2000000.0, f1, f2);
    }
}
