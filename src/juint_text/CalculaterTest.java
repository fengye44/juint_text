package juint_text;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Ignore;
import org.junit.Test;

public class CalculaterTest {

	 private static Calculater calculator = new Calculater();
	    
	    @Before
	    public void setUp() throws Exception {
	        calculator.clear();
	    }

	    @Test
	    public void equilateral() {
	        assertEquals("等边三角形", calculator.T(1,1,1));
	    }
        
	    @Test
	    public void isosceles() {
	        assertEquals("等腰三角形", calculator.T(4,4,5));
	    }
	    
	    @Test
	    public void scalene() {
	        assertEquals("不等边三角形", calculator.T(3,4,5));
	    }
	   
	    @Test
	    public void not() {
	        assertEquals("无法构成三角形", calculator.T(1,2,1));
	    }
}
