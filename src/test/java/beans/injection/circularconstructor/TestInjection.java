package beans.injection.circularconstructor;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestInjection {

    @Test
    public void testInjectionCircularDependency() {
        Assertions.assertThrows(org.springframework.beans.factory.UnsatisfiedDependencyException.class,
                () -> new ClassPathXmlApplicationContext("spring-beans.xml", "circular_dependency_constructor.xml"));
    }

}
