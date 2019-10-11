package beans.injection.circularconstructor;

import org.junit.Assert;
import org.junit.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestInjection {

    @Test(expected = org.springframework.beans.factory.UnsatisfiedDependencyException.class)
    public void testInjectionCircularDependency() {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("spring-beans.xml", "circular_dependency_constructor.xml");
        A bean = context.getBean(A.class);
        Assert.assertNotNull(bean);
    }

}
