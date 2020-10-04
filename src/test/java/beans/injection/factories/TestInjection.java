package beans.injection.factories;

import org.junit.Assert;
import org.junit.Test;
import template.AbstractTestSpringContext;

public class TestInjection extends AbstractTestSpringContext {

    @Test
    public void testInjectionWithAProvidedByAFactoryDependency() {

        {
            BeanWithAFactoryProducedDependencies bean = context.getBean(BeanWithAFactoryProducedDependencies.class);
            Assert.assertNotNull(bean);
            FactoryProductWithFieldDependency dependency = bean.productWithFieldDependency;
            Assert.assertNotNull(dependency);
            Assert.assertTrue(dependency.postConstruct);
            Assert.assertNotNull(dependency.getDependency());
        }

        {
            BeanWithAFactoryProducedDependencies bean = context.getBean(BeanWithAFactoryProducedDependencies.class);
            Assert.assertNotNull(bean);
            FactoryProductWithConstructorDependency dependency = bean.productWithConstructorDependency;
            Assert.assertNotNull(dependency);
            Assert.assertTrue(dependency.postConstruct);
            Assert.assertNotNull(dependency.getDependency());
        }

        {
            BeanWithAFactoryProducedDependencies bean = context.getBean(BeanWithAFactoryProducedDependencies.class);
            Assert.assertNotNull(bean);
            FactoryProductWithSetterDependency dependency = bean.productWithSetterDependency;
            Assert.assertNotNull(dependency);
            Assert.assertTrue(dependency.postConstruct);
            Assert.assertNotNull(dependency.getDependency());
        }

        FactoryOfProducts factory = context.getBean(FactoryOfProducts.class);
        Assert.assertNotNull(factory);
        Assert.assertTrue(factory.usedFactoryProductWithFieldDependency);
        Assert.assertTrue(factory.usedFactoryProductWithConstructorDependency);
        Assert.assertTrue(factory.usedFactoryProductWithSetterDependency);

    }

}
