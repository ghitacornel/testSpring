package beans.injection.notresolved;

import org.junit.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestInjection {

    @Test(expected = org.springframework.beans.factory.UnsatisfiedDependencyException.class)
    public void testInjectionDependencyNotResolved() {
        new ClassPathXmlApplicationContext("spring-beans.xml", "dependency_not_resolvable.xml");
    }

}
