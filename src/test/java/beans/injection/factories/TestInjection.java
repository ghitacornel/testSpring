package beans.injection.factories;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import template.AbstractTestSpringContext;

public class TestInjection extends AbstractTestSpringContext {

    @Test
    public void testInjectionWithAProvidedByAFactoryDependency() {

        {
            BeanWithAFactoryProducedDependencies bean = context.getBean(BeanWithAFactoryProducedDependencies.class);
            Assertions.assertNotNull(bean);
            FactoryProductWithFieldDependency dependency = bean.productWithFieldDependency;
            Assertions.assertNotNull(dependency);
            Assertions.assertTrue(dependency.postConstruct);
            Assertions.assertNotNull(dependency.getDependency());
        }

        {
            BeanWithAFactoryProducedDependencies bean = context.getBean(BeanWithAFactoryProducedDependencies.class);
            Assertions.assertNotNull(bean);
            FactoryProductWithConstructorDependency dependency = bean.productWithConstructorDependency;
            Assertions.assertNotNull(dependency);
            Assertions.assertTrue(dependency.postConstruct);
            Assertions.assertNotNull(dependency.getDependency());
        }

        {
            BeanWithAFactoryProducedDependencies bean = context.getBean(BeanWithAFactoryProducedDependencies.class);
            Assertions.assertNotNull(bean);
            FactoryProductWithSetterDependency dependency = bean.productWithSetterDependency;
            Assertions.assertNotNull(dependency);
            Assertions.assertTrue(dependency.postConstruct);
            Assertions.assertNotNull(dependency.getDependency());
        }

        FactoryOfProducts factory = context.getBean(FactoryOfProducts.class);
        Assertions.assertNotNull(factory);
        Assertions.assertTrue(factory.usedFactoryProductWithFieldDependency);
        Assertions.assertTrue(factory.usedFactoryProductWithConstructorDependency);
        Assertions.assertTrue(factory.usedFactoryProductWithSetterDependency);

    }

}
