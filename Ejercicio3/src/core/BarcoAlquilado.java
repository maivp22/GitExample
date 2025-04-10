/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package core;
import java.time.LocalDate;
/**
 *
 * @author mailethv
 */
public class BarcoAlquilado extends Barco {
    private String empresa;
    private LocalDate fechaInicio;
    private LocalDate fechaFin;

    public BarcoAlquilado(String empresa, int matricula, String nombre, boolean bandera, String capitan) {
        super(matricula, nombre, bandera, capitan);
        this.empresa = empresa;
    }
    
    
    
}
