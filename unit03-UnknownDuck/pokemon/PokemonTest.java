package pokemon;

import org.junit.Test;
import org.junit.platform.commons.annotation.Testable;
import org.junit.rules.ExpectedException;

@Testable
//@testable imports the testing mod
public class PokemonTest {
    @Test
    public void pokatest(){
        //line 9 and 10 is what is needed to test this function
        // no permas

        //init
        Pokemon chandelure = new Pokemon("Rose", PokemonTypes.FIRE, 55);

        int expected = 56;


        //invoke
        chandelure.levelup();

        //actual
        int acctual = chandelure.level;
        
    
    }
    
}
