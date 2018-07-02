package beans.factories.xml;

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

}
