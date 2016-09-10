package crawley.james.InitializationLab1;

import org.junit.Test;
import static org.junit.Assert.*;

/**
 * Created by jamescrawley on 9/10/16.
 */
public class InitializationLab1Test {

    @Test
    public void getColorTest() {
        ColorfulThing colorfulThing = new ColorfulThing(Color.BLUE);
        assertEquals("The color should be blue.", Color.BLUE, colorfulThing.getColor());
    }
}
