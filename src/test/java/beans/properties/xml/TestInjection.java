package beans.properties.xml;

import org.junit.jupiter.api.Test;
import template.AbstractTestSpringContext;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

public class TestInjection extends AbstractTestSpringContext {

    @Test
    public void testInjectionOfPropertiesFromXML() {
        BeanWithPropertiesInjectedFromXML bean = context.getBean(BeanWithPropertiesInjectedFromXML.class);
        assertNotNull(bean);
        assertEquals("customConstructorProvidedValue", bean.getConstructorProperty());
        assertEquals(2, bean.getSimpleProperty());
    }
}
