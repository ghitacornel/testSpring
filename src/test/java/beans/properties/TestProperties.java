package beans.properties;

import org.junit.Assert;
import org.junit.Test;
import test.AbstractTestSpringContext;

public class TestProperties extends AbstractTestSpringContext {

    @Test
    public void testProperties() {
        BeanWithProperties bean = context.getBean(BeanWithProperties.class);
        Assert.assertNotNull(bean);
        Assert.assertTrue(bean.getCustomProperty1().equals("customProperty1Value"));
        Assert.assertTrue(bean.getCustomProperty2() == 3);
    }
}
