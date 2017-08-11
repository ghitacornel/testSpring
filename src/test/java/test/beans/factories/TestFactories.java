package test.beans.factories;

import beans.factories.configuration.ConfigurationFactory;
import beans.factories.configuration.ConfigurationFactoryProduct1;
import beans.factories.configuration.ConfigurationFactoryProduct2;
import beans.factories.xml.XMLFactory;
import beans.factories.xml.XMLFactoryProduct1;
import beans.factories.xml.XMLFactoryProduct2;
import org.junit.Assert;
import org.junit.Test;
import test.AbstractTestSpringContext;

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

        // verify the factory is created
        ConfigurationFactory configurationFactory = context.getBean(ConfigurationFactory.class);
        Assert.assertNotNull(configurationFactory);

        // verify products are created
        // no need to use directly the factory
        ConfigurationFactoryProduct1 configurationFactoryProduct1 = context.getBean(ConfigurationFactoryProduct1.class);
        Assert.assertNotNull(configurationFactoryProduct1);
        ConfigurationFactoryProduct2 configurationFactoryProduct2 = context.getBean(ConfigurationFactoryProduct2.class);
        Assert.assertNotNull(configurationFactoryProduct2);

        Assert.assertTrue(configurationFactory.isProduce1Called());
        Assert.assertTrue(configurationFactory.isProduce2Called());

    }
}
