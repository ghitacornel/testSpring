package beans.injection;

import beans.injection.context.BeanWithContextInjected;
import beans.injection.direct.BeanWithDifferentTypesOfDependencies;
import beans.injection.discriminator.BeanWithManyDependencies;
import beans.injection.environment.BeanWithEnvironment;
import beans.injection.factories.BeanWithFactoryDependency;
import beans.injection.factories.FactoryOfDependency;
import beans.injection.properties.BeanWithValues;
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

    @Test
    public void testInjectionOfContext() {
        BeanWithContextInjected bean = context.getBean(BeanWithContextInjected.class);
        Assert.assertNotNull(bean);
        Assert.assertNotNull(bean.getContext());
        Assert.assertNotNull(bean.getContext().getBean(BeanWithContextInjected.class));
        Assert.assertTrue(bean == bean.getContext().getBean(BeanWithContextInjected.class));
    }

    @Test
    public void testInjectionOfProperties() {
        BeanWithValues bean = context.getBean(BeanWithValues.class);
        Assert.assertNotNull(bean);
        Assert.assertEquals("bla bla bla", bean.getCustomValue());
        Assert.assertEquals("tra la la", bean.getCustomSecondValue());
    }

    @Test
    public void testInjectionOfEnvironment() {
        BeanWithEnvironment bean = context.getBean(BeanWithEnvironment.class);
        Assert.assertNotNull(bean);
        Assert.assertNotNull(bean.getEnvironment());
        Assert.assertTrue(bean.getEnvironment().getActiveProfiles().length == 0);
    }
}
