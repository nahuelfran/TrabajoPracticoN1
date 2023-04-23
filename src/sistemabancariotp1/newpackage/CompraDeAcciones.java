/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sistemabancariotp1.newpackage;

/**
 *
 * @author Nahuel
 */

public class CompraDeAcciones {
    private float precio;
    private float comisiones;
    
    public CompraDeAcciones(float precio, float comisiones) {
        this.precio = precio;
        this.comisiones = comisiones;
    }
    
    public float getPrecio() {
        return precio;
    }
    
    public void setPrecio(float precio) {
        this.precio = precio;
    }
    
    public float getComisiones() {
        return comisiones;
    }
    
    public void setComisiones(float comisiones) {
        this.comisiones = comisiones;
    }
}