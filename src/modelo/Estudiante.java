/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

/**
 *
 * @author Alejandro
 */
public class Estudiante extends Persona {
    
    private int idEstudiante;
    private String matricula;
    private boolean finalizoMantenimiento;

    public Estudiante(int idEstudiante, String matricula, boolean finalizoMantenimiento, int idPersona, String nombre, String apellido, String cedula, String correoElectronico, String direccion, String telefono, String clave) {
        super(idPersona, nombre, apellido, cedula, correoElectronico, direccion, telefono, clave);
        this.idEstudiante = idEstudiante;
        this.matricula = matricula;
        this.finalizoMantenimiento = finalizoMantenimiento;
    }

    public int getIdEstudiante() {
        return idEstudiante;
    }

    public void setIdEstudiante(int idEstudiante) {
        this.idEstudiante = idEstudiante;
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public boolean isFinalizoMantenimiento() {
        return finalizoMantenimiento;
    }

    public void setFinalizoMantenimiento(boolean finalizoMantenimiento) {
        this.finalizoMantenimiento = finalizoMantenimiento;
    }
    
    public String imprimir(){
        return 
                "---------Datos Estudiante--------"+"\n"+
                "Nombre" +getNombre()+"\n"+
                "Apellido" +getApellido()+"\n"+
                "Cedula" +getCedula()+"\n"+
                "Correo Electronico" +getCorreoElectronico()+"\n"+
                "Direccion" +getDireccion()+"\n"+
                "Telefono" +getTelefono()+"\n"+
                "Clave:" + "************\n"+
                "Numero Matricula: "+getMatricula();
    }
    
}
