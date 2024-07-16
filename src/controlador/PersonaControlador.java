/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controlador;

import com.mysql.jdbc.Connection;
import com.mysql.jdbc.PreparedStatement;
import controlador.ConexionBDD;
import modelo.Persona;
import java.sql.ResultSet;

/**
 *
 * @author Alejandro
 */
public class PersonaControlador {
    private Persona persona;
    //Conexión
    ConexionBDD conexion=new ConexionBDD();
    Connection connection=(Connection) conexion.conectar();
    PreparedStatement ejecutar;
    ResultSet resultado;
    
    public void crearPersona(Persona p){
        try {
            String consulta = "INSERT INTO personas(per_nombre, "
                    + "per_apellido, "
                    + "per_cedula, "
                    + "per_usuario, "
                    + "per_clave, "
                    + "per_telefono, "
                    + "per_correoElectronico, "
                    + "per_direccion) " +
            "VALUES ('" + p.getNombre() + "','" 
                    + p.getApellido() + "','"
                    + p.getCedula()+ "','"
                    + p.getUsuario() + "','" 
                    + p.getClave() + "','" 
                    + p.getTelefono()+ "','"
                    + p.getCorreoElectronico() + "','" 
                    + p.getDireccion() + "');";
            
            ejecutar =(PreparedStatement) connection.prepareCall(consulta);
            
            //Ejecutar la consulta
            int res = ejecutar.executeUpdate();
            
            if(res > 0){
                ejecutar.close();
            }else{
                ejecutar.close();
            }
            
        } catch(Exception e){
            //Captura el error en memoria y continúa la ejecución
            //ERROR - DEBUG
            System.out.println("ERROR: " + e);
        }
    }
    
    public int buscarIdPersona(String usuario){
        try {
            String consulta = "SELECT per_id FROM personas "
                    + "WHERE per_usuario = '" + usuario + "';";
            ejecutar = (PreparedStatement) connection.prepareCall(consulta);
            
            resultado = ejecutar.executeQuery(consulta);
            
            if(resultado.next()){
                int idPersona = resultado.getInt("per_id");
                return idPersona;
            }else{
                System.out.println("¡ERROR EN EL SISTEMA! CONTACTE AL ADMINISTRADOR");
            }
            ejecutar.close();
        } catch (Exception e) {
            System.out.println("¡ERROR EN EL SISTEMA! COMUNIQUESE CON EL ADMINISTRADOR\n"
                     + "PARA SOLUCIONAR SU PROBLEMA: " + e);
        }
        return 0;
    }
}
