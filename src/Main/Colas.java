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

import calcu.ColaLista;
import java.util.logging.Level;
import java.util.logging.Logger;


public class Colas {
    
    public static void main(String[] args){
        try {
            ColaLista<Integer> cola = new ColaLista<>();
            cola.push(1);
            cola.push(2);
            cola.push(3);
            System.out.println(cola.pop());
            System.out.println(cola.pop());
            System.out.println(cola.pop());
        } catch (Exception ex) {
            Logger.getLogger(Colas.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
}

    

