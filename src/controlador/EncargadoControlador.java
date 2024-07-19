/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controlador;

import com.mysql.jdbc.Connection;
import com.mysql.jdbc.PreparedStatement;
import controlador.ConexionBDD;
import modelo.Laboratorio;
import java.sql.ResultSet;
import modelo.Encargado;
/**
 *
 * @author LENOVO
 */
public class EncargadoControlador {
    private Encargado encargado;
    
    ConexionBDD conexion=new ConexionBDD();
    Connection connection=(Connection) conexion.conectar();
    PreparedStatement ejecutar;
    ResultSet resultado;
    
     public void crearEncargado(int idPersona){
        try {
            String consulta = "INSERT INTO encargados(per_id) " + "VALUES (" + idPersona + ");";
            
            ejecutar =(PreparedStatement) connection.prepareCall(consulta);
            
            int res = ejecutar.executeUpdate();
            
            if(res > 0){
                System.out.println("ENCARGADO HA SIDO CREADA CON EXITO");
                ejecutar.close();
            }else{
                System.out.println("¡ERROR! INGRESE LOS DATOS CORRECTAMENTE");
                ejecutar.close();
            }
            
        } catch(Exception e){
            //Captura el error en memoria y continúa la ejecución
            //ERROR - DEBUG
            System.out.println("ERROR: " + e);
        }
    }
}

    

