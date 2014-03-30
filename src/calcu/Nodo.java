/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package calcu;

/**
 *
 * @author Coqiz
 */
public class Nodo<T> {
    
    /**
     * Constructor que acepta un dato como parámetro
     * @param dato 
     */
    Nodo(T dato){
      this.info = dato;
      this.liga = null;
    }
    
    /**
     * Constructor por default
     */
     Nodo(){
      
    }
    
    
    /**
     * Este es el inicio de la lista
     */
    private T info;
    private Nodo<T> liga;

    /**
     * @return the info
     */
    public T getInfo() {
        return info;
    }

    /**
     * @param info the info to set
     */
    public void setInfo(T info) {
        this.info = info;
    }

    /**
     * @return the liga
     */
    public Nodo<T> getLiga() {
        return liga;
    }

    /**
     * @param liga the liga to set
     */
    public void setLiga(Nodo<T> liga) {
        this.liga = liga;
    }
    
    
   
    
}
