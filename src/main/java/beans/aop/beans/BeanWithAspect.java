package beans.aop.beans;

import org.springframework.stereotype.Component;

/**
 * Created by Cornel on 10.12.2015.
 */
@Component
public class BeanWithAspect {

    public String doIt() {
        return this + " executed";
    }

    public String fail() {
        throw new RuntimeException("fail");
    }
}
