/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sistemabancariotp1.newpackage;

/**
 *
 * @author Nahuel
 */
public class CuentaInversiones extends Cuenta {
    private int acciones;
    private CompraDeAcciones compraDeAcciones;
    
    public CuentaInversiones(float saldo, String tipo, int acciones) {
        super(saldo, tipo);
        this.acciones = acciones;
    }
    
    public int getAcciones() {
        return acciones;
    }
    
    public void setAcciones(int acciones) {
        this.acciones = acciones;
    }
    
    public CompraDeAcciones getCompraDeAcciones() {
        return compraDeAcciones;
    }
    
    public void setCompraDeAcciones(CompraDeAcciones compraDeAcciones) {
        this.compraDeAcciones = compraDeAcciones;
    }
}


