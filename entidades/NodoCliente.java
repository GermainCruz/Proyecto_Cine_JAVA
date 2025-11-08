/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package entidades;

/**
 *
 * @author HP
 */
public class NodoCliente {
    private Cliente cliente;  // Información del nodo
    private NodoCliente sgte; // Enlace al siguiente nodo

    public NodoCliente(Cliente cliente) {
        this.cliente = cliente;
        this.sgte = null;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public NodoCliente getSgte() {
        return sgte;
    }

    public void setSgte(NodoCliente sgte) {
        this.sgte = sgte;
    }
}