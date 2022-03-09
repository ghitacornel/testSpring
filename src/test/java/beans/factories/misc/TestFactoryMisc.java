package beans.factories.misc;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import template.AbstractTestSpringContext;

public class TestFactoryMisc extends AbstractTestSpringContext {

    @Test
    public void testDoubleInstanceNotCreated() {

        Product1 product1 = context.getBean(Product1.class);
        Product2 product2 = context.getBean(Product2.class);

        Assertions.assertNotNull(product1);
        Assertions.assertNotNull(product2);
        Assertions.assertSame(product1, product2.product1);

    }
}
