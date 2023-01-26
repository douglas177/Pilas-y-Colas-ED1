/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Negocio;

/**
 *
 * @author Usuario
 */
public class Practica {

    ColaL Cola;
    PilaLista Pila;
    int CantC;
    int CantP;
            

    public Practica(PilaLista P, ColaL C) {
        this.Cola = C;
        this.Pila = P;
        this.CantC = Cola.Cant;
        this.CantP = Pila.cant;
    }

    public void InvertirPC() {

        int PrimerPila = 0;
        int UltimoPila = 0;
        int PrimerCola = 0;
        int UltimoCola = 0;
        int c = 0;
        PrimerPila = Pila.Pop();
        //System.out.println(PrimerPila);
        while (!Pila.Vacia()) {
            Cola.Encolar(Pila.Pop());
            if (Pila.cant == 1) {
                UltimoPila = Pila.Get();
                Pila.Pop();
            }
            c++;
        }
        //System.out.println(UltimoPila);

        //Pila.Push(PrimerPila);
        PrimerCola = Cola.Decolar();
        //System.out.println(PrimerCola);
        while (c > 0) {
            Pila.Push(Cola.Decolar());
            if (c == 1) {
                UltimoCola = Cola.Get();
                Cola.Decolar();
                c--;
            }
            c--;
        }
        c = 0;
        //System.out.println(UltimoCola);
        while (!Pila.Vacia()) {
            Cola.Encolar(Pila.Pop());
            c++;
        }
        while (c > 0) {
            Pila.Push(Cola.Decolar());
            c--;
        }
        while (!Pila.Vacia()) {
            Cola.Encolar(Pila.Pop());
            c++;
        }
        while (c > 0) {
            Pila.Push(Cola.Decolar());
            c--;
        }
        Cola.Encolar(UltimoCola);
        while (!Pila.Vacia()) {
            Cola.Encolar(Pila.Pop());
            c++;
        }
        Cola.Encolar(PrimerCola);
        Pila.Push(PrimerPila);
        while (c > 0) {
            Pila.Push(Cola.Decolar());
            c--;
        }
        Pila.Push(UltimoPila);
        
    }
    public void InvertirPilaMayor(){
         int PrimerPila = 0;
        int UltimoPila = 0;
        int PrimerCola = 0;
        int UltimoCola = 0;
        int c = 0;
        int p = 0;
        PrimerPila = Pila.Pop();
        //System.out.println(PrimerPila);
        while (!Pila.Vacia()) {
            UltimoPila = Pila.Pop();
            if (!Pila.Vacia()) {
                Cola.Encolar(UltimoPila);
                //Cola.Encolar(PrimerPila);
                p++;
            }
        }
        System.out.println(PrimerPila);
        System.out.println(UltimoPila);
        //System.out.println(p);
        //System.out.println(UltimoPila);

        PrimerCola = Cola.Decolar();
        while (CantC-p >= c) {

            Pila.Push(Cola.Decolar());
            c++;
        }  
        c--;
        UltimoCola = Pila.Pop();
        System.out.println(PrimerCola);
        System.out.println(UltimoCola);
        //System.out.println(c);
        while (!Pila.Vacia()) {
            Cola.Encolar(Pila.Pop());
            c++;
        }
        while (p> 0) {
            Pila.Push(Cola.Decolar());
            p--;
        }
        Cola.Encolar(PrimerPila);
        while (!Pila.Vacia()) {
            Cola.Encolar(Pila.Pop());
            c++;
        }

        Cola.Encolar(UltimoPila);
        Pila.Push(PrimerCola);
        while (CantC-2> p) {
            Pila.Push(Cola.Decolar());
            p++;
        }
        Pila.Push(UltimoCola);
        c = 0;
        while (!Pila.Vacia()) {
            Cola.Encolar(Pila.Pop());
            c++;
        }
        p  = 0;
        while (CantP>p) {
            Pila.Push(Cola.Decolar());
            p++;
        }
    }
    public void invertirColaMayor() {
        int PrimerPila = 0;
        int UltimoPila = 0;
        int PrimerCola = 0;
        int UltimoCola = 0;
        int c = 0;
        int p = 0;
        PrimerPila = Pila.Pop();
        //System.out.println(PrimerPila);
        while (!Pila.Vacia()) {
            UltimoPila = Pila.Pop();
            if (!Pila.Vacia()) {
                Cola.Encolar(UltimoPila);
                //Cola.Encolar(PrimerPila);
                p++;
            }
        }
        System.out.println(CantC);
        System.out.println(CantP);
        //System.out.println(p);
        //System.out.println(UltimoPila);

        PrimerCola = Cola.Decolar();
        while (CantC-p >= c) {

            Pila.Push(Cola.Decolar());
            c++;
        }  
        c--;
        UltimoCola = Pila.Pop();
        //System.out.println(PrimerCola);
        //System.out.println(UltimoCola);
        //System.out.println(c);
        while (!Pila.Vacia()) {
            Cola.Encolar(Pila.Pop());
            c++;
        }
        while (p> 0) {
            Pila.Push(Cola.Decolar());
            p--;
        }
        Cola.Encolar(PrimerPila);
        while (!Pila.Vacia()) {
            Cola.Encolar(Pila.Pop());
            c++;
        }

        Cola.Encolar(UltimoPila);
        Pila.Push(PrimerCola);
        while (CantC-2> p) {
            Pila.Push(Cola.Decolar());
            p++;
        }
        Pila.Push(UltimoCola);
        c = 0;
        while (!Pila.Vacia()) {
            Cola.Encolar(Pila.Pop());
            c++;
        }
        p  = 0;
        while (CantP>p) {
            Pila.Push(Cola.Decolar());
            p++;
        }
    }

    public ColaL getCola() {
        return Cola;
    }

    public PilaLista getPila() {
        return Pila;
    }

    public static void main(String[] args) {
        ColaL A = new ColaL();
        //A.Encolar(-1);
       //A.Encolar(0);
        A.Encolar(1);
        A.Encolar(2);
        A.Encolar(3);
        A.Encolar(4);
        A.Encolar(5);
        
        PilaLista B = new PilaLista();
        B.Push(5);
        B.Push(6);
        B.Push(7);
        B.Push(8);
        B.Push(9);
        Practica obj = new Practica(B, A);
        //obj.InvertirPC();
        /*System.out.println("");
        System.out.println("");
        System.out.println(A.toString());
        System.out.println();
        System.out.println(B.toString());
        System.out.println("");
        System.out.println("");*/
        //obj.InvertirPilaMayor();
        //obj.invertirColaMayor();
        obj.InvertirPC();
        System.out.println("");
        System.out.println("");
        System.out.println(A.toString());
        System.out.println();
        System.out.println(B.toString());
    }
}
