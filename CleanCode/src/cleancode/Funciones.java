/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cleancode;

/**
 *
 * @author fabio.cano
 */
public class Funciones {

    //Tamaño reducido: las funciones deberian tener un tamaño reducido de 3 a 4 lineas de codigo :o
    //Bloques y sangrado: los bloques en instrucciones if, else, while y similares deben tener una liea de longitud
    /*Hacer una cosa: aplica el principio de responsabilidad unica, las funciones solo deben hacer una cosa, deben hacerlo bien y debeer lo unico que hagan
    Si una funcion solo realiza los pasos situados a un niver por deebajo del nombre de la funcion, entonce hace una cosa
     */
    //Un nivel de abtraccion por funcion: asegurese que las intrucciones de la funcion se encuntran en el mismo nivel de abtraccion
    //La regla descendente: tras todas lasf funciones aprezan las del siguiente niel de abtraccion por vex mientras leemos la lista de funciones
    /*Instrucciones swith: Incluilar en una clase de nivel inferior, ocultando la instruccion switch en un factoria abstracta e impedir que nadie le vea
    la factoria usa la instruccion para crear instancias adecuadas de los derivados de Employee y las distintas funciones como calculatePay, isPayDay y deliverPay
    se etregaran de forma polimorfica a traves de la interfaz Empleyee*/
    //Nombre descriptivos: nombres adecuados para pequeñas funciones que hacen una cosa, leer la funcion con varios nombres
    //Argumentos de funciones: la cantidad maxima de argumentos es 2, 3 o mas ya si es un caso especial, pero en la mayoria evitar muchos argumentos, un argumento de salida suele ser la mejor opcion
    //Formas monádicas hibituales: Pasar un solo argumento a una funcion y retornar un solo valor en lo posible
    //Argumentos de indicador: evitar en lo posble pasar valores booleanos a las funciones
    //Funciones diadicas: las partes que ignoramos son las que esconden los errores, evitar las funciones de dos parametros, para esto utilce mejor funciones mienvros o gnere un calse para manipular los prametros
    //Triadas: las triadas son mucho mas dificiles de entender
    //Objeto de argumento: agrupar dos o mas argumentos en un clase
    //verbos y palabras claves: mitigar el orden de los argumentos, es mejor writeField(name) que write(name), la primera nos indica que se escribira name hace parte de field
    //Un metodo no debe modificar un objeto y devolver algo, para esto separe las dos acciones
    //Evitar condicionales y mucho codigo en las intrucciones try/catch
    //Una funcion que procese errores no debe hacer nada mas, esto significa que si un funcion porcesa errores debe empezar con un try y no debe haber nada mas debajo del catch/finally
    //NO REPETIR CODIGO!!
    //Usar comentarios solo si se quiere expresar una advertencia o algun impedimento y los TODO o para resaltar algo importante que a primera vista se malinterpreta
    //Espacios enre los metodos es importante para la legibilidad de la clase
    //Poner las variables de instancia al inicio de la clase para facilitar la lectura
    //Poner los llamados de los metodos de forma descendentem es decir primero el que invoca y despues el invocado
}
