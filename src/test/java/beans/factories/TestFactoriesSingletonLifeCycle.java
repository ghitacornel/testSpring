package beans.factories;

import org.junit.Assert;
import org.junit.Test;
import template.AbstractTestSpringContext;

public class TestFactoriesSingletonLifeCycle extends AbstractTestSpringContext {

    @Test
    public void testLifecycleSingleton() {

        ProductSingleton bean = context.getBean(ProductSingleton.class);
        Assert.assertNotNull(bean);
        Assert.assertTrue(bean.postConstructCalled);
        Assert.assertFalse(bean.preDestroyCalled);

        // destroy the container
        context.close();

        Assert.assertTrue(bean.postConstructCalled);
        Assert.assertTrue(bean.preDestroyCalled);

    }
}
