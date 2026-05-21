package beans.injection.factories;

import org.junit.jupiter.api.Test;
import template.AbstractTestSpringContext;

import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class TestInjection extends AbstractTestSpringContext {

    @Test
    public void testInjectionWithAProvidedByAFactoryDependency() {

        {
            BeanWithAFactoryProducedDependencies bean = context.getBean(BeanWithAFactoryProducedDependencies.class);
            assertNotNull(bean);
            FactoryProductWithFieldDependency dependency = bean.productWithFieldDependency;
            assertNotNull(dependency);
            assertTrue(dependency.postConstruct);
            assertNotNull(dependency.getDependency());
        }

        {
            BeanWithAFactoryProducedDependencies bean = context.getBean(BeanWithAFactoryProducedDependencies.class);
            assertNotNull(bean);
            FactoryProductWithConstructorDependency dependency = bean.productWithConstructorDependency;
            assertNotNull(dependency);
            assertTrue(dependency.postConstruct);
            assertNotNull(dependency.getDependency());
        }

        {
            BeanWithAFactoryProducedDependencies bean = context.getBean(BeanWithAFactoryProducedDependencies.class);
            assertNotNull(bean);
            FactoryProductWithSetterDependency dependency = bean.productWithSetterDependency;
            assertNotNull(dependency);
            assertTrue(dependency.postConstruct);
            assertNotNull(dependency.getDependency());
        }

        FactoryOfProducts factory = context.getBean(FactoryOfProducts.class);
        assertNotNull(factory);
        assertTrue(factory.usedFactoryProductWithFieldDependency);
        assertTrue(factory.usedFactoryProductWithConstructorDependency);
        assertTrue(factory.usedFactoryProductWithSetterDependency);

    }

}
