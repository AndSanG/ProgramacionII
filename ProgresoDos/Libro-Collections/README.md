# ProgresoDos - Capítulo 6: Estructuras de Datos y Colecciones en Java

Este proyecto contiene la transcripción completa y estructurada de los ejemplos de código presentados en el documento [`CAP6-Collections.pdf`](./CAP6-Collections.pdf).

## Estructura del Proyecto

```
ProgresoDos/Libro-Collections/
├── CAP6-Collections.pdf
├── ProgresoDos.iml
├── README.md
└── src/
    ├── Main.java                                   # Menú principal y ejecutor de ejemplos
    ├── n01_ejerciciosarrays1/
    │   └── EjerciciosArrays1.java                  # Arrays 1D (Pluviometría anual y mensual) [pp. 2-4]
    ├── n02_ejerciciosarrays2/
    │   └── EjerciciosArrays2.java                  # Arrays 2D (Pluviometría por ciudades y meses) [pp. 7-9]
    ├── n03_ejerciciosarrays3/
    │   ├── Estado.java                             # Clase modelo Estado (POJO, equals, hashCode) [pp. 13-14]
    │   └── EjerciciosArrays3.java                  # Arrays de objetos y búsqueda de min/max [pp. 12-14]
    ├── n04_ejerciciosarrays4/
    │   └── EjerciciosArrays4.java                  # Arrays heterogéneos con Object[] y casting [pp. 17-18]
    ├── n05_busquedasecuencial/
    │   └── BusquedaSecuencial.java                 # Algoritmo de Búsqueda Secuencial en Arrays [pp. 21-22]
    ├── n06_busquedabinaria/
    │   └── BusquedaBinaria.java                    # Algoritmo de Búsqueda Binaria / Dicotómica [pp. 22-25]
    ├── n07_ejerciciosarraylist/
    │   └── EjerciciosArrayList.java                # ArrayList (recorridos for, Iterator, Enumeration, toArray) [pp. 26-28]
    ├── n08_ejerciciosvector/
    │   └── EjerciciosVector.java                   # Vector sincronizado (recorridos size/get, Iterator, elements) [pp. 28-29]
    ├── n09_ejerciciosset/
    │   └── EjerciciosSet.java                      # LinkedHashSet (control de duplicados y recorridos) [pp. 29-30]
    ├── n10_ejerciciosmap/
    │   └── EjerciciosMap.java                      # LinkedHashMap (pares clave-valor, keySet e Iterator) [pp. 34-36]
    └── n11_ejerciciosproperties/
        └── EjerciciosProperties.java               # Properties (clave-valor String, store y load en fichero) [pp. 37-38]
```

## Resumen de los Ejemplos Transcritos

| Paquete / Clase | Descripción | Páginas del PDF |
|---|---|---|
| `n01_ejerciciosarrays1.EjerciciosArrays1` | Declaración e instanciación de array unidimensional (`int[]`), inicialización explícita y por lista, bucle for tradicional y for-each, cálculo de total acumulado y media. | Págs. 2–4 |
| `n02_ejerciciosarrays2.EjerciciosArrays2` | Array bidimensional (`int[3][12]`) para registro de pluviometría por ciudad y mes, bucles anidados y cálculo de medias por ciudad. | Págs. 7–9 |
| `n03_ejerciciosarrays3.Estado` | Clase modelo con encapsulamiento (`idEstado`, `nombre`, `numeroHabitantes`), getters, setters, `equals` y `hashCode`. | Págs. 13–14 |
| `n03_ejerciciosarrays3.EjerciciosArrays3` | Array de referencias a objetos `Estado[]`, búsqueda de elementos mínimo y máximo en base a población. | Págs. 12–14 |
| `n04_ejerciciosarrays4.EjerciciosArrays4` | Array heterogéneo `Object[]` conteniendo `Estado`, `String` e `Integer`, demostrando polimorfismo y casting. | Págs. 17–18 |
| `n05_busquedasecuencial.BusquedaSecuencial` | Algoritmo de búsqueda lineal en array desordenado mediante flag booleano y comparación `compareTo`. | Págs. 21–22 |
| `n06_busquedabinaria.BusquedaBinaria` | Algoritmo de búsqueda binaria/dicotómica en array ordenado alfabéticamente, con traza de límites y comparaciones. | Págs. 22–25 |
| `n07_ejerciciosarraylist.EjerciciosArrayList` | Colección dinámica `ArrayList<Estado>`, métodos `add()`, `get()`, `remove()`, `clear()`, recorridos con índice, for-each, `Iterator`, `Enumeration` y conversión a array nativo `toArray()`. | Págs. 26–28 |
| `n08_ejerciciosvector.EjerciciosVector` | Colección sincronizada `Vector<Estado>`, uso de `addElement()`, `elementAt()`, `Iterator` y `Enumeration` mediante `elements()`. | Págs. 28–29 |
| `n09_ejerciciosset.EjerciciosSet` | Conjunto `LinkedHashSet<Estado>`, demostración de unicidad (no duplicados basados en `equals`/`hashCode`) y recorridos. | Págs. 29–30 |
| `n10_ejerciciosmap.EjerciciosMap` | Mapa asociativo `LinkedHashMap<Integer, Estado>`, métodos `put()`, `get()`, `containsKey()`, y recorrido de claves con `keySet().iterator()`. | Págs. 34–36 |
| `n11_ejerciciosproperties.EjerciciosProperties` | Colección `Properties`, pares clave-valor String, recorrido con `keySet()`, búsqueda por clave, y persistencia en disco con `store()` y recuperación con `load()`. | Págs. 37–38 |

## Compilación y Ejecución

### Desde la Terminal

1. **Compilar el proyecto:**
   ```bash
   javac -d bin $(find src -name "*.java")
   ```

2. **Ejecutar el menú interactivo:**
   ```bash
   java -cp bin Main
   ```

3. **Ejecutar todos los ejemplos automáticamente:**
   ```bash
   java -cp bin Main all
   ```

4. **Ejecutar un ejemplo específico:**
   ```bash
   java -cp bin Main 1    # Ejecuta EjerciciosArrays1
   java -cp bin Main 6    # Ejecuta BusquedaBinaria
   java -cp bin Main 10   # Ejecuta EjerciciosMap
   ```
   O directamente ejecutando la clase correspondiente:
   ```bash
   java -cp bin ejerciciosarraylist.EjerciciosArrayList
   ```

### Desde IntelliJ IDEA
- El módulo `ProgresoDos` ya está configurado con `src` como raíz de fuentes (`sourceFolder`).
- Puedes abrir y ejecutar directamente `Main.java` o cualquiera de las clases individuales haciendo clic en el icono verde de ejecución (Run).
