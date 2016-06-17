/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package excepciones;

/**
 *
 * @author campitos
 * Aqui usaremos lsd excepciones de tipo checked, en als que
 * tu te tienes que hacer cargo de ellas. Vamos a usar un paquete
 * que no se encuentra por defecto, tienes que agregarlo con un import
 */

/* primer regla: un bloque try catch tiene una llave de apertura y una llave de cierre. Dentro de su cuerpo puede contener
uno o mas renglones que lancen excepciones

segunda regla, despues del try inmediatamente sigue el bloque catch, puede haber tantos catch como excepciones se lancen en el
*/
import java.io.*;
import java.util.logging.Level;
import java.util.logging.Logger;

public class SegundaExcepcion {
    
    
    public static void main(String[] args) {
        
        
        File f=new File("D:\\hola.txt");
        try {
            int x=2;
            int y=0;
            int div=x/y;
            
            
           
            FileInputStream fis=new FileInputStream(f);
              
            int  ch=0;
               
                       StringBuilder builder=new StringBuilder();
               
                       while((ch=fis.read())!=-1){     
                      builder.append((char)ch); 
        } 
                       
                       System.out.println("se leyo bien " + builder.toString());
        }
               catch (FileNotFoundException ex) {
                   System.out.println("Revisa la ubicacion y el nombre del archivo");
           
        } catch (IOException ex) {
     
        } catch(Exception e){
            System.out.println(e.getMessage());
        }finally{
        }
    }
    
}
/*puede ponerse en solo catch con una referencia a excepcion y ella se hace
cargo de cualquier numero de excepxiones que podrian tenerse en el try
                   Es conveniente cerrar el codigo de excepciones con un bloque catch que tenga un referencia de excepcion
                   seguido de un finally*/