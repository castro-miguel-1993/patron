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
public class concreta_burbuja implements estrategia{

    @Override
    public LinkedList<Integer> ordenar(LinkedList<Integer> l) {
        //numero de elementos
        int k=l.size();
        for (int i = 0; i < k; i++) {
            for (int j =i+1 ; j < k-i; j++) {
                //-----------------
                if (l.get(i) > l.get(j)) {
                //-----------------
                    int aux=l.get(j);
                    l.set(j, l.get(i));
                    l.set(i, aux);
                }
            }
        }
        return l;
    }
    
    
}
