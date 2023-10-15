# PROGRAMA INFORMATICO: UNIDAD 1-1: 

## - Software:

- Segun el tipo de tarea que realiza:
  - Software de sistema (importante la BIOS).
  - Software de aplicacion.
  - Software de programacion.

- Segun el metodo de distribucion:
  - Shareware.
  - Freeware.
  - Adware.
  - Software multimedia.
  - Software de uso especifico.




## - Licencias de software:

- Licencias de Software: Definición 
  - Software Libre.
  - Software Propietario.
  - Software de dominio publico.

    

## - Concepto de programa:

- Programa informatico.



## - Programa y componentes del SI:

- Segun la arquitectura de Von Neumann, la CPU consta de varias partes: La unidad de control (UC O CU), la unidad aritmetico-logica (ALU) y los registros.
  - Unidad de Control.
  - Unidad aritmetico-logica.
  - Registros.

- Entender la serie de registros que engloban la Unidad de Control.
  - Contador de Programa (CP).
  - Registro de Instruccion (RI).
  - Registro de Direccion de Memoria (RDM).
  - Registro de Intercambio de Memoria (RIM).
  - Decodificador de Instruccion (DI).
  - El Reloj.
  - El Secuenciador.

- Entender la fase de busqueda y la fase de ejecucion. Describir los pasos para cada orden.

<----------------------------------------------------------------------------------------------------------------------------->

# ENTORNOS DE DESARROLLO: UNIDAD 1-2:

## - Introduccion a los lenguajes de programacion y demas:

- ### ¿Qué es un programa informatico?:
  - Conjunto de instrucciones que se escriben en un lenguaje de programacion.

- ### ¿Qué es un lenguaje?:
  - Conjunto de reglas y caracteres. Todas esas reglas se combinan para que tengan uan ejecucion determinada en el pc.

- ### ¿Qué tiene un lenguaje?:

  - **Vocabulario**: conjunto de simbolos permitidos en el lenguaje.
  - **Sintaxis**: reglas que indican como se tienen que construir las construcciones con los simbolos (como usar los simbolos).
  - **Semantica**: reglas que van a definir los significados de las construcciones del lenguaje.

- ### ¿En que se clasifican los lenguajes según su nivel de abstracción?:

  - Cuanto más bajo este el nivel de abstraccion, más facil de entender es para la máquina y mas dificil para nosotros. Y cuanto mas alto es
   lo contrario, mas facil de entender por el ser humano pero mas dificil para la máquina.

  - **Lenguajes de bajo nivel**: Se acercan al funcionamiento de un PC. El lenguaje de bajo nivel por excelencia es el lenguaje maquina (binario).
      Si una persona programa en bajo nivel se suele usar un ensamblador (Assembler), no se programa con codigo maquina directamente.

        - El lenguaje ensamblador es exclusivo para cada procesador, es decir, es especifico. Es dificil de aprender. Se programa con él usando nombres
          nemotecnicos y se trabaja directamente con LOS REGISTROS de memoria fisica de la memoria. Se tiene que pasar a binario igualmente.

        - MOV para mover un dato, o INT para números y demás... (muy distinto a un lenguaje de alto nivel).


   - **Lenguajes de nivel medio**: Se parecen a los de bajo nivel pero tambien tienen caracteristicas de nivel alto. Un ejemplo es C (para crear aplicaciones
     o sistemas operativos) o Rust. Te permiten gestionar la memoria pero con las facilidades de un lenguaje de nivel alto.


   - **lenguajes de alto nivel**: Cercanos a la forma de pensar de un ser humano. Con palabras del lenguaje natural, como el ingles. Para ejecutarlos
     se necesta un compilador o interprete, para traducir el lenguaje a lenguaje maquina => Esto ocurre SIEMPRE, en cualquier nivel, a no ser que escribamos
     en lenguaje maquina (no es el caso). No dependen del hardware (no como assembler que depende COMPLETAMENTE del hardware) y no se requiere ningun
     conocimiento sobre codigo maquina.
 

- ### ¿Cómo se clasifican segun su forma de ejecución?:

  - **Lenguajes compilados**:

    - Un compilador es un programa que puede leer un programa en un lenguaje (fuente) y traducirlo a otro (destino). Este puede devolver errores si el
      programa no esta bien escrito, usando sintaxis incorrecta. Si no devuelve el resultado esperado habria que modificar el programa.

    - Codigo fuente (nuestro programa) => compilador => codigo destino (suele ser binario);

  - **Lenguajes interpretados**:

    - Código fuente (alto nivel) => interprete => No genera codigo destino, nos muestra solo el resultado. Hay que tener en cuenta que el interprete ejecuta las instrucciones 
      y muestra el resultado directamente, pero no devuelve un codigo destino, es un proceso más lento ya que el interprete necesita traducir cada instrucción;
    
    -> Ejemplos: Ruby, PHP, JavaScript...etc;

  - **Java**: lenguaje interprete y compilado => miprograma.java puede compilarse para conseguir un programa destino (intermedio) que actua como interprete, 
    se le llama bytecodes (miprograma.class), después una máquina virtual interpreta ese código y crea un ejecutable;


¿Como se clasifican segun el paradigma de programacion?: es el enfoque que le damos a nuestro codigo hacia lo que queremos programar:

 -> Lenguajes imperativos: los primeros que aparecieron, instrucciones muy sencillas. Parecidas a las ordenes básicas de un ensamblador (movimientos, cálculos, enviar información...);
    - Basic, Java, C-Sharp... (recuerda que pueden ser multiparadigmas (varios enfoques en un mismo lenguaje));

    - Programación estructurada.
    - Programación modular.
    - Programación orientada a objetos.


 -> Lenguajes funcionales: relacionados con la definición de función. Cuando hablamos de funciones, no estamos hablando de las funciones de Java por ejemplo. Son lenguajes concretos
    para definir funciones MUY CONCRETAS.
    - Haskell, Lisp...etc.

    
 -> Lenguajes lógicos: Orientados a encontrar elementos dentro de un dominio para ver si se cumple una cierta logica, como una base de datos.
    - Prolog es el ejemplo perfecto.


------------------------> Lenguajes imperativos (tipos):

 -> Lenguajes estructurados: división de un programa en partes mas manejables que se llaman módulos, estos estan interconectados a traves de entradas y salidas (también pueden trabajar 
    de forma independiente) => la programación modular es una evolución de la programación estructurada.

   - Al dividir el programa en varios módulos, varios programadores puedan trabajar de manera simultanea.

   - Los modulos son reutilizables en otras aplicaciones.

   - Es más fácil resolver pequeños problemas separados (módulos) que abordar uno global.


 -> Lenguajes orientados a objetos: Un objeto es un elemento que va a tener dos vertientes, una estructura de datos y métodos u operaciones que manipulan esos datos.

 <----------------------------------------------------------------------------------------------------------------------------->

# ENTORNOS DE DESARROLLO: UNIDAD 1-3:

- ¿Qué es el pseudocódigo o diagrama de flujo?

   -> La generación del código fuente se lleva a cabo en la etapa de codificación.

- ¿Qué tipos de código hay y cual es el proceso de creación del código máquina?:

  -> Código fuente: Es aquel escrito por los programadores utilizando un editor de texto o alguna herramienta de programación (IDE). Para escribir este código, se parte de los diagramas de flujo
     que se crean en la etapa de diseño.

  -> Código objeto: El código resultante al compilar el código fuente. Este es una representación intermedia antes de pasar a código máquina.

  -> Código ejecutable: El resultado de enlazar el código objeto a una serie de librerías y rutinas. Este es el ejecutable por la máquina.

- ¿Qué es el compilador en realidad?:

  -> La compilación se lleva a cabo mediante dos programas que son: el compilador y el enlazador. Si ocurre algún error durante la compilación no se crea el código objeto.

  -> El enlazador se encarga de añadir una serie de librerías para crear el código ejecutable por máquina.


