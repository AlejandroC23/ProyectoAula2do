/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

/**
 *
 * @author Alejandro
 */
public class Administrador extends Persona {
    
    private int  idAdministrador;

    public Administrador(int idAdministrador, int idPersona, String nombre, String apellido, String cedula, String correoElectronico, String direccion, String telefono, String clave) {
        super(idPersona, nombre, apellido, cedula, correoElectronico, direccion, telefono, clave);
        this.idAdministrador = idAdministrador;
    }

    public int getIdAdministrador() {
        return idAdministrador;
    }

    public void setIdAdministrador(int idAdministrador) {
        this.idAdministrador = idAdministrador;
    }
    
    public String imprimir(){
        return 
                """
                ---------Datos Administrador--------
                Nombre""" +getNombre()+"\n"+
                "Apellido" +getApellido()+"\n"+
                "Cedula" +getCedula()+"\n"+
                "Correo Electronico" +getCorreoElectronico()+"\n"+
                "Direccion" +getDireccion()+"\n"+
                "Telefono" +getTelefono()+"\n"+
                "Clave:" + "************";
                
    }
}
