## - Dudas iniciales:

- En conversiones el pequeño se mete en el grande => float a double... **// SOLUCIONADO**

- ¿Diferencia entre List y ArrayList? => porque se usa List<clase envolvente> nombre = [new ArrayList<>();] => ¿porque no se pone List?. **// SOLUCIONADO**

- Saber bien para que sirve el comodin => [List<?>] => se pueden meter todo tipo de objetos, pero realmente, ¿cual es su uso?. **// SOLUCIONADO**

- Saber bien que es un String. **// SOLUCIONADO**

<-------------------------------------------------------------------------------------------------------------->

## - Como resolver un problema:

  -> 1. ¿Entiendo lo que me pide el problema?               
  -> 2. ¿Tenemos toda la información?                        
  -> 3. ¿Me se todos los pasos para llegar al resultado?    
  -> 4. Traducción en herramientas.                           
  -> 5. La integración de herramientas.                     

<-------------------------------------------------------------------------------------------------------------->

## - Dudas sobre strings (o tareas):

- En el desafío del capicúa mirar lo del tema del break. ¿Porque es una mala práctica? **// SOLUCIONADO;**

- ¿Como puedo saber si un DNI es un DNI sin usar regex (expresiones regulares)? **// SOLUCIONADO;**

- Hacer el desafío del capicúa con el while **// SOLUCIONADO;**

- ¿que es un charSequence? => Basicamente es una interfaz. Las interfaces no se pueden instanciar por si solas, necesitas llamar a una clase que implemente la interfaz
  para poder usar los metodos que residen en ella. Los metodos de una interfaz son abstractos, eso quiere decir que no contienen logica, la logica se la proporcionas tu
  al llamarlos (esta lógica se llama "implementación"). **// SOLUCIONADO;**

- aprender regex (algo al menos). ---> EN PROCESO;

- ver lo de la biblia esa de java. **// SOLUCIONADO;**

- Clarificar lo del capicúa con while, usando un valor booleano que se llame "patrónEncontrado" y crear una condición para ambas respuestas. Si coincide o no (da igual
  que sea corto). **// SOLUCIONADO;**

- Hacer el identificador de dni sin bucles, y con una sola función. No hace falta un bucle for, utiliza las letras como String y usa el index asociado al texto para
  comparar el modulo con la letra asociada. **// SOLUCIONADO;**

  <-------------------------------------------------------------------------------------------------------------->

## - Tareas random para probar cosas:

- Hacer conversiones de binario a hexadecimal, luego a octal, y viceversa (probar y eso). **// SOLUCIONADO;**
- Aprender regex y hacer un comprobante de correo electrónico (intentar hacerlo sin regex y con regex). 
- Hacer un scanner que te pregunte que pongas un numero binario y que te pregunte a que quieres convertirlo. **// SOLUCIONADO;**
- Hacer un conversor de binario a decimal, y decimal a hexadecimal manualmente. **// SOLUCIONADO;**
- Mirar lo de double.isNaN()... => clave del exito. **// SOLUCIONADO;**
- Hacer los ejercicios del https://notepad.pw/programacion2023. **// SOLUCIONADO;**

<-------------------------------------------------------------------------------------------------------------->

## - Mejoras de código:

- Modificar la parte de conversor.java que va desde la linea 32 a la linea 41. Intentar incluir en las letras también los números, así te saltas la sincronización (me refiero a sincronizar el resto
  con las letras, empezando desde 0). **// SOLUCIONADO;**

- Cambiar la forma de hacer lo de los números consecutivos, hacerlo con if y eso. **// SOLUCIONADO;**

<-------------------------------------------------------------------------------------------------------------->

## - Desafíos mayores:

- Hacer el ejercicio de la simulación del universo esta rara.
- Notas: -> Los pesos sumados tendrán un máximo de 9, a partir de 9 no pasa nada (se trata el 9 como peso infinito).
         -> Usar caracteres (mejor no usar String, da problemas).
         -> Ver que cojones es recursividad.

<-------------------------------------------------------------------------------------------------------------->
## - Ejercicios buenardos:

- Escribir un programa que pida al usuario un número entero y muestre por pantalla un triángulo rectángulo como el de más abajo:

1
3 1
5 3 1
7 5 3 1
9 7 5 3 1 => **// SOLUCIONADO;**

- Escribir un programa que pida al usuario un número entero y muestre por pantalla si es un número primo o no. **// SOLUCIONADO;**

- Hacer un menu con unas opciones, si seleccionas una, que no acabe el proceso, que se pueda seguir eligiendo opciones (usar while y eso). Comprobar que lo que ponga la persona sea un número
  (el número de la opción en cuestión), si es otra cosa, decir que no se puede o algo asi.

