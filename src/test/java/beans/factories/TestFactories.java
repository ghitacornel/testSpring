package beans.factories;

import org.junit.jupiter.api.Test;
import template.AbstractTestSpringContext;

import static org.junit.jupiter.api.Assertions.*;
import static org.junit.jupiter.api.Assertions.assertNotSame;

public class TestFactories extends AbstractTestSpringContext {

    @Test
    public void testConfigurationFactoriesAreSingletonsByDefault() {

        Factory bean1 = context.getBean(Factory.class);
        assertNotNull(bean1);

        Factory bean2 = context.getBean(Factory.class);
        assertNotNull(bean2);

        assertSame(bean1, bean2);// observe configuration factories are automatically registered as singleton beans

    }

    @Test
    public void testFactoryProducts() {

        PrototypeProduct product_type_1_instance_1 = context.getBean(PrototypeProduct.class);
        assertNotNull(product_type_1_instance_1);
        assertNotNull(product_type_1_instance_1.component);
        assertTrue(product_type_1_instance_1.createdByFactory);// verify product is created using expected factory method

        PrototypeProduct product_type_1_instance_2 = context.getBean("producePrototype", PrototypeProduct.class);
        assertNotNull(product_type_1_instance_2);
        assertNotNull(product_type_1_instance_2.component);
        assertTrue(product_type_1_instance_2.createdByFactory);// verify product is created using expected factory method

        assertNotSame(product_type_1_instance_1, product_type_1_instance_2);// verify factory product scope is honored
        assertNotSame(product_type_1_instance_1.component, product_type_1_instance_2.component);// verify factory product scope is honored

        SingletonProduct product_type_2_instance_1 = context.getBean(SingletonProduct.class);
        assertNotNull(product_type_2_instance_1);
        assertNotNull(product_type_2_instance_1.component);
        assertTrue(product_type_2_instance_1.createdByFactory);// verify product is created using expected factory method

        SingletonProduct product_type_2_instance_2 = context.getBean("produceSingleton", SingletonProduct.class);
        assertNotNull(product_type_2_instance_2);
        assertNotNull(product_type_2_instance_2.component);
        assertTrue(product_type_2_instance_2.createdByFactory);// verify product is created using expected factory method

        assertSame(product_type_2_instance_1, product_type_2_instance_2);// verify factory product scope is honored
        assertSame(product_type_2_instance_1.component, product_type_2_instance_2.component);
    }
}
