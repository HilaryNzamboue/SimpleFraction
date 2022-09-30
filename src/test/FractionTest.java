package test;

import fraction.Fraction;
import org.junit.Test;

//import static org.junit.Assert.*;
import static org.junit.jupiter.api.Assertions.*;

public class FractionTest {
    @Test
    public void toStringTest(){
        Fraction fraction1 = new Fraction(3,1);
        Fraction fraction2 = new Fraction(0,1);
        Fraction fraction3 = new Fraction(3,0);
        Fraction fraction4 = new Fraction(9,3);

        assertEquals("La Fraction est 3", fraction1.toString());
        assertFalse(fraction2.toString()=="La Fraction est 1", "Condition Fausse" );
        assertTrue(fraction3.toString() == "Erreur d'initialisation", "Condition vraie");
        assertFalse(fraction4.toString()=="La Fraction est 3/9", "Condition Fausse");
    }

    @Test
    public void doubleValueTest(){
        Fraction fraction = new Fraction();
        assertEquals(3/4, fraction.doubleValue(3, 4));
    }

}
