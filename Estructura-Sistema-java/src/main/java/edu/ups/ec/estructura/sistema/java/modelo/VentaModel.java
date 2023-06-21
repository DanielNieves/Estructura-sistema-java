/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package edu.ups.ec.estructura.sistema.java.modelo;

/**
 *
 * @author Usuario
 */
import java.util.Stack;

public class VentaModel<T> {
    private Stack<String> historialVentas;

    public VentaModel() {
        historialVentas = new Stack<>();
    }

    public void registrarVenta(String registro) {
        historialVentas.push(registro);
    }

    public String obtenerUltimaVenta() {
        if (!historialVentas.isEmpty()) {
            return historialVentas.peek();
        }
        return null;
    }
}

