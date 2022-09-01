import static org.junit.Assert.assertEquals;
import org.junit.Test;
import org.junit.platform.commons.annotation.Testable;

@Testable
public class LogTest {
    @Test
    public void log(){
        //Setup
        int x = 2;
        int n = 97;
        int expected = 6;

        //invoke
        int actual = Log.log(x,n);

        //anaylze
        assertEquals(expected, actual, 0.0001);
    }