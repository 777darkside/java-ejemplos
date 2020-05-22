/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clases;

import javax.swing.JOptionPane;

/**
 *
 * @author David
 */
public class ListaDoble<T> {
    private NodoDoble<String> inicio;
    private NodoDoble<String> fin;
    
    public ListaDoble() {
        inicio = null;
        fin = null;
    }
    
    public boolean estaVacio() {
        return (inicio==null);
    }
    
    public void agregarFinal(T dato) {
        if (!estaVacio()) {
            fin = new NodoDoble(dato, null, fin);
            fin.anterior.siguiente = fin;
        } else {
            inicio = fin = new NodoDoble(dato, null, null);
        }
    }
    
    public void eliminarFinal() {
        if (!estaVacio()) {
            this.fin = this.fin.getAnterior();
            if (this.fin != null) {
                this.fin.setSiguiente(null);
            } else {
                this.inicio = null;
            }
        }
    }
    
    public void agregarInicio(T dato) {
        if (!estaVacio()) {
            inicio = new NodoDoble(dato, inicio, null);
            inicio.siguiente.anterior = inicio;
        } else {
            inicio = fin = new NodoDoble(dato, null, null);
        }
    }
    
    public void eliminarInicio() {
        if (!estaVacio()) {
            this.inicio = this.inicio.getSiguiente();
            if (this.inicio != null) {
                this.inicio.setAnterior(null);
            } else {
                this.fin = null;
            }
        }
    }
    
    public String mostrarListaInicioFin() {
        String str = "";
        if (!estaVacio()) {
            NodoDoble<String> aux = inicio;
            while(aux != null) {
                str = str + "[" + aux.dato + "] ";
                aux = aux.siguiente;
            }
            
        }
        return str;
    }
    
    public void mostrarListaFinInicio() {
        if (!estaVacio()) {
            String datos = "<=>";
            NodoDoble<String> aux = fin;
            while(aux != null) {
                datos = datos + "[" + aux.dato + "]<=>";
                aux = aux.anterior;
            }
            
            JOptionPane.showMessageDialog(null, datos, "mostrando", JOptionPane.INFORMATION_MESSAGE);
        }    
    }
}
