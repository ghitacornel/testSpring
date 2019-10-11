package beans.injection.multiplecandidates;

import org.junit.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestInjection {

    @Test(expected = org.springframework.beans.factory.UnsatisfiedDependencyException.class)
    public void testInjectionDependencyNotResolvedDueToMultipleCandidates() {
        new ClassPathXmlApplicationContext("spring-beans.xml", "dependency_with_multiple_candidates.xml");
    }

}
