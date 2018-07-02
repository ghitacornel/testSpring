package beans.aop.beans;

import org.springframework.stereotype.Component;

@Component
public class BeanWithAspect {

    public String doIt() {
        return this + " executed";
    }

    public String fail() {
        throw new RuntimeException("fail");
    }
}
