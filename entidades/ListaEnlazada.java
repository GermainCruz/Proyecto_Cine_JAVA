/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package entidades;

import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Harry
 */
public class ListaEnlazada {
    private NodoVenta L;

    public ListaEnlazada() {
        this.L = null;
    }

    public void insertarInicio(Venta venta) {
        NodoVenta nuevo = new NodoVenta(venta);
        nuevo.setSgte(L);
        L = nuevo;
    }

    public Venta buscar(int idVenta) {
        NodoVenta p = L;
        while (p != null) {
            if (p.getVenta().getIdVenta() == idVenta) {
                return p.getVenta();
            }
            p = p.getSgte();
        }
        return null;
    }

    public boolean eliminar(int idVenta) {
        if (L == null) {
            return false;
        }

        if (L.getVenta().getIdVenta() == idVenta) {
            L = L.getSgte();
            return true;
        }

        NodoVenta ante = L;
        NodoVenta p = L.getSgte();
        while (p != null) {
            if (p.getVenta().getIdVenta() == idVenta) {
                ante.setSgte(p.getSgte());
                return true;
            }
            ante = p;
            p = p.getSgte();
        }
        return false;
    }

    public void mostrar(DefaultTableModel modelo) {
        modelo.setRowCount(0);
        NodoVenta p = L;
        while (p != null) {
            Venta v = p.getVenta();
            Object[] row = {v.getIdVenta(), v.getIdCliente(), v.getMetodoPago(), v.getTotalVenta(), 
                    v.getFechaHora(),
                    v.getTipoDocumento(), v.getNumeroDocumento(), v.getNumeroTarjeta(),
                    v.getFechaVencimiento(), v.getCvv(), v.getNumeroCelular()};
            modelo.addRow(row);
            p = p.getSgte();
        }
    }
}
