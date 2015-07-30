package thjug.springboot;

import static org.testng.Assert.*;
import org.testng.annotations.Test;

public class HelloWorldTest {

    @Test
    public void testSay() {
        final HelloWorld hw = new HelloWorld();

        final String expect = "Hello World !";
        final String result = hw.say();

        assertEquals(result, expect);
    }

}
