package thjug.springboot;

import org.hamcrest.Matchers;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = Application.class)
public class HelloWorldTest {

    @Autowired
    private Hello helloWorld;

    @Autowired
    private Hello helloSpring;

    @Autowired
    @Qualifier("helloWorld")
    private Hello hello;

    @Test
    public void testHelloWorld() {
        final String expect = "Hello World !";
        final String result = helloWorld.say();

        Assert.assertThat(result, Matchers.equalTo(expect));
    }

    @Test
    public void testHelloSpring() {
        final String expect = "Hello Spring !";
        final String result = helloSpring.say();

        Assert.assertThat(result, Matchers.equalTo(expect));
    }

    @Test
    public void testHello() {
        final String expect = "Hello World !";
        final String result = hello.say();

        Assert.assertThat(result, Matchers.equalTo(expect));
    }

    @Test
    public void testIsSingleton() {
        Assert.assertTrue(helloWorld == hello);
    }
}
