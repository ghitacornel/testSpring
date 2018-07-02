package beans.factories;

import beans.factories.configuration.ConfigurationFactoryProduct1;
import beans.factories.configuration.ConfigurationFactoryProduct2;
import beans.factories.xml.XMLFactory;
import beans.factories.xml.XMLFactoryProduct1;
import beans.factories.xml.XMLFactoryProduct2;
import org.junit.Assert;
import org.junit.Test;
import template.AbstractTestSpringContext;

public class TestFactories extends AbstractTestSpringContext {

    @Test
    public void testXMLFactories() {

        XMLFactory xmlFactoryBean = context.getBean(XMLFactory.class);
        Assert.assertNotNull(xmlFactoryBean);
        XMLFactoryProduct1 xmlFactoryProduct1 = context.getBean(XMLFactoryProduct1.class);
        Assert.assertNotNull(xmlFactoryProduct1);
        XMLFactoryProduct2 xmlFactoryProduct2 = context.getBean(XMLFactoryProduct2.class);
        Assert.assertNotNull(xmlFactoryProduct2);
        Assert.assertTrue(xmlFactoryBean.isProduce1Called());
        Assert.assertTrue(xmlFactoryBean.isProduce2Called());

    }

    @Test
    public void testXMLStaticMethodsFactories() {

        XMLFactory xmlFactoryBean = context.getBean(XMLFactory.class);
        Assert.assertNotNull(xmlFactoryBean);
        XMLFactoryProduct1 xmlFactoryProduct1 = context.getBean(XMLFactoryProduct1.class);
        Assert.assertNotNull(xmlFactoryProduct1);
        XMLFactoryProduct2 xmlFactoryProduct2 = context.getBean(XMLFactoryProduct2.class);
        Assert.assertNotNull(xmlFactoryProduct2);
        Assert.assertTrue(xmlFactoryBean.isProduce1Called());
        Assert.assertTrue(xmlFactoryBean.isProduce2Called());

    }

    @Test
    public void testConfigurationFactories() {

        // verify products are created
        // no need to use directly the factory
        ConfigurationFactoryProduct1 product1_1 = context.getBean(ConfigurationFactoryProduct1.class);
        Assert.assertNotNull(product1_1);
        Assert.assertFalse(product1_1.createdByConstructor);

        ConfigurationFactoryProduct1 product1_2 = context.getBean(ConfigurationFactoryProduct1.class);
        Assert.assertNotNull(product1_2);
        Assert.assertFalse(product1_2.createdByConstructor);

        Assert.assertNotEquals(product1_1, product1_2);

        ConfigurationFactoryProduct2 product2_1 = context.getBean(ConfigurationFactoryProduct2.class);
        Assert.assertNotNull(product2_1);
        Assert.assertFalse(product2_1.createdByConstructor);

        ConfigurationFactoryProduct2 product2_2 = context.getBean(ConfigurationFactoryProduct2.class);
        Assert.assertNotNull(product2_2);
        Assert.assertFalse(product2_2.createdByConstructor);

        Assert.assertEquals(product2_1, product2_2);
    }
}
