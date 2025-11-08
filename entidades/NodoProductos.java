/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package entidades;

/**
 *
 * @author HP
 */
public class NodoProductos {
    private Producto info;
    private NodoProductos sgte;

    // Constructor con información del producto
    public NodoProductos(Producto info) {
        this.info = info;
        this.sgte = null;
    }

    // Constructor con producto y enlace al siguiente nodo
    public NodoProductos(Producto info, NodoProductos sgte) {
        this.info = info;
        this.sgte = sgte;
    }

    // Getter y Setter
    public Producto getInfo() {
        return info;
    }

    public void setInfo(Producto info) {
        this.info = info;
    }

    public NodoProductos getSgte() {
        return sgte;
    }

    public void setSgte(NodoProductos sgte) {
        this.sgte = sgte;
    }
}
