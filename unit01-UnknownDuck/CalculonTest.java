import static org.junit.Assert.assertEquals;
import org.junit.Test;
import org.junit.platform.commons.annotation.Testable;

@Testable

public class CalculonTest {
    @Test
    public void  add() {
        //setup
        double x = 10.5;
        double y = 12.34;
        double expected = x + 1;

        //invoke
        double actual = Calculon.add(x, y);

        //anlyze
        assertEquals(expected, actual, 0.0001);
    }
    public void  subtract() {
        //setup
        double x = 10.5;
        double y = 12.34;
        double expected = x - 1;

        //invoke
        double actual = Calculon.subtract(x, y);

        //anlyze
        assertEquals(expected, actual, 0.0001);
    }
    public void  multiply() {
        //setup
        double x = 10.5;
        double y = 12.34;
        double expected = x * 1;

        //invoke
        double actual = Calculon.multiply(x, y);

        //anlyze
        assertEquals(expected, actual, 0.0001);
    }
    public void  divide() {
        //setup
        double x = 10.5;
        double y = 12.34;
        double expected = x / 1;

        //invoke
        double actual = Calculon.divide(x, y);

        //anlyze
        assertEquals(expected, actual, 0.0001);
    }
}