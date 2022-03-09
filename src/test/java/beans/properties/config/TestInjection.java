package beans.properties.config;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import template.AbstractTestSpringContext;

public class TestInjection extends AbstractTestSpringContext {

    @Test
    public void testInjectionOfPropertiesFromPropertyFiles() {
        BeanWithPropertiesInjectedFromPropertyFiles bean = context.getBean(BeanWithPropertiesInjectedFromPropertyFiles.class);
        Assertions.assertNotNull(bean);
        Assertions.assertEquals("bla bla bla", bean.getCustomValue());
        Assertions.assertEquals("tra la la", bean.getCustomSecondValue());
    }

}
