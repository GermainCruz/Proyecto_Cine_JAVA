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
public class ColaPeliculas {
    private NodoPeliculas primero;
    private NodoPeliculas ultimo;

    public ColaPeliculas() {
        primero = null;
        ultimo = null;
    }

    public void encolar(Pelicula pelicula) {
        NodoPeliculas nuevo = new NodoPeliculas(pelicula);
        if (esVacia()) {
            primero = nuevo;
            ultimo = nuevo;
        } else {
            ultimo.setSgte(nuevo);
            ultimo = nuevo;
        }
    }

    public boolean esVacia() {
        return primero == null;
    }

    public Pelicula desencolar() {
        if (esVacia()) {
            return null;
        }
        Pelicula info = primero.getInfo();
        if (primero == ultimo) {
            primero = null;
            ultimo = null;
        } else {
            primero = primero.getSgte();
        }
        return info;
    }

    public Pelicula frente() {
        return esVacia() ? null : primero.getInfo();
    }

    public int contar() {
        int contador = 0;
        NodoPeliculas actual = primero;
        while (actual != null) {
            contador++;
            actual = actual.getSgte();
        }
        return contador;
    }

    public List<Pelicula> listarPeliculas() {
        List<Pelicula> peliculas = new ArrayList<>();
        NodoPeliculas actual = primero;
        while (actual != null) {
            peliculas.add(actual.getInfo());
            actual = actual.getSgte();
        }
        return peliculas;
    }

    public void mostrar() {
        NodoPeliculas actual = primero;
        while (actual != null) {
            Pelicula pelicula = actual.getInfo();
            System.out.println(pelicula);
            actual = actual.getSgte();
        }
    }
}   

