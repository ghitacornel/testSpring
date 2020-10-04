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
            FactoryProductWithFieldDependency factoryProductWithFieldDependency = bean.getProductFieldDependency();
            Assert.assertNotNull(factoryProductWithFieldDependency);
            Assert.assertTrue(factoryProductWithFieldDependency.postConstruct);
            Assert.assertNotNull(factoryProductWithFieldDependency.getDependency());
        }

        {
            BeanWithAFactoryProducedDependency bean = context.getBean(BeanWithAFactoryProducedDependency.class);
            Assert.assertNotNull(bean);
            FactoryProductWithConstructorDependency factoryProductWithConstructorDependency = bean.getProductConstructorDependency();
            Assert.assertNotNull(factoryProductWithConstructorDependency);
            Assert.assertTrue(factoryProductWithConstructorDependency.postConstruct);
            Assert.assertNotNull(factoryProductWithConstructorDependency.getDependency());
        }

        {
            BeanWithAFactoryProducedDependency bean = context.getBean(BeanWithAFactoryProducedDependency.class);
            Assert.assertNotNull(bean);
            FactoryProductWithSetterDependency factoryProductWithSetterDependency = bean.getFactoryProductWithSetterDependency();
            Assert.assertNotNull(factoryProductWithSetterDependency);
            Assert.assertTrue(factoryProductWithSetterDependency.postConstruct);
            Assert.assertNotNull(factoryProductWithSetterDependency.getDependency());
        }

        FactoryOfProducts factory = context.getBean(FactoryOfProducts.class);
        Assert.assertNotNull(factory);
        Assert.assertTrue(factory.usedFactoryProductWithFieldDependency);
        Assert.assertTrue(factory.usedFactoryProductWithConstructorDependency);
        Assert.assertTrue(factory.usedFactoryProductWithSetterDependency);

    }

}
