/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package entidades;

/**
 *
 * @author Harry
 */
class NodoVenta {
    private NodoVenta sgte;
    private Venta venta;

    public NodoVenta(Venta venta) {
        this.venta = venta;
        this.sgte = null;
    }

    public NodoVenta getSgte() {
        return sgte;
    }

    public void setSgte(NodoVenta sgte) {
        this.sgte = sgte;
    }

    public Venta getVenta() {
        return venta;
    }

    public void setVenta(Venta venta) {
        this.venta = venta;
    }
}
