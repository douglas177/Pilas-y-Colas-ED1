/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Negocio;

/**
 *
 * @author Estudiante
 */
public class NodoPila { 
    int Data;
    NodoPila Enlace;
    
    public NodoPila()
    {
        this.Enlace = null;
    }
    public NodoPila(int data){
        this.Enlace = null;
        this.Data = data;
    }

    public void setData(int Data) {
        this.Data = Data;
    }

    public void setEnlace(NodoPila Enlace) {
        this.Enlace = Enlace;
    }

    public int getData() {
        return Data;
    }

    public NodoPila getEnlace() {
        return Enlace;
    }

    @Override
    public String toString() {
        String S ="L => ";
        S = S+ Data +" ->";
        return S;
    }
    
}
