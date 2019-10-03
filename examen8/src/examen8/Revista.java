/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package examen8;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author capacitacion12
 */
public class Revista {
    private List<Articulo> elementos;
    private String titulo;
    private int ejemplar;

    public Revista(String titulo, int ejemplar) {
        this.titulo = titulo;
        this.ejemplar = ejemplar;
        elementos = new ArrayList<Articulo>();
        
    }

    public List<Articulo> getElementos() {
        return elementos;
    }

    public void setElementos(List<Articulo> elementos) {
        this.elementos = elementos;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public int getEjemplar() {
        return ejemplar;
    }

    public void setEjemplar(int ejemplar) {
        this.ejemplar = ejemplar;
    }
    
    public boolean addElemento(Articulo articulo){
        return elementos.add(articulo);
    }
    public Articulo getArticuloEnPosicion(int posicion){
        if (posicion<= elementos.size() || posicion>0){
            return elementos.get(posicion);
        }
        return null;
    }
}
