package beans.properties.xml;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import template.AbstractTestSpringContext;

public class TestInjection extends AbstractTestSpringContext {

    @Test
    public void testInjectionOfPropertiesFromXML() {
        BeanWithPropertiesInjectedFromXML bean = context.getBean(BeanWithPropertiesInjectedFromXML.class);
        Assertions.assertNotNull(bean);
        Assertions.assertEquals("customConstructorProvidedValue", bean.getConstructorProperty());
        Assertions.assertEquals(2, bean.getSimpleProperty());
    }
}
