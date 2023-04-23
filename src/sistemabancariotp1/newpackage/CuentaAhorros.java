/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sistemabancariotp1.newpackage;

/**
 *
 * @author Nahuel
 */
public class CuentaAhorros extends Cuenta {
    private float tasaInteres;
    
    public CuentaAhorros(float saldo, String tipo, float tasaInteres) {
        super(saldo, tipo);
        this.tasaInteres = tasaInteres;
    }
    
    public float getTasaInteres() {
        return tasaInteres;
    }
    
    public void setTasaInteres(float tasaInteres) {
        this.tasaInteres = tasaInteres;
    }
}
