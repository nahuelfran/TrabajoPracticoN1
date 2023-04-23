/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sistemabancariotp1.newpackage;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Nahuel
 */
public class Cliente {
    private String nombre;
    private String direccion;
    private List<Cuenta> cuentas;
    
    public Cliente(String nombre, String direccion) {
        this.nombre = nombre;
        this.direccion = direccion;
        this.cuentas = new ArrayList<Cuenta>();
    }
    
    public String getNombre() {
        return nombre;
    }
    
    public String getDireccion() {
        return direccion;
    }
    
    public List<Cuenta> getCuentas() {
        return cuentas;
    }
    
    public void agregarCuenta(Cuenta cuenta) {
        cuentas.add(cuenta);
    }
    
    public void eliminarCuenta(Cuenta cuenta) {
        cuentas.remove(cuenta);
    }
}
