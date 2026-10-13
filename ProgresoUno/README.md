# SemanaII - III - IV

Ejercicios de Programación II: clases, paquetes, modificadores de acceso, entrada/salida e imports.

## Estructura

```
src/
├── Banco/          Cuenta
├── Concesionario/  Carro
├── Taller/         CarroDeportivo (hereda de Carro, ejemplo de protected)
├── Entrada/        EntradaSalida, EntradaScanner
├── Ejemplos/       ImportEjemplo
└── Main.java
```

## Generar la documentación HTML (Javadoc)

Los comandos se ejecutan desde la carpeta `ProgresoUno`. Requieren un JDK instalado (`javadoc --version` para comprobarlo).

### Solo la clase Cuenta

```bash
javadoc -d docs src/Banco/Cuenta.java
```

### Todos los paquetes

```bash
javadoc -d docs -sourcepath src -subpackages Banco:Concesionario:Entrada:Taller:Ejemplos
```

`Main.java` no se incluye porque usa `void main()` sin declarar clase (archivo fuente compacto) y no define una API para documentar.

Las clases que aún no tienen comentarios `/** */` generan avisos `no comment`. No impiden generar el HTML.

### Desde IntelliJ IDEA

1. Menú **Tools > Generate JavaDoc...**
2. Elegir **Custom scope** o **Whole project**.
3. En **Output directory** indicar `docs`.
4. Pulsar **OK**.

## Ver el resultado

Abrir `docs/index.html` en el navegador:

```bash
open docs/index.html        # macOS
xdg-open docs/index.html    # Linux
start docs\index.html       # Windows
```

## Escribir comentarios Javadoc

Se escriben con `/** ... */` justo encima de la clase, atributo o método:

```java
/**
 * Deposita dinero en la cuenta.
 *
 * @param cantidad monto a depositar, debe ser mayor que 0
 */
public void depositar(double cantidad) { ... }
```

| Etiqueta                   | Uso                                              |
| -------------------------- | ------------------------------------------------ |
| `@param`                 | Describe un parámetro del método o constructor |
| `@return`                | Describe el valor que devuelve el método        |
| `@author`                | Autor de la clase                                |
| `@version`               | Versión de la clase                             |
| `{@link Clase#metodo()}` | Enlace a otra clase o método                    |

Para ver todos los problemas de documentación al generar, añadir `-Xdoclint:all`.
