package Taller;

import Concesionario.Carro;

public class CarroDeportivo extends Carro {

    public void turbo(int km) {
        // Al heredar de Carro, se accede a los miembros protected aunque estemos en otro paquete.
        velocidad += potencia * 2;
        registrarKilometraje(km);
    }

    public int consultarKilometraje() {
        return kilometraje;
    }
}
