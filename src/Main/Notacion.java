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
import  calcu.PilaListas;
import calcu.Operadores;
import java.util.StringTokenizer;
import java.util.logging.Level;
import java.util.logging.Logger;


public class Notacion {

    public ColaLista<String> convertirPostfija(String infija) throws Exception {
        ColaLista<String> colaPostfija = new ColaLista<>();
        PilaListas<String> pila = new PilaListas<>();
       
        for (char cLetra :  infija.toCharArray()) {
            String letra = String.valueOf(cLetra);
            if (letra.equals("(")) {
                pila.push(letra);
            } else {
                if (letra.equals(")")) {
                    while (!pila.peek().equals("(")) {
                        colaPostfija.push(pila.pop());
                    }
                    pila.pop();
                } else {
                    if (Operadores.isOperando(letra)) {
                        colaPostfija.push(letra);
                    } else {
                        while (!pila.vacia() && Operadores.lessOrEqualThan(letra, pila.peek()) && !pila.peek().equals("(")) {
                            colaPostfija.push(pila.pop());
                        }
                        pila.push(letra);
                    }
                }
            }
        }
        while (!pila.vacia()) {
            colaPostfija.push(pila.pop());
        }

        return colaPostfija;
    }

    public static void main(String[] args) {
        Notacion notaciones = new Notacion();
        try {
            System.out.println(notaciones.convertirPostfija("(1+2)^7/4+(7-2)"));
        } catch (Exception ex) {
            Logger.getLogger(Notacion.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

}
