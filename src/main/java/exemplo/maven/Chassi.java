/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exemplo.maven;

/**
 *
 * @author Edenilson
 */
public class Chassi {
    
    public int valida(String chassi, int pos){
        char x = chassi.charAt(pos -1);
        if(x == 'A'){
            return 2010;
        }
        return 0;
    }
    
}
