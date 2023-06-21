/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package edu.ups.ec.estructura.sistema.java.modelo;

/**
 *
 * @author Usuario
 */
import java.util.LinkedList;
import java.util.List;

public class InventarioModelo<T> {
    private LinkedList<Producto<T>> inventario;

    public InventarioModelo() {
        inventario = new LinkedList<>();
    }

    public void agregarProducto(Producto<T> producto) {
        inventario.add(producto);
    }

    public void actualizarCantidadProducto(T codigo, int cantidad) {
        for (Producto<T> producto : inventario) {
            if (producto.getCodigo().equals(codigo)) {
                producto.setCantidadDisponible(cantidad);
                break;
            }
        }
    }

    public List<Producto<T>> obtenerInventario() {
        return inventario;
    }
}
