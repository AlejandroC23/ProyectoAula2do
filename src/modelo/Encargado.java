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
    
    private int idDocente;

    public Encargado(int idDocente, int idPersona, String nombre, String apellido, String cedula, String correoElectronico, String direccion, String telefono, String clave) {
        super(idPersona, nombre, apellido, cedula, correoElectronico, direccion, telefono, clave);
        this.idDocente = idDocente;
    }

    public int getIdDocente() {
        return idDocente;
    }

    public void setIdDocente(int idDocente) {
        this.idDocente = idDocente;
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
