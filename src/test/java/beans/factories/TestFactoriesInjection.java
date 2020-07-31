package beans.factories;

import org.junit.Assert;
import org.junit.Test;
import template.AbstractTestSpringContext;

public class TestFactoriesInjection extends AbstractTestSpringContext {

    @Test
    public void testInjection() {
        FactoryInjectedTarget bean = context.getBean(FactoryInjectedTarget.class);
        Assert.assertNotNull(bean);
        Assert.assertNotNull(bean.factory);

        Assert.assertNotNull(bean.productSingleton);
        Assert.assertNotNull(bean.productSingleton.component);
        Assert.assertTrue(bean.productSingleton.postConstructCalled);
        Assert.assertTrue(bean.productSingleton.createdByFactory);

        Assert.assertNotNull(bean.productPrototype);
        Assert.assertNotNull(bean.productPrototype.component);
        Assert.assertTrue(bean.productPrototype.postConstructCalled);
        Assert.assertTrue(bean.productPrototype.createdByFactory);
    }
}
