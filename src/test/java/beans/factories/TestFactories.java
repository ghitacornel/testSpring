package beans.factories;

import org.junit.Assert;
import org.junit.Test;
import template.AbstractTestSpringContext;

public class TestFactories extends AbstractTestSpringContext {

    @Test
    public void testConfigurationFactoriesAreSingletonsByDefault() {

        Factory bean1 = context.getBean(Factory.class);
        Assert.assertNotNull(bean1);

        Factory bean2 = context.getBean(Factory.class);
        Assert.assertNotNull(bean2);

        Assert.assertSame(bean1, bean2);// observe configuration factories are automatically registered as singleton beans

    }

    @Test
    public void testFactoryProducts() {

        ProductPrototype product_type_1_instance_1 = context.getBean(ProductPrototype.class);
        Assert.assertNotNull(product_type_1_instance_1);
        Assert.assertNotNull(product_type_1_instance_1.component);
        Assert.assertTrue(product_type_1_instance_1.createdByFactory);// verify product is created using expected factory method

        ProductPrototype product_type_1_instance_2 = context.getBean(ProductPrototype.class);
        Assert.assertNotNull(product_type_1_instance_2);
        Assert.assertNotNull(product_type_1_instance_2.component);
        Assert.assertTrue(product_type_1_instance_2.createdByFactory);// verify product is created using expected factory method

        Assert.assertNotSame(product_type_1_instance_1, product_type_1_instance_2);// verify factory product scope is honored
        Assert.assertNotSame(product_type_1_instance_1.component, product_type_1_instance_2.component);// verify factory product scope is honored

        ProductSingleton product_type_2_instance_1 = context.getBean(ProductSingleton.class);
        Assert.assertNotNull(product_type_2_instance_1);
        Assert.assertNotNull(product_type_2_instance_1.component);
        Assert.assertTrue(product_type_2_instance_1.createdByFactory);// verify product is created using expected factory method

        ProductSingleton product_type_2_instance_2 = context.getBean(ProductSingleton.class);
        Assert.assertNotNull(product_type_2_instance_2);
        Assert.assertNotNull(product_type_2_instance_2.component);
        Assert.assertTrue(product_type_2_instance_2.createdByFactory);// verify product is created using expected factory method

        Assert.assertSame(product_type_2_instance_1, product_type_2_instance_2);// verify factory product scope is honored
        Assert.assertSame(product_type_2_instance_1.component, product_type_2_instance_2.component);
    }
}
