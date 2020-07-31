package beans.factories;

import org.junit.Assert;
import org.junit.Test;
import template.AbstractTestSpringContext;

public class TestFactoriesPrototypeLifeCycle extends AbstractTestSpringContext {

    @Test
    public void testLifecyclePrototype() {

        ProductPrototype bean = context.getBean(ProductPrototype.class);
        Assert.assertNotNull(bean);
        Assert.assertTrue(bean.postConstructCalled);
        Assert.assertFalse(bean.preDestroyCalled);

        // destroy the container
        context.close();

        Assert.assertTrue(bean.postConstructCalled);
        /**
         * even after the container is destroyed the pre destroy event is not triggered<br>
         * This behavior occurs because this bean is no longer maintained by the container once produced and delivered
         */
        Assert.assertFalse(bean.preDestroyCalled);

    }

}
