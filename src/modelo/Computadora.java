/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

/**
 *
 * @author Alejandro
 */
public class Computadora {
    
    private int idComputadora;
    private String ram;
    private String procesador;
    private String marca;
    private String placaMadre;
    private int capacidadDisco;
    private boolean mouse;
    private boolean teclado;
    private boolean monitor;
    private String estado;

    public Computadora(int idComputadora, String ram, String procesador, String marca, String placaMadre, int capacidadDisco, boolean mouse, boolean teclado, boolean monitor, String estado) {
        this.idComputadora = idComputadora;
        this.ram = ram;
        this.procesador = procesador;
        this.marca = marca;
        this.placaMadre = placaMadre;
        this.capacidadDisco = capacidadDisco;
        this.mouse = mouse;
        this.teclado = teclado;
        this.monitor = monitor;
        this.estado = estado;
    }

    public int getIdComputadora() {
        return idComputadora;
    }

    public void setIdComputadora(int idComputadora) {
        this.idComputadora = idComputadora;
    }

    public String getRam() {
        return ram;
    }

    public void setRam(String ram) {
        this.ram = ram;
    }

    public String getProcesador() {
        return procesador;
    }

    public void setProcesador(String procesador) {
        this.procesador = procesador;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getPlacaMadre() {
        return placaMadre;
    }

    public void setPlacaMadre(String placaMadre) {
        this.placaMadre = placaMadre;
    }

    public int getCapacidadDisco() {
        return capacidadDisco;
    }

    public void setCapacidadDisco(int capacidadDisco) {
        this.capacidadDisco = capacidadDisco;
    }

    public boolean isMouse() {
        return mouse;
    }

    public void setMouse(boolean mouse) {
        this.mouse = mouse;
    }

    public boolean isTeclado() {
        return teclado;
    }

    public void setTeclado(boolean teclado) {
        this.teclado = teclado;
    }

    public boolean isMonitor() {
        return monitor;
    }

    public void setMonitor(boolean monitor) {
        this.monitor = monitor;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }
    

                
                
    }

