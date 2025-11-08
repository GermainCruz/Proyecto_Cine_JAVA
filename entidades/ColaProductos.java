/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package entidades;

import java.util.ArrayList;
import java.util.List;
/**
 *
 * @author HP
 */
public class ColaProductos {
    private NodoProductos primero;
    private NodoProductos ultimo;

    // Constructor
    public ColaProductos() {
        primero = null;
        ultimo = null;
    }

    // Agregar producto al final de la cola
    public void encolar(Producto producto) {
        NodoProductos nuevo = new NodoProductos(producto);
        if (esVacia()) {
            primero = nuevo;
            ultimo = nuevo;
        } else {
            ultimo.setSgte(nuevo);
            ultimo = nuevo;
        }
    }

    // Verificar si la cola está vacía
    public boolean esVacia() {
        return primero == null;
    }

    // Eliminar y devolver producto del frente de la cola
    public Producto desencolar() {
        if (esVacia()) {
            return null;
        }
        Producto info = primero.getInfo();
        if (primero == ultimo) {
            primero = null;
            ultimo = null;
        } else {
            primero = primero.getSgte();
        }
        return info;
    }

    // Ver producto al frente de la cola sin eliminarlo
    public Producto frente() {
        return esVacia() ? null : primero.getInfo();
    }

    // Contar cuántos productos hay en la cola
    public int contar() {
        int contador = 0;
        NodoProductos actual = primero;
        while (actual != null) {
            contador++;
            actual = actual.getSgte();
        }
        return contador;
    }

    // Listar productos como una lista
    public List<Producto> listarProductos() {
        List<Producto> productos = new ArrayList<>();
        NodoProductos actual = primero;
        while (actual != null) {
            productos.add(actual.getInfo());
            actual = actual.getSgte();
        }
        return productos;
    }

    // Mostrar todos los productos en la consola
    public void mostrar() {
        NodoProductos actual = primero;
        while (actual != null) {
            Producto producto = actual.getInfo();
            System.out.println("ID: " + producto.getIdProducto() +
                    ", Tipo: " + producto.getTipoProducto() +
                    ", Nombre: " + producto.getNombreProducto() +
                    ", Precio: " + producto.getPrecioProducto());
            actual = actual.getSgte();
        }
    }
}
