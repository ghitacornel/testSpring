package beans.factories.misc;

import org.junit.Assert;
import org.junit.Test;
import template.AbstractTestSpringContext;

public class TestFactoryMisc extends AbstractTestSpringContext {

    @Test
    public void testDoubleInstanceNotCreated() {

        Product1 product1 = context.getBean(Product1.class);
        Product2 product2 = context.getBean(Product2.class);

        Assert.assertNotNull(product1);
        Assert.assertNotNull(product2);
        Assert.assertSame(product1, product2.product1);

    }
}
