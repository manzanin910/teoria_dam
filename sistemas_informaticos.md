- LIBRO SISTEMAS INFORMATICOS EDITORIAL SINTESIS (AUTOR: JESUS BEAS ARCO; ISBN: 978-84-1357-011-2). CONTRASEÑA DEL AULA VIRTUAL: SI2023;**

- **VM => Maquinas virtuales.**
- **SI => Sistemas informaticos.**

## - Introducción:

- **Modelo de Von Neumann:** Lo siguen todas las maquinas de hoy en dia. Habla de dos componentes: la cpu y la memoria, estos se conectan con los perifericos (buses). Existen buses
par comunicar los distintos elementos.

- ### Componentes de una CPU:
  - Registros.
  - ALU.
  - Unidad de Control
  - Memoria.
    - La memoria tiene dos partes => area de datos y area de codigo (datos e instrucciones).

  - **Modelo de Harvard** (una variante, y solo lo menciona, y sigue al fin y al cabo el modelo de von neumann, pero mejora la gestion de memoria (accesos)).

> Hablamos de los cores, los hilos. Los constructores (empresas) lo alteran para ganar en la competencia, pero todas las empresas se basan en el modelo de Von Neumann.

## - Hardware de un SI:

  > El microprocesador es la CPU, no el pc entero (obvio).

- ### ¿Que contiene una CPU?:

  - **ALU + CU + REGISTROS;**

  - **Núcleos o núcleo;**

  - **Memoria caché** => memoria que tiene ahi a mano la CPU, auxiliar, dentro del chip, donde va dejando partes de la memoria RAM, ya que esta es grande y
     lento acceder a ella.
     Hay memorias caché de varios niveles, solo se ataca a la caché del siguiente nivel. Revisar con el robotito;

     - EJEMPLO: Quiero buscar un programa en la memoria ram, tiene que registrar la parte de la memoria donde esta, y es muy grande;


  - Otros controladores como **memorias graficas**. Hay que asociar que controlador (en fisico) es hardware y driver es software;
     - Un controlador por ejemplo puede ser una tarjeta grafica. Al principio las CPUs no tenian controladores graficos, pero con
       los avances, las cpus necesitan memorias graficas (grafica integrada);

  - Las marcas mas conocidas son AMD e INTEL.

  - ### ¿Que parametros manejamos para saber si una cpu es mejor que otra?:

    - **Frecuencia (velocidad)**: GHz (gigahercios) => Cuantos ciclos por segundo.
    - **Numero de hilos (threads).** 
    - **Consumo o potencia termica: W (vatios).**
    - **Nivel de integración: nanómetros.** 
      
    > Las cpus suelen tener disipadores de calor, la cpu se calienta un huevo, por eso se coloca disipación y pasta termica (no tiene porque, pero es lo ideal);

  -> La CPU es un chip => Dentro de la cpu puede haber un nucleo => este tiene la ALU, CU y registros => Los registros se comunican con un bus interno, si solo tiene
  un nucleo logico solo puede procesar una tarea a la vez. Si hay mas de 1 nucleo, las instrucciones se ejecutan en paralelo, eso quiere decir que puede ejecutar
  varias instrucciones a la vez;

  -> Importante preguntar al robotito;

  -> Pueden haber mas de 1 hilo (core logico) por CPU, hyperthreading => ver ese concepto;

  -> Bus interno y bus del sistema;

  -> Las memorias caché L1 (nivel 1), normalmente situada en cada nucleo. Las memorias L2 (nivel 2) estan fuera del nucleo 
     pero compartidas entre varios (en el bus interno??). Luego las de L3 (tercer nivel) que estan fuera de los nucleos pero siguen
     estando compartidas pero directamente con la memoria (revisar con el robotito). Tienen distinto uso.

  -> Von Neumann solo hablaba de la CU, ALU y registros. Pero con el tiempo se acaba agrandando todo.


- ¿Que contiene una memoria?

  -> Hay muchos tipos de memorias, por ejemplo: los registros (en los nucleos de la CPU), la memoria caché (en los nucleos de la CPU)
     y la memoria RAM (en modulos separados de la placa base);

  -> También se puede ampliar la memoria RAM, con placas con circuitos integrados que van en una sección de la placa base. Estas tiras se
     clavan en vertical. Hay distintos tipos, DDR2, DDR3, DDR4, DDR5...etc;

  -> Al aumentar la memoria RAM, es un tipo de componente, pero no es el unico. El cambio no tiene porque ser sustancial, lo mas caro suele ser
     la cpu o la placa base. Pero la realidad es que lo mas caro acaba siendo la memoria grafica dedicada;

  -> ¿Que parametros se siguen en una memoria?:
    - Capacidad: GB (gigabytes);
    - Velocidad: GHz (gigahercios);
    - Tipo: DIMM (por ejemplo);
    - Tecnologia: DDR5 (por ejemplo) => Conceptos como dual channel o quad channel: para que funcione el acceso a la memoria más rápido;
    - Latencia: numero de ciclos de reloj (ver en el robotito);

- ¿Qué contiene una placa base?:

  -> Factores de forma => Son estandares, distribucion, algunas normas que se estandarizan y demas. Los dos factores de forma son ATX o ITX (tamaño de la placa base);
  -> Chipset => Es el principal chip de la placa: integra la mayor parte de esta en 1 solo chip (puentes??). Un chipset es una integracion de la propia placa base. Puede
                tener un disipador.

  -> Zocalo (o socket) del microprocesador => una base donde se coloca el chip (la cpu, y suele tener una palanquita al lado) => tipo zif o lga;
  -> Ranuras para RAM (espacios en la placa base para colocar la RAM);
  -> Ranuras de expansión => Para memorias graficas dedicadas o tarjetas de red o de sonido...etc;
  -> BIOS => Contiene todas las funciones de arranque del pc (a veces hay dos por seguridad y tienen una pila botón) => ram-cmos;
  -> Conectores internos como SATA, M.2, discos, ventiladores, alimentación...etc.
  -> Conectores externos como USB, VGA, HDMI...etc.

- ¿Qué son los dispositivos de almacenamiento secundario, y que tipos hay?: son memorias, pero no primarias como la RAM (volátil), habitualmente son NO VOLÁTILES;

  -> Medios de almacenamiento Flash => SSD, tarjetas de memoria SD. Son los mas rápidos, ligeros, resistentes y con menor consumo de energía.
  -> Dispositivos de almacenamiento magnético => HDD, cintas. Las cintas pueden contener mucha información, pero son muy lentas, se suelen usar en backups (copias de seguridad de datos grandes).
  -> Medios de almacenamiento óptico => CD, DVD. Estos estan en decadencia, ahora se usa almacenamiento en la nube o discos externos.

- ¿Cuales son las características de una fuente de alimentación?:

  -> Suministra energía a cada componente.
  -> Barrera de protección eléctrica.
  -> ¿¿Ventilación en sobremesas??

- ¿Qué son los perifericos y cuales hay?: son dispositivos que permiten al usuario interactuar con el equipo. Hay tres tipos:

  -> Perif. de entrada.
  -> Perif. de salida.
  -> Perif. de entrada y salida.

- ¿Qué es un controlador y un driver?: 
  
  -> Un controlador (hardware) es una parte de un dispositivo que hace que funcione este.
  -> Un driver (software) es un software específico para ese controlador que le sirve al sistema operativo para controlarlo.

  -> ¿Cómo se instalan los drivers?: Puede ser de forma manual o desde un administrador de dispositivos. (placa base, chipset, tarjetas de red...);
     - comando en windows para instalar los controladores desde la cmd => devmgmt

  -> Un comando de linux siempre empieza por sudo => sudo lshw


## - SOFTWARE:

- ¿Qué tipos de software hay?:
  -> De Sistema: sistemas operativos por ejemplo.
  -> De Aplicación: todos los programas que se van instalando.

  -> Para desarrollar los dos anteriores se requieren compiladores, editores, entornos de desarrollo...etc.


- ¿Qué es un sistema operativo?:

  -> Un sistema operativo es una interfaz entre el usuario y el hardware y gestiona todos los recursos sin que necesite intervenir el usuario.

  -> 'Kernel' es el núcleo de un sistema operativo (software).

- ¿Qué instrucciones se ejecutan en la BIOS?:

  -> 1. Se hace un testeo del sistema => llamado POST (power on self test);
  -> 2. La BIOS inicializa los componentes hardware según los valores de la RAM-CMOS (memoria de la BIOS => se mantiene no volatil gracias a la pila redonda);

// CLAVE => posible pregunta de examen;
  -> 3. La BIOS cede el testigo al sistema operativo, se lo pasa al medio de almacenamiento. No tiene porque arrancar desde un disco duro, arranca desde el primer dispositivo de almacenamiento que asignemos.

- ¿Qué es una máquina virtual?: Es una computadora no real, instalada y configurada en un SO, mediante un software que permite simular su funcionamiento.

  -> Un archivo iso (imagen iso) es una imagen de DVD. En este caso, es una imagen de un sistema operativo.

- ¿que tipos de estructuras hay?:

- tipo 2 (hipervisor alojado):

  -> MÁQUINA VIRTUAL (PUEDO CREAR VARIAS MÁQUINAS VIRTUALES) => aqui se encuentra el guest (invitado).
        |
  -> SOFTWARE DE VIRTUALIZACIÓN.
        |
  -> SISTEMA OPERATIVO ANFITRION (HOST, anfitrión).
        |
  -> HARDWARE.

- tipo 1 (hipervisor nativo):

  -> en esta primera configuracion el sistema operativo no va por encima (no hay host)  => nosotros estariamos en el tipo 2, con Oracle VirtualBox (tipo guest);

- ¿Para que sirve una maquina virtual?: para hacer pruebas en un entorno no real (prevenir riesgos con la máquina real), portabilidad (es facil exportar 
  las maquinas virtuales entre pcs), ahorro de costes, copias de seguridad;



- SEGURIDAD EN PUESTO DE TRABAJO:

  -> PANTALLAS (que se vea bien, personalizable, tema contraste y demás...)

  -> TECLADO (inclinable, independiente de la pantalla, espacio suficiente para descansar los brazos...)

  -> MESAS (superficie con dimensiones suficientes para que quepa todo)

  -> ASIENTO (regulable en altura y demás...)

  -> ENTORNO DE TRABAJO (espacio suficiente para moverse, iluminacion adecuada, poco ruido, condiciones atmosféricas adecuadas...)

  -> Leer el manual de instrucciones, mantener los componentes electricos en buen estado...


- hipervisor tipo 2, hipervision tipo 1:

  -> hipervisor tipo 1 (nativo, sin host (sistema operativo) se instala el software de virtualización sobre el hardware) => ejemplos: hyper-v, xen, mvware esxi 
     (hipervisores bare-metal).

  -> hipervisor tipo 2 (alojado, se instala sobre el sistema operativo principal (este es el host)) => Oracle VirtualBox (también puede ser tipo 1)... (ojo, esto es 
     un software de virtualización).

- Mareframes y supercomputador:

  -> Un mareframe es un gran pc como de una habitacion de grande, son servidores centrales de las altas corporaciones.

  -> Un supercomputador es un solo pc muy potente, normalmente con muchas cpus, que solo se dedica a un propósito (nivel estatal o ciudad autónoma).

- UEFI (Unified Extensible Firmware Interface);

> Si eliges la iso desde el menu de creación de máquina virtual se te instala automáticamente, para ver la configuración completa en la instalación de windows no se pone iso.

## - PRACTICAS Y ACLARACIONES:

- En la práctica poner los pasos para instalar una máquina virtual, con imágenes y demás.
- Para abrir el administrador de tareas desde la cmd poner: **taskmgr** (taskmanager).
- Para abrir el administrador de dispositivos: **devmgmt** (device management).
- En Linux se pone **sudo lshw**: "sudo" siempre se pone delante para ejecutar como administrador.
- **Exportar una máquina virtual**: Apagar la máquina, click derecho y pon "exportar a OCI" (es una copia de seguridad de nuestra máquina). => meterlo en la práctica.
- **Hacer una instantánea**: Click sobre "máquina", después en "herramientas" y pulsar "instantáneas". => meterlo en la práctica.
