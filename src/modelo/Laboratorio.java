/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

import java.util.ArrayList;

/**
 *
 * @author Alejandro
 */
public class Laboratorio {
    
    private int idLaboratorio;
    private String nombre;
    private String edificio;
    private int numComputadoras;
    private Encargado encargado;

    public Laboratorio(int idLaboratorio, String nombre, String edificio, int numComputadoras, Encargado encargado) {
        this.idLaboratorio = idLaboratorio;
        this.nombre = nombre;
        this.edificio = edificio;
        this.numComputadoras = numComputadoras;
        this.encargado = encargado;
    }

    public int getIdLaboratorio() {
        return idLaboratorio;
    }

    public void setIdLaboratorio(int idLaboratorio) {
        this.idLaboratorio = idLaboratorio;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getEdificio() {
        return edificio;
    }

    public void setEdificio(String edificio) {
        this.edificio = edificio;
    }

    public int getNumComputadoras() {
        return numComputadoras;
    }

    public void setNumComputadoras(int numComputadoras) {
        this.numComputadoras = numComputadoras;
    }

    public Encargado getEncargado() {
        return encargado;
    }

    public void setEncargado(Encargado encargado) {
        this.encargado = encargado;
    }
}
