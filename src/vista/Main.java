/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package vista;

import controlador.EncargadoControlador;
import controlador.EstudianteControlador;
import controlador.PersonaControlador;
import java.util.Scanner;
import modelo.Encargado;
import modelo.Estudiante;
import modelo.Persona;

/**
 *
 * @author Alejandro
 */
public class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int opcMain;
        
        do{
            System.out.println("    --------- SISTEMA DE REGISTRO DE MANTENIMIENTO IST 17J ---------");
            System.out.println("                    --------- Menú Admin ---------");
        
            System.out.print("""
                         ¿Qué acción desea realizar?
                         1. Crear cuenta estudiante
                         2. Crear cuenta encargado
                         3. Crear cuenta administrador
                         4. Salir
                         """);
            System.out.print("Opción: ");
            opcMain = s.nextInt();
            
            switch (opcMain) {
                case 1 -> {
                   System.out.println("""
                                    \n------ Registro de Usuario Estudiante -----
                                //Ingrese los siguientes datos informativos""");
                    //MODELO DE LA SUPERCLASE
                    Persona p = new Persona();
                    System.out.print("Ingrese el nombre: ");
                    p.setNombre(s.next());
                    System.out.print("Ingrese el apellido: ");
                    p.setApellido(s.next());
                    System.out.print("Ingrese el número de cédula: ");
                    p.setCedula(s.next());
                    System.out.print("Ingrese el usuario: ");
                    p.setUsuario(s.next());
                    System.out.print("Ingrese la clave: ");
                    p.setClave(s.next());
                    System.out.print("Ingrese el teléfono: ");
                    p.setTelefono(s.next());
                    System.out.println("Ingrese la dirección: ");
                    p.setDireccion(s.next());
                    System.out.print("Ingrese el correo electrónico: ");
                    p.setCorreoElectronico(s.next());
                    //CONTROLADOR SUPERCLASE
                    PersonaControlador pc = new PersonaControlador();
                    pc.crearPersona(p);
                    //OBTENER ID DE LA SUPERCLASE (PERSONAS)
                    int idPersona = pc.buscarIdPersona(p.getCedula());
                    
                    //MODELO DE LA SUBCLASE
                    Estudiante est = new Estudiante();
                    est.setIdPersona(idPersona);
                    //CONTROLADOR SUBCLASE
                    EstudianteControlador ec = new EstudianteControlador();
                    ec.crearEstudiante(est);
                }
                case 2 -> {
                    System.out.println("""
                                    \n------ Registro de Cuenta Encargado -----
                                //Ingrese los siguientes datos informativos""");
                    //MODELO DE LA SUPERCLASE
                    Persona p = new Persona();
                    System.out.print("Ingrese el nombre: ");
                    p.setNombre(s.next());
                    System.out.print("Ingrese el apellido: ");
                    p.setApellido(s.next());
                    System.out.print("Ingrese el número de cédula: ");
                    p.setCedula(s.next());
                    System.out.print("Ingrese el usuario: ");
                    p.setUsuario(s.next());
                    System.out.print("Ingrese la clave: ");
                    p.setClave(s.next());
                    System.out.print("Ingrese el teléfono: ");
                    p.setTelefono(s.next());
                    System.out.println("Ingrese la dirección: ");
                    p.setDireccion(s.next());
                    System.out.print("Ingrese el correo electrónico: ");
                    p.setCorreoElectronico(s.next());
                    //CONTROLADOR SUPERCLASE
                    PersonaControlador pc = new PersonaControlador();
                    pc.crearPersona(p);
                    //OBTENER ID DE LA SUPERCLASE (PERSONAS)
                    int idPersona = pc.buscarIdPersona(p.getCedula());
                    
                    //MODELO DE LA SUBCLASE
                    Encargado enc = new Encargado();
                    enc.setIdPersona(idPersona);
                    //CONTROLADOR SUBCLASE
                    EncargadoControlador ec = new EncargadoControlador();
                    ec.crearEncargado(idPersona);
                    
                }
                case 3 -> {
                }
                case 4 -> {
                }
                case 5 -> {
                }
                case 6 -> {
                    
                }
                case 7 -> {
                    System.out.println("Saliendo del programa...");
                }
                default -> {
                    System.out.println("Ingrese una opción correcta...");
                }
            }
        }while(opcMain != 7);
    }
        
    }

