/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

/**
 *
 * @author Alejandro
 */
public class Persona {
    
    private int idPersona;
    private String nombre;
    private String apellido;
    private String cedula;
    private String correoElectronico;
    private String direccion;
    private String telefono;
    private String clave;

    public Persona(int idPersona, String nombre, String apellido, String cedula, String correoElectronico, String direccion, String telefono, String clave) {
        this.idPersona = idPersona;
        this.nombre = nombre;
        this.apellido = apellido;
        this.cedula = cedula;
        this.correoElectronico = correoElectronico;
        this.direccion = direccion;
        this.telefono = telefono;
        this.clave = clave;
    }

    public int getIdPersona() {
        return idPersona;
    }

    public void setIdPersona(int idPersona) {
        this.idPersona = idPersona;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getCedula() {
        return cedula;
    }

    public void setCedula(String cedula) {
        this.cedula = cedula;
    }

    public String getCorreoElectronico() {
        return correoElectronico;
    }

    public void setCorreoElectronico(String correoElectronico) {
        this.correoElectronico = correoElectronico;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getClave() {
        return clave;
    }

    public void setClave(String clave) {
        this.clave = clave;
    }

  public String imprimir(){
        return 
               "--------Datos Persona--------"+"\n"+ 
                "Nombre" +getNombre()+"\n"+
                "Apellido" +getApellido()+"\n"+
                "Cedula" +getCedula()+"\n"+
                "Correo Electronico" +getCorreoElectronico()+"\n"+
                "Direccion" +getDireccion()+"\n"+
                "Telefono" +getTelefono()+"\n"+
                "Clave:" + "************\n"
                ;
    }
    


    
    
    }
    

