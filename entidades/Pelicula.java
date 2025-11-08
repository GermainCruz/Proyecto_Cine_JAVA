/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package entidades;

/**
 *
 * @author Harry
 */
public class Pelicula {
    private String titulo;
    private String genero;
    private String censura;
    private String linkImagen;
    private String director;
    private String idioma;
    private String disponible;
    private String descripcion;
    private String duracion;

    public Pelicula(String titulo, String genero, String censura, String linkImagen, String director, String idioma, String disponible, String descripcion, String duracion) {
        this.titulo = titulo;
        this.genero = genero;
        this.censura = censura;
        this.linkImagen = linkImagen;
        this.director = director;
        this.idioma = idioma;
        this.disponible = disponible;
        this.descripcion = descripcion;
        this.duracion = duracion;
    }

    public Pelicula(String titulo, String linkImagen) {
        this.titulo = titulo;
        this.linkImagen = linkImagen;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public String getCensura() {
        return censura;
    }

    public void setCensura(String censura) {
        this.censura = censura;
    }

    public String getLinkImagen() {
        return linkImagen;
    }

    public void setLinkImagen(String linkImagen) {
        this.linkImagen = linkImagen;
    }

    public String getDirector() {
        return director;
    }

    public void setDirector(String director) {
        this.director = director;
    }

    public String getIdioma() {
        return idioma;
    }

    public void setIdioma(String idioma) {
        this.idioma = idioma;
    }

    public String getDisponible() {
        return disponible;
    }

    public void setDisponible(String disponible) {
        this.disponible = disponible;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getDuracion() {
        return duracion;
    }

    public void setDuracion(String duracion) {
        this.duracion = duracion;
    }

    

    
    
}
