package thjug.springboot;

import org.hamcrest.Matchers;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = Application.class)
public class HelloWorldTest {

    @Autowired
    private HelloWorld hw;

    @Test
    public void testSay() {
        final String expect = "Hello World !";
        final String result = hw.say();

        Assert.assertThat(result, Matchers.equalTo(expect));
    }

}
