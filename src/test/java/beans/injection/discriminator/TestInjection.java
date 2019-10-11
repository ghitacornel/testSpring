package beans.injection.discriminator;

import beans.injection.context.BeanWithBeanContainerReferenceInjected;
import beans.injection.direct.BeanWithDifferentTypesOfDependencies;
import beans.injection.factories.BeanWithAFactoryProducedDependency;
import beans.injection.factories.FactoryOfProducts;
import org.junit.Assert;
import org.junit.Test;
import template.AbstractTestSpringContext;

public class TestInjection extends AbstractTestSpringContext {

    @Test
    public void testInjectionWithInjectionDiscriminators() {
        BeanWithManyDependencies bean = context.getBean(BeanWithManyDependencies.class);
        Assert.assertNotNull(bean);
        Assert.assertTrue(bean.areDependenciesResolved());
    }

}
