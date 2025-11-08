/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package entidades;

/**
 *
 * @author Harry
 */
public class Butaca {
    private boolean disponible; // true = disponible, false = ocupada

    public Butaca() {
        this.disponible = true; // Por defecto, está disponible
    }

    public boolean isDisponible() {
        return disponible;
    }

    public void ocupar() {
        this.disponible = false;
    }
    
    public void desocupar(){
        disponible=true;
    }

    public void liberar() {
        this.disponible = true;
    }
}
