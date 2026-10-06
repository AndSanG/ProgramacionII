//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
void main() {
    // Crear una instancia de la clase Carro
    // new es la palabra clave para crear instancias de clases.
    Carro pichirilo = new Carro();
    // Asignar valores a los atributos de la instancia.
    pichirilo.potencia = 2;
    // Acceder a los valores de los atributos de la instancia.
    float velocidad = pichirilo.velocidad;
    System.out.println("La velocidad del pichirilo es: " + velocidad);

    // Llamar a los métodos de la instancia pichirilo
    pichirilo.acelerar();
    pichirilo.acelerar();
    pichirilo.acelerar();
    pichirilo.acelerar();
    System.out.println("La velocidad del pichirilo es: " + pichirilo.velocidad);
    pichirilo.frenar();
    System.out.println("La velocidad del pichirilo es: " + pichirilo.velocidad);

    // Ejemplo Cuenta 
    // crear instancias de cuenta
    Cuenta c = new Cuenta();
    c.titular = "Juan Perez";
    c.numero = "123456789";
    c.interesAnual = 0.05f;
    System.out.println("La cuenta del titular: " + c.titular + " es: " + c.saldo);
}
