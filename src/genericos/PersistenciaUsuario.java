/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package genericos;

import java.util.ArrayList;
import java.io.*;

/**
 *
 * @author T-107
 */
public class PersistenciaUsuario {
    //Esta es ubna clase model de tipo logico, solamente contiene metodos que representan acciones concretas. la sintaxis y estructura de dicho
    //metodo depende de la accion.
    
    ArrayList <Usuario> usuarios;
    public PersistenciaUsuario(){
    usuarios=new ArrayList<>();
    }
    
    public void guardar(Usuario u)throws Exception{
        //Paso 1: Generar el archivo a guardarse
        File f = new File ("archivaldo.raton");
        //indicar que se va a guardar
        FileOutputStream fos= new FileOutputStream(f);
        
        //Generar el objeto que nos va a ayudar a guardar el arrayList de usuarios
        ObjectOutputStream oos= new ObjectOutputStream(fos);
        
        //Ahora se guarda el objeto
        
                              usuarios.add(u);
              oos.writeObject(usuarios);
    
    }
}
