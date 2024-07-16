/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

/**
 *
 * @author Alejandro
 */
public class Encargado extends Persona {
    
    private int idEncargado;
    private int idPersona;

    public Encargado() {
    }

    public Encargado(int idEncargado, int idPersona, String nombre, String apellido, String cedula, String correoElectronico, String direccion, String telefono, String usuario, String clave) {
        super(idPersona, nombre, apellido, cedula, correoElectronico, direccion, telefono, usuario, clave);
        this.idEncargado = idEncargado;
        this.idPersona = idPersona;
    }

    public int getIdEncargado() {
        return idEncargado;
    }

    public void setIdEncargado(int idEncargado) {
        this.idEncargado = idEncargado;
    }

    public int getIdPersona() {
        return idPersona;
    }

    public void setIdPersona(int idPersona) {
        this.idPersona = idPersona;
    }
    
    @Override
    public String imprimir(){
        return 
                """
                ---------Datos Docente--------
                Nombre""" +getNombre()+"\n"+
                "Apellido" +getApellido()+"\n"+
                "Cedula" +getCedula()+"\n"+
                "Correo Electronico" +getCorreoElectronico()+"\n"+
                "Direccion" +getDireccion()+"\n"+
                "Telefono" +getTelefono()+"\n"+
                "Clave:" + "************\n";
    }
    
}
