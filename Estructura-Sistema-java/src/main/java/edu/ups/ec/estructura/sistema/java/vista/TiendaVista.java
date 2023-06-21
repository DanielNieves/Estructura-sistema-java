/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package edu.ups.ec.estructura.sistema.java.vista;

import edu.ups.ec.estructura.sistema.java.modelo.Producto;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class TiendaVista<T> {
    public void mostrarMenu() {
        System.out.println("==== Menú ====");
        System.out.println("1. Agregar producto al inventario");
        System.out.println("2. Realizar venta");
        System.out.println("3. Consultar inventario");
        System.out.println("4. Salir");
        System.out.print("Ingrese una opción: ");
    }

    public Producto<T> solicitarDatosProducto() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese el nombre del producto: ");
        String nombre = scanner.nextLine();
        System.out.print("Ingrese el código del producto: ");
        T codigo = (T) scanner.next();
        System.out.print("Ingrese el precio del producto: ");
        double precio = scanner.nextDouble();
        System.out.print("Ingrese la cantidad disponible del producto: ");
        int cantidad = scanner.nextInt();
        return new Producto<>(nombre, codigo, precio, cantidad);
    }

    public T solicitarCodigoProducto() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese el código del producto: ");
        return (T) scanner.next();
    }

    public int solicitarCantidadVenta() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese la cantidad a vender: ");
        return scanner.nextInt();
    }

    public void mostrarInventario(List<Producto<T>> inventario) {
        System.out.println("==== Inventario ====");
        for (Producto<T> producto : inventario) {
            System.out.println("Nombre: " + producto.getNombre());
            System.out.println("Código: " + producto.getCodigo());
            System.out.println("Precio: " + producto.getPrecio());
            System.out.println("Cantidad disponible: " + producto.getCantidadDisponible());
            System.out.println("-------------------");
        }
    }

    public void mostrarMensaje(String mensaje) {
        System.out.println(mensaje);
    }
}
