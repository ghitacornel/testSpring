package beans.aop.beans;

import org.springframework.stereotype.Component;

@Component
public class BeanAffectedByAspect {

    public String complexBusiness() {
        return this + " executed";
    }

    public String complexBusinessThatThrowsException() {
        throw new RuntimeException("fail");
    }
}
