/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package core;

import java.time.LocalDate;
import java.util.ArrayList;

/**
 *
 * @author mailethv
 */
public class Viaje {
    private int id;
    private Barco barco;
    private Ruta ruta;
    private LocalDate fechaInicio;
    private LocalDate fechaFin;
    private ArrayList<Carga> cargas;
}
