package thjug.springboot;

import org.springframework.stereotype.Component;

@Component("helloWorld")
public class HelloWorld implements Hello {

    @Override
    public String say() {
        return "Hello World !";
    }
}
