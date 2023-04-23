/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sistemabancariotp1.newpackage;

/**
 *
 * @author Nahuel
 */
public class Cuenta {
    private float saldo;
    private String tipo;
    
    public Cuenta(float saldo, String tipo) {
        this.saldo = saldo;
        this.tipo = tipo;
    }
    
    public float getSaldo() {
        return saldo;
    }
    
    public void setSaldo(float saldo) {
        this.saldo = saldo;
    }
    
    public String getTipo() {
        return tipo;
    }
    
    public void setTipo(String tipo) {
        this.tipo = tipo;
    }
}
