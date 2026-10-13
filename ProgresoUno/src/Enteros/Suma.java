package Enteros;

import java.util.Scanner;

public class Suma {
    public static void main(String args[]) {
        Scanner lea = new Scanner(System.in);
        int numero1, numero2, suma;
        System.out.println("Ingrese el primer numero");
        numero1 = lea.nextInt();
        System.out.println("Ingrese el segundo numero");
        numero2 = lea.nextInt();
        suma = numero1 + numero2;
        System.out.println("La suma es:" + suma);
        lea.close();
    }
}
