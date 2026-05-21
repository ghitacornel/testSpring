package beans.properties.config;

import org.junit.jupiter.api.Test;
import template.AbstractTestSpringContext;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

public class TestInjection extends AbstractTestSpringContext {

    @Test
    public void testInjectionOfPropertiesFromPropertyFiles() {
        BeanWithPropertiesInjectedFromPropertyFiles bean = context.getBean(BeanWithPropertiesInjectedFromPropertyFiles.class);
        assertNotNull(bean);
        assertEquals("bla bla bla", bean.getCustomValue());
        assertEquals("tra la la", bean.getCustomSecondValue());
    }

}
