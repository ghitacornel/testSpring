package beans.injection.circularconstructor;

import org.junit.jupiter.api.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import static org.junit.jupiter.api.Assertions.assertThrows;

public class TestInjection {

    @Test
    public void testInjectionCircularDependency() {
        assertThrows(org.springframework.beans.factory.UnsatisfiedDependencyException.class,
                () -> new ClassPathXmlApplicationContext("spring-beans.xml", "circular_dependency_constructor.xml"));
    }

}
