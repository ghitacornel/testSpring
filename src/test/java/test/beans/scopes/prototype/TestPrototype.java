package test.beans.scopes.prototype;

import beans.scopes.prototype.Prototype;
import org.junit.Assert;
import org.junit.Test;
import test.AbstractTestSpringContext;

public class TestPrototype extends AbstractTestSpringContext {

    @Test
    public void testPrototype() {
        Prototype prototype1 = context.getBean(Prototype.class);
        Assert.assertNotNull(prototype1);
        Prototype prototype2 = context.getBean(Prototype.class);
        Assert.assertNotNull(prototype2);
        Assert.assertTrue(prototype1 != prototype2);
    }
}
