/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package metodos;

public class ProbarUsuario {
    public static void main(String[] args) {
        // Creamos un objeto con el constructor de
        // defecto de la clase Usuario
        Usuario u1=new Usuario();
        u1.setEdad(19);
        
        //CReamos un obejto de la clase logica
        OperacionesUsuario o=new OperacionesUsuario();
       System.out.println("Tu edad en dias es "+ o.calcularEdadEnDias(u1)); 
    }
}
