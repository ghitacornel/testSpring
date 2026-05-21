package beans.injection.notresolved;

import org.junit.jupiter.api.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import static org.junit.jupiter.api.Assertions.assertThrows;

public class TestInjection {

    @Test
    public void testInjectionDependencyNotResolved() {
        assertThrows(org.springframework.beans.factory.UnsatisfiedDependencyException.class,
                () -> new ClassPathXmlApplicationContext("spring-beans.xml", "dependency_not_resolvable.xml"));
    }

}
