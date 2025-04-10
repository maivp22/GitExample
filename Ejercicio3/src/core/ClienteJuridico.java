/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package core;

/**
 *
 * @author mailethv
 */
public class ClienteJuridico extends Cliente{
    private int idRepresentante;
    private String nombreRepresentante;
    private String telefonoRepresentante;

    public ClienteJuridico(int id, String nombre, String direccion, String telefono, String pais, int idRepresentante, String nombreRepresentante, String telefonoRepresentante) {
        super(id, nombre, direccion, telefono, pais);
        this.idRepresentante = idRepresentante;
        this.nombreRepresentante = nombreRepresentante;
        this.telefonoRepresentante = telefonoRepresentante;
    }
    
    //   28255095, "Empresa Uno S.A.S", "Calle 1 # 23-45", "3001234567", "Mexico", 917210, "Juan Perez", "3109876543"));
}
