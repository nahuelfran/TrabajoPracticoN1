/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package sistemabancariotp1;


import sistemabancariotp1.newpackage.Cliente;
import sistemabancariotp1.newpackage.CompraDeAcciones;
import sistemabancariotp1.newpackage.CuentaAhorros;
import sistemabancariotp1.newpackage.CuentaInversiones;

/**
 *
 * @author Nahuel
 */
public class SistemaBancarioTP1 {
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Crear un cliente
        Cliente cliente1 = new Cliente("Mirtha", "Calle 123");
        //ceunta de ahorro
        CuentaAhorros cuentaAhorros = new CuentaAhorros(1000, "Ahorros", 0.02f);
        cliente1.agregarCuenta(cuentaAhorros);
        
        System.out.println("Cliente: " + cliente1.getNombre());
        System.out.println("Saldo de cuenta de ahorros: " + cuentaAhorros.getSaldo());
         
        //inversion
         CompraDeAcciones compraDeAcciones = new CompraDeAcciones(50.0f, 5.0f);
         CuentaInversiones cuentaInversiones = new CuentaInversiones(1000.0f, "Inversiones", 10);
         cuentaInversiones.setCompraDeAcciones(compraDeAcciones);
         cliente1.agregarCuenta(cuentaInversiones);
         System.out.println("Datos de la cuenta de inversión:");
         System.out.println("Saldo: " + cuentaInversiones.getSaldo());
         System.out.println("Tipo: " + cuentaInversiones.getTipo());
         System.out.println("Acciones: " + cuentaInversiones.getAcciones());
         System.out.println("Precio de compra de acciones: " + cuentaInversiones.getCompraDeAcciones().getPrecio());
         System.out.println("Comisiones de compra de acciones: " + cuentaInversiones.getCompraDeAcciones().getComisiones());
    }
    
}
