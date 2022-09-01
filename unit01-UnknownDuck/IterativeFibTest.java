import static org.junit.Assert.assertEquals;
import org.junit.Test;
import org.junit.platform.commons.annotation.Testable;

@Testable
public class IterativeFibTest {
    @Test
    public void Fib(){
        //Setup
        int x = 2;
        int n = 97;
        int expected = x + n;

        //invoke
        int actual = IterativeFib.fib(x);

        //anaylze
        assertEquals(expected, actual, 0.0001);
    }
}
