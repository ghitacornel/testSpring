package beans.injection.circularfield;

import org.junit.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestInjection {

    @Test
    public void testInjectionCircularDependency() {
        new ClassPathXmlApplicationContext("spring-beans.xml", "circular_dependency_field.xml");
    }

}
