/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exemplo.maven;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Edenilson
 */
public class testChassi {
    
    @Test
    public void ValidaChassi(){
        Chassi chassi = new Chassi();
        assertEquals(2010, chassi.valida("10AB00120A001", 10));
    }
    
    
}
