package beans.properties.environment;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import template.AbstractTestSpringContext;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

public class TestInjection extends AbstractTestSpringContext {

    @BeforeEach
    public void setUp() {
        System.setProperty("environmentProperty", "bbb");
        System.setProperty("anotherEnvironmentProperty", "yyy");
    }

    @Test
    public void testInjectionOfEnvironment() {
        BeanWithPropertiesInjectedFromEnvironment bean = context.getBean(BeanWithPropertiesInjectedFromEnvironment.class);
        assertNotNull(bean);
        assertNotNull(bean.getEnvironment());
        assertEquals("yyy", bean.getEnvironment().getProperty("anotherEnvironmentProperty"));
        assertEquals("bbb", bean.getEnvironment().getProperty("environmentProperty"));
    }
}
