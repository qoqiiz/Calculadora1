/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Main;

/**
 *
 * @author Coqiz
 */
import calcu.PilaArreglos;
import calcu.PilaListas;
import java.util.logging.Level;
import java.util.logging.Logger;


public class Pilas {

    public static void main(String[] args) {
        Pruebapilas();
       
    }
    
    public static void Pruebapilas(){
        try {
            PilaListas<Integer> pila = new PilaListas<>();
            pila.push(1);
            pila.push(2);
            pila.push(3);
            System.out.println(pila.pop());
            System.out.println(pila.pop());
            System.out.println(pila.pop());
        } catch (Exception ex) {
            Logger.getLogger(Pilas.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public static void pilaArreglo(){
     
        PilaArreglos<Integer> pilaArreglo = new PilaArreglos<>();
        try {
            pilaArreglo.push(10);
            pilaArreglo.push(12);
            System.out.println("Elemento:"+pilaArreglo.pop());
            System.out.println("Elemento:"+pilaArreglo.pop());
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
            
        }
        
    }
    
}
