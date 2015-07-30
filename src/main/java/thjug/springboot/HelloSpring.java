package thjug.springboot;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Scope("prototype")
@Component("helloSpring")
public class HelloSpring implements Hello {

    @Override
    public String say() {
        return "Hello Spring !";
    }
}
