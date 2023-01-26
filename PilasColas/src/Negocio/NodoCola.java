/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Negocio;

/**
 *
 * @author Douglas
 */
public class NodoCola {   int Dato;
                      NodoCola Enlace;

    public NodoCola() {
        this.Enlace=null;
    }
                 
    public NodoCola(int Dato, NodoCola Enlace) {
        this.Dato = Dato;
        this.Enlace = Enlace;
    }

    public void setDato(int Dato) {
        this.Dato = Dato;
    }

    public void setEnlace(NodoCola Enlace) {
        this.Enlace = Enlace;
    }

    public int getDato() {
        return Dato;
    }

    public NodoCola getEnlace() {
        return Enlace;
    }

    @Override
    public String toString() {
        return (Dato+ "->");
    }
                      
                      
                      
                      
}
