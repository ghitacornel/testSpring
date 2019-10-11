package beans.injection.factories;

import org.junit.Assert;
import org.junit.Test;
import template.AbstractTestSpringContext;

public class TestInjection extends AbstractTestSpringContext {

    @Test
    public void testInjectionWithAProvidedByAFactoryDependency() {
        BeanWithAFactoryProducedDependency bean = context.getBean(BeanWithAFactoryProducedDependency.class);
        Assert.assertNotNull(bean);
        Assert.assertNotNull(bean.getFactoryProduct());
        Assert.assertTrue(bean.getFactoryProduct().postConstruct);
        Assert.assertNotNull(bean.getFactoryProduct().factoryProductDependency);

        FactoryOfProducts factory = context.getBean(FactoryOfProducts.class);
        Assert.assertNotNull(factory);
        Assert.assertTrue(factory.isUsed());
    }

}
