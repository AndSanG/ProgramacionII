package Concesionario;

public class Carro {
    public int potencia;
    public float velocidad;
    // protected: visible en el paquete Concesionario y en las subclases de Carro (aunque esten en otro paquete).
    protected int kilometraje;

    public void acelerar() {
        velocidad += potencia;
    }

    public void frenar() {
        velocidad *= 0.5f;
    }

    protected void registrarKilometraje(int km) {
        kilometraje += km;
    }

    /*
    Estructura de la definicion de un metodo:

    [ModificadorDeAcceso] [tipoDeRetorno] nombreDelMetodo (parametros) {
        // Codigo del metodo
        return valor; 
    }

    ModificadorDeAcceso: {public | protected | private | default}
    tipoDeRetorno: {void | int | float | String | boolean | ...}
    nombreDelMetodo: Es el nombre del método.
    parametros: dentro de los parentesis se definen los tipos de datos. 
    Si no tiene, se dejan los parentesis vacios.
    (tipoDato nombreParametro1, tipoDato nombreParametro2, ...): 
    {
        // Codigo del metodo
        return valor; // se omite cuando es void y debe ser del tipo de retorno.
    }: Las llaves definen el cuerpo del método.
    */
}
