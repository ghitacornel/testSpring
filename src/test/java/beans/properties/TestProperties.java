package beans.properties;

import org.junit.Assert;
import org.junit.Test;
import template.AbstractTestSpringContext;

public class TestProperties extends AbstractTestSpringContext {

    @Test
    public void testInjectionOfPropertiesFromXML() {
        BeanWithPropertiesInjectedFromXML bean = context.getBean(BeanWithPropertiesInjectedFromXML.class);
        Assert.assertNotNull(bean);
        Assert.assertEquals("customConstructorValue", bean.getConstructorProperty());
        Assert.assertEquals(2, bean.getSimpleProperty());
    }
}
