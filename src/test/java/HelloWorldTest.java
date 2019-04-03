import org.junit.Test;

import static org.junit.Assert.*;

public class HelloWorldTest {

    @Test
    public void sum() {
        assertEquals(5, HelloWorld.sum(3, 2));
    }
}