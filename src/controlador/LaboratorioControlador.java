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

/**
 *
 * @author Alejandro
 */
public class LaboratorioControlador {

    private Laboratorio laboratorio;
    
    ConexionBDD conexion=new ConexionBDD();
    Connection connection=(Connection) conexion.conectar();
    PreparedStatement ejecutar;
    ResultSet resultado;
    
    public void crearLaboratorio(Laboratorio l){
        try {
            String consulta = "INSERT INTO laboratorios(lab_nombre, "
                    + "lab_edificio, "
                    + "lab_numComputadoras, "
                    + "enc_id) " +
            "VALUES ('" + l.getNombre() + "','" 
                    + l.getEdificio() + "'," 
                    + l.getNumComputadoras() + ");";
            
            ejecutar =(PreparedStatement) connection.prepareCall(consulta);
            
            int res = ejecutar.executeUpdate();
            
            if(res > 0){
                System.out.println("¡LABORATORIO HA SIDO CREADA CON EXITO!");
                ejecutar.close();
            }else{
                System.out.println("¡ERROR! INGRESE CORRECTAMENTE LOS DATOS CORRECTAMENTE");
                ejecutar.close();
            }
            
        } catch(Exception e){
            //Captura el error en memoria y continúa la ejecución
            //ERROR - DEBUG
            System.out.println("ERROR: " + e);
        }
    }
}
