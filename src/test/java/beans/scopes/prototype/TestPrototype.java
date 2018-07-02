package beans.scopes.prototype;

import org.junit.Assert;
import org.junit.Test;
import template.AbstractTestSpringContext;

public class TestPrototype extends AbstractTestSpringContext {

    @Test
    public void testPrototype() {

        Prototype prototype1 = context.getBean(Prototype.class);
        Assert.assertNotNull(prototype1);
        Assert.assertTrue(prototype1.isInitCalled);

        Prototype prototype2 = context.getBean(Prototype.class);
        Assert.assertNotNull(prototype2);
        Assert.assertTrue(prototype2.isInitCalled);

        Assert.assertTrue(prototype1 != prototype2);
    }
}
