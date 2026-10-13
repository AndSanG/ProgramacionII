package Basico;

public class Cuadrilatero {
    public int largo;
    public int ancho;
    public int area;

    public static void main(String args[]) {
        Cuadrilatero a = new Cuadrilatero();
        a.largo = 10;
        a.ancho = 10;
        a.area = a.largo * a.ancho;
        System.out.println("El area del cuadrado es: " + a.area);
    }
}
