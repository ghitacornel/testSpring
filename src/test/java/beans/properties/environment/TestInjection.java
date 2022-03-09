package beans.properties.environment;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import template.AbstractTestSpringContext;

public class TestInjection extends AbstractTestSpringContext {

    @BeforeEach
    public void setUp() {
        System.setProperty("environmentProperty", "bbb");
        System.setProperty("anotherEnvironmentProperty", "yyy");
    }

    @Test
    public void testInjectionOfEnvironment() {
        BeanWithPropertiesInjectedFromEnvironment bean = context.getBean(BeanWithPropertiesInjectedFromEnvironment.class);
        Assertions.assertNotNull(bean);
        Assertions.assertNotNull(bean.getEnvironment());
        Assertions.assertEquals("yyy", bean.getEnvironment().getProperty("anotherEnvironmentProperty"));
        Assertions.assertEquals("bbb", bean.getEnvironment().getProperty("environmentProperty"));
    }
}
