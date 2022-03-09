package beans.injection.notresolved;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestInjection {

    @Test
    public void testInjectionDependencyNotResolved() {
        Assertions.assertThrows(org.springframework.beans.factory.UnsatisfiedDependencyException.class,
                () -> new ClassPathXmlApplicationContext("spring-beans.xml", "dependency_not_resolvable.xml"));
    }

}
