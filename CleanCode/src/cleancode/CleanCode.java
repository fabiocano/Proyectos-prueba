/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cleancode;

import java.util.Date;
/**
 *
 * @author fabio.cano
 */
public class CleanCode {

//Los nombres deben indicar, porque Existen, que hace y como se usa

int elapsedTimeInDays = 1;
int daysSinceCreation = 2;
int daysSinceMidificacion  = 3;
int fileAgeInDays = 4;

//Evitar la desinformacion

int accountList = 0; //Este no es un lista, evitar infromacion falsa mejor solo aacounts
String[] accuonts = {"Juan", "Carlos","Pedro"}; // La ortografia es importante

//Debe diferenciar los nombres de forma que el lector aprecie las diferencias, costumerInfo no se distingue de costumer

//Usar nombres pronciables

//En ves de:

private Date genymdhms;

//Usar;

private Date genrationTimestamp;

//utilizar nombres entendibles para constantes

int WORK_DAYS_PER_NAME = 5;

//No utilizar prefijos de nombre
private String m_desc;
void setNmae(String name)
{
    m_desc = name;
}

//Utilizar:
String description;
void seDescription(String description){
    this.description = description;
}

//Las calses y objetos deben tener nombres o frases de nombre como Customer, WikiPage, Account y AddressParser, el nombre de una clase no debe ser un verbo.

//Los nombres de metodos deben tener nombres de verbo como postPayment, deletePage o save.
/*Los metodos de acceso, de modificacion y los predicados deben tener como nombre su valor
y usar como prefijo get set e is de acuerdo al estandar de javabean.*/

//Mo usar bromas ni entreniemnto en el codigo

//Eliga una palabra por cada concepto abstracto y mantengalo

//Evitar juegos de palabras, si ya tiene varios metodos add que semanticamnete hacen lo mismo, y quiere agregar otro metrodo add que no, mejor opte por appen o insert

//Usar terminos infromaticos, algoritmos, nombres de patrones y terminos matematicos y demas

//Cuando no existe un termino de progrmacion para lo que este haciendo, use el nombre del dominio de problemas.

//Añadir contexto con sentido, si un conjunto de variables pertenec a un estructura mas grande utilizar prefijos o crear clase para es contexto

//No utilizar contextos innecesarios en vez de constumerAddres use solo Adrees, contumerAdres es mejor como objeto
    
}
