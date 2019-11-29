package beans.injection.factories;

import org.junit.Assert;
import org.junit.Test;
import template.AbstractTestSpringContext;

public class TestInjection extends AbstractTestSpringContext {

    @Test
    public void testInjectionWithAProvidedByAFactoryDependency() {

        {
            BeanWithAFactoryProducedDependency bean = context.getBean(BeanWithAFactoryProducedDependency.class);
            Assert.assertNotNull(bean);
            FactoryProductFieldDependency productFieldDependency = bean.getProductFieldDependency();
            Assert.assertNotNull(productFieldDependency);
            Assert.assertTrue(productFieldDependency.postConstruct);
            Assert.assertNotNull(productFieldDependency.getFactoryProductDependency());
        }

        {
            BeanWithAFactoryProducedDependency bean = context.getBean(BeanWithAFactoryProducedDependency.class);
            Assert.assertNotNull(bean);
            FactoryProductConstructorDependency productConstructorDependency = bean.getProductConstructorDependency();
            Assert.assertNotNull(productConstructorDependency);
            Assert.assertTrue(productConstructorDependency.postConstruct);
            Assert.assertNotNull(productConstructorDependency.getFactoryProductDependency());
        }

        FactoryOfProducts factory = context.getBean(FactoryOfProducts.class);
        Assert.assertNotNull(factory);
        Assert.assertTrue(factory.isUsed());

    }

}
