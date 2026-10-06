public class Carro {
    int potencia;
    float velocidad;

    void acelerar() {
        velocidad += potencia;
    }

    void frenar() {
        velocidad *= 0.5f;
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
