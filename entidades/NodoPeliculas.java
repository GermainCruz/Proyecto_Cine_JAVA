/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package entidades;

/**
 *
 * @author HP
 */
public class NodoPeliculas {
    private Pelicula info;
    private NodoPeliculas sgte;

    public NodoPeliculas(Pelicula info) {
        this.info = info;
        this.sgte = null;
    }

    public NodoPeliculas(Pelicula info, NodoPeliculas sgte) {
        this.info = info;
        this.sgte = sgte;
    }

    public Pelicula getInfo() {
        return info;
    }

    public void setInfo(Pelicula info) {
        this.info = info;
    }

    public NodoPeliculas getSgte() {
        return sgte;
    }

    public void setSgte(NodoPeliculas sgte) {
        this.sgte = sgte;
    }
}
