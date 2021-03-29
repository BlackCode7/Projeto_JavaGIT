/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package prova_ap3_orientacaoobjetos;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Usuario
 */
public class Prova_AP3_orientacaoObjetos {

    /**
     * @param args the command line arguments
     */
    
    
    
    
    
    public static void main(String[] args) {
        // TODO code application logic here
        
        List numeros = new ArrayList();

        numeros.add(10);

        numeros.add(1000);

        numeros.add(500);

        numeros.add(40);

        numeros.add(-1);

        numeros.set(2, 50);

        numeros.remove(1);

        System.out.println("imprime lista: " + numeros.toString());
    }
    
}
