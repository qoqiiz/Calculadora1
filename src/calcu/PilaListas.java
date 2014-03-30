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
public class PilaListas<T> {
    
   private Lista<T> lista = new Lista<T>();
   
   public void push(T dato){
       lista.insertaInicio(dato);       
   }
   
   public T pop() throws Exception{
       try {
           return lista.obtenPrimerElemento();
       } catch (Exception ex) {
           throw new Exception("No hay nada en la pila");
       }
   }
   
    public T peek() throws Exception{
       try {
           return lista.obtenPrimerElementoSinEliminar();
       } catch (Exception ex) {
           throw new Exception("La pila está vacía");
       }
   }
    
    public boolean vacia(){
        return lista.getInicio()==null;
    }
    
}
