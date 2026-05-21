package beans.factories.misc;

import org.junit.jupiter.api.Test;
import template.AbstractTestSpringContext;

import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertSame;

public class TestFactoryMisc extends AbstractTestSpringContext {

    @Test
    public void testDoubleInstanceNotCreated() {

        Product1 product1 = context.getBean(Product1.class);
        Product2 product2 = context.getBean(Product2.class);

        assertNotNull(product1);
        assertNotNull(product2);
        assertSame(product1, product2.product1);

    }
}
