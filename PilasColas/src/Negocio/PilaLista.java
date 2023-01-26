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
public class PilaLista {

    NodoPila Cima;
    int cant;

    public PilaLista() {
        Cima = null;
        cant = 0;
    }

    public void Push(int elemento) {
        NodoPila P = new NodoPila();
        P.setData(elemento);
        P.setEnlace(Cima);
        Cima = P;
        cant++;
    }

    public boolean Vacia() {
        return Cima == null;
    }

    public int Pop() {
        int x = Cima.getData();
        Cima = Cima.getEnlace();
        cant--;
        return x;
    }
    public int Get(){
        return Cima.getData();
    }

    public int getCant() {
        return cant;
    }

    @Override
    public String toString() {
        NodoPila Aux = Cima;
        String S = "";
        for (int i = 1; i <= cant; i++) {
            if(Cima != null){
            S = S + Aux.getData() +"\n";
            Aux = Aux.getEnlace();
            }
        }
        S = S + "P";
        return S;
    }

    
}
