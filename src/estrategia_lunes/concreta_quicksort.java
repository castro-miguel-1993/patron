/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package estrategia_lunes;

import java.util.LinkedList;

/**
 *
 * @author RomanO
 */
public class concreta_quicksort implements estrategia{
     @Override
    public LinkedList<Integer> ordenar(LinkedList<Integer> l) {
       ordenar(l,0,l.size()-1);
       return l;
    }
    
    public void ordenar(LinkedList<Integer> l,int izq,int der){
        int pivote=l.get(izq);
        int i=izq;
        int j=der;
        int aux;
        
        while (i<j) {            
            while (l.get(i)<=pivote && i<j) {                
                i++;
                
            }
            while (l.get(j)>pivote) {                
                j--;
            }
            if (i<j) {
                aux=l.get(i);
                l.set(i, l.get(j));
                l.set(j, aux);
            }
            
        }
        l.set(izq, l.get(j));
        l.set(j, pivote);
        if (izq<j-1) {
            ordenar(l, izq, j-1);
        }
        if (j+1<der) {
            ordenar(l, j+1, der);
        }
    }
}
