/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package unt.herrera.linea_parcial;

/**
 *
 * @author juan
 */
public class Char 
{
    private int dato;
    private Char siguiente;

    public Char(int dato) 
    {
        this.dato = dato;
    }
    
    

    public int getDato() {
        return dato;
    }

    public void setDato(int dato) {
        this.dato = dato;
    }

    public Char getSiguiente() {
        return siguiente;
    }

    public void setSiguiente(Char siguiente) {
        this.siguiente = siguiente;
    }
    
    
}
