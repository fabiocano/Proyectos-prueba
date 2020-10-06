/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cleancode;

/**
 *
 * @author fabio-cano
 */
public class ObjetosYEstructuras {

    /* NOTAS: 
    
    1. Abstracción de datos: NO queremos mostrar los detalles de los datos, sino expresarlos
        en terminos abstractos
    2. La idea de que todo es un objeto es un mito, EN ocaciones solamente queremos
        estructuras de datos con procedimientos que operen en las mismas
    3. La ley de Demeter: Un modulo no debe conecer los entresijos de los objetos que manipula
        Un metodo f de una clase C solo debe invocar los metodos de: 
        - C
        - Un objeto creado por f
        - Un objeto pasado como argumento a f
        - Un objeto en una variable de instancia de C.
        
        Choque de trenes: 
        final String OutputDir = ctxt.getOptions.getScratchDir().getAbsolutePath();
        
        Cambiar a:
        
        Options opts = txt.getOptions();
        File scratchDir = opts.getScratchDir();
        final String outputDir = scrathDir.getAbsolutePath();
    
    Conclusion: Los objetos muestran comportamiento y ocultan datos, Esto facilita
    la inclusion de nuevos tipos de objetos sin necesidad sin necesidad de cambiar
    los comportamientos existentes, Tambien dificulta la inclusion de nuevos
    comportamientos en objetos existentes. Las estructuras de datos muestran datos
    y carecen de comportamiento significativo, esto facilita la inclusion de nuevos
    comportamientos en las estructuras de datos existentes pero dificulta la inclusion 
    de nuevas estructuras de datos en funciones existentes.
    
    Siguiente pag 131.
     */
}
