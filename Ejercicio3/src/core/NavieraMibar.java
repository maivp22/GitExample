/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package core;

import java.util.ArrayList;

/**
 *
 * @author mailethv
 */
public class NavieraMibar {
    private ArrayList<Barco> barcos;
    private ArrayList<Cliente> clientes;
    private ArrayList<Ruta> rutas;
    private ArrayList<Viaje> viajes;
    
    
    public boolean addCliente(Cliente cliente){
        if (!this.clientes.contains(cliente)){
            this.clientes.add(cliente);
            return true;
        }
        return false;
    }

    public boolean addBarco(Barco barco) {
        if (!this.barcos.contains(barco)){
            this.barcos.add(barco);
            return true;
        }
        return false;
    }


}
