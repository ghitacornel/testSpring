package beans.injection.direct;

import beans.injection.context.BeanWithBeanContainerReferenceInjected;
import beans.injection.direct.BeanWithDifferentTypesOfDependencies;
import beans.injection.discriminator.BeanWithManyDependencies;
import beans.injection.factories.BeanWithAFactoryProducedDependency;
import beans.injection.factories.FactoryOfProducts;
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

}
