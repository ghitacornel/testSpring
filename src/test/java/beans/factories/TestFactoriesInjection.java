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
        Assert.assertNotNull(bean.singletonProduct);
        Assert.assertNotNull(bean.singletonProduct.component);
        Assert.assertNotNull(bean.prototypeProduct);
        Assert.assertNotNull(bean.prototypeProduct.component);
    }
}
