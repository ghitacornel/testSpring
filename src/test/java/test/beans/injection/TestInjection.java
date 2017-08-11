package test.beans.injection;

import beans.injection.direct.BeanWithDifferentTypesOfDependencies;
import beans.injection.discriminator.BeanWithManyDependencies;
import beans.injection.factories.BeanWithFactoryDependency;
import beans.injection.factories.FactoryOfDependency;
import org.junit.Assert;
import org.junit.Test;
import test.AbstractTestSpringContext;

public class TestInjection extends AbstractTestSpringContext {

    @Test
    public void testInjectionDirect() {
        BeanWithDifferentTypesOfDependencies bean = context.getBean(BeanWithDifferentTypesOfDependencies.class);
        Assert.assertNotNull(bean);
        Assert.assertTrue(bean.areDependenciesResolved());
    }

    @Test
    public void testInjectionWithDiscriminator() {
        BeanWithManyDependencies bean = context.getBean(BeanWithManyDependencies.class);
        Assert.assertNotNull(bean);
        Assert.assertTrue(bean.areDependenciesResolved());
    }

    @Test
    public void testInjectionBuildFromFactory() {
        BeanWithFactoryDependency beanWithFactoryDependency = context.getBean(BeanWithFactoryDependency.class);
        Assert.assertNotNull(beanWithFactoryDependency);
        Assert.assertNotNull(beanWithFactoryDependency.getFactoryProduct());

        FactoryOfDependency factoryOfDependency = context.getBean(FactoryOfDependency.class);
        Assert.assertNotNull(factoryOfDependency);
        Assert.assertTrue(factoryOfDependency.isUsed());
    }
}
