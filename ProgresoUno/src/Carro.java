public class Carro {
    int potencia;
    float velocidad;

    void acelerar() {
        velocidad += potencia;
    }

    void frenar() {
        velocidad *= 0.5f;
    }
}
