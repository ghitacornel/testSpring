package beans.factories;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import template.AbstractTestSpringContext;

public class TestFactories extends AbstractTestSpringContext {

    @Test
    public void testConfigurationFactoriesAreSingletonsByDefault() {

        Factory bean1 = context.getBean(Factory.class);
        Assertions.assertNotNull(bean1);

        Factory bean2 = context.getBean(Factory.class);
        Assertions.assertNotNull(bean2);

        Assertions.assertSame(bean1, bean2);// observe configuration factories are automatically registered as singleton beans

    }

    @Test
    public void testFactoryProducts() {

        PrototypeProduct product_type_1_instance_1 = context.getBean(PrototypeProduct.class);
        Assertions.assertNotNull(product_type_1_instance_1);
        Assertions.assertNotNull(product_type_1_instance_1.component);
        Assertions.assertTrue(product_type_1_instance_1.createdByFactory);// verify product is created using expected factory method

        PrototypeProduct product_type_1_instance_2 = context.getBean("producePrototype", PrototypeProduct.class);
        Assertions.assertNotNull(product_type_1_instance_2);
        Assertions.assertNotNull(product_type_1_instance_2.component);
        Assertions.assertTrue(product_type_1_instance_2.createdByFactory);// verify product is created using expected factory method

        Assertions.assertNotSame(product_type_1_instance_1, product_type_1_instance_2);// verify factory product scope is honored
        Assertions.assertNotSame(product_type_1_instance_1.component, product_type_1_instance_2.component);// verify factory product scope is honored

        SingletonProduct product_type_2_instance_1 = context.getBean(SingletonProduct.class);
        Assertions.assertNotNull(product_type_2_instance_1);
        Assertions.assertNotNull(product_type_2_instance_1.component);
        Assertions.assertTrue(product_type_2_instance_1.createdByFactory);// verify product is created using expected factory method

        SingletonProduct product_type_2_instance_2 = context.getBean("produceSingleton", SingletonProduct.class);
        Assertions.assertNotNull(product_type_2_instance_2);
        Assertions.assertNotNull(product_type_2_instance_2.component);
        Assertions.assertTrue(product_type_2_instance_2.createdByFactory);// verify product is created using expected factory method

        Assertions.assertSame(product_type_2_instance_1, product_type_2_instance_2);// verify factory product scope is honored
        Assertions.assertSame(product_type_2_instance_1.component, product_type_2_instance_2.component);
    }
}
