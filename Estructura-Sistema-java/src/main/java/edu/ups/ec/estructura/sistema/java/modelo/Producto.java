/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package edu.ups.ec.estructura.sistema.java.modelo;

/**
 *
 * @author Usuario
 */
public class Producto<T> {
    private String nombre;
    private T codigo;
    private double precio;
    private int cantidadDisponible;

    public Producto(String nombre, T codigo, double precio, int cantidadDisponible) {
        this.nombre = nombre;
        this.codigo = codigo;
        this.precio = precio;
        this.cantidadDisponible = cantidadDisponible;
    }

    public String getNombre() {
        return nombre;
    }

    public T getCodigo() {
        return codigo;
    }

    public double getPrecio() {
        return precio;
    }

    public int getCantidadDisponible() {
        return cantidadDisponible;
    }

    public void setCantidadDisponible(int cantidadDisponible) {
        this.cantidadDisponible = cantidadDisponible;
    }
}
