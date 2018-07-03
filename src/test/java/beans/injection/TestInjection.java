package beans.injection;

import beans.injection.context.BeanWithBeanContainerReferenceInjected;
import beans.injection.direct.BeanWithDifferentTypesOfDependencies;
import beans.injection.discriminator.BeanWithManyDependencies;
import beans.injection.factories.BeanWithAFactoryProducedDependency;
import beans.injection.factories.FactoryOfProductsUsedInDependencyInjections;
import org.junit.Assert;
import org.junit.Test;
import template.AbstractTestSpringContext;

public class TestInjection extends AbstractTestSpringContext {

    @Test
    public void testInjectionDirect() {
        BeanWithDifferentTypesOfDependencies bean = context.getBean(BeanWithDifferentTypesOfDependencies.class);
        Assert.assertNotNull(bean);
        Assert.assertTrue(bean.areDependenciesResolved());
    }

    @Test
    public void testInjectionWithInjectionDiscriminators() {
        BeanWithManyDependencies bean = context.getBean(BeanWithManyDependencies.class);
        Assert.assertNotNull(bean);
        Assert.assertTrue(bean.areDependenciesResolved());
    }

    @Test
    public void testInjectionWithAProvidedByAFactoryDependency() {
        BeanWithAFactoryProducedDependency bean = context.getBean(BeanWithAFactoryProducedDependency.class);
        Assert.assertNotNull(bean);
        Assert.assertNotNull(bean.getFactoryProduct());

        FactoryOfProductsUsedInDependencyInjections factory = context.getBean(FactoryOfProductsUsedInDependencyInjections.class);
        Assert.assertNotNull(factory);
        Assert.assertTrue(factory.isUsed());
    }

    @Test
    public void testInjectionOfBeanContainerReference() {
        BeanWithBeanContainerReferenceInjected bean = context.getBean(BeanWithBeanContainerReferenceInjected.class);
        Assert.assertNotNull(bean);
        Assert.assertNotNull(bean.getContext());
        Assert.assertNotNull(bean.getContext().getBean(BeanWithBeanContainerReferenceInjected.class));
        Assert.assertSame(bean, bean.getContext().getBean(BeanWithBeanContainerReferenceInjected.class));
    }

}
