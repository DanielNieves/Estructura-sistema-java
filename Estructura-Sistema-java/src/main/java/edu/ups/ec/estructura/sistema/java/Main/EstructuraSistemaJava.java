/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package edu.ups.ec.estructura.sistema.java.Main;

import edu.ups.ec.estructura.sistema.java.controlador.TiendaControlador;
import edu.ups.ec.estructura.sistema.java.modelo.InventarioModelo;
import edu.ups.ec.estructura.sistema.java.modelo.VentaModel;
import edu.ups.ec.estructura.sistema.java.vista.TiendaVista;

/**
 *
 * @author Usuario
 */
public class EstructuraSistemaJava {

   
    public static void main(String[] args) {
     

        InventarioModelo<String> inventarioModel = new InventarioModelo<>();
        VentaModel<String> ventaModel = new VentaModel<>();
        TiendaVista tiendaView = new TiendaVista();
        TiendaControlador<String> tiendaController = new TiendaControlador<>(inventarioModel, ventaModel, tiendaView);
        tiendaController.iniciar();
    }
}
