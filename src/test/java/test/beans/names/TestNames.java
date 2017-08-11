package test.beans.names;

import beans.names.NamedBean;
import org.junit.Assert;
import org.junit.Test;
import test.AbstractTestSpringContext;

public class TestNames extends AbstractTestSpringContext {

    @Test
    public void testNames() {
        NamedBean namedBean1 = context.getBean(NamedBean.class);
        Assert.assertNotNull(namedBean1);
        NamedBean namedBean2 = (NamedBean) context.getBean("SpecificBeanName");
        Assert.assertNotNull(namedBean2);
        Assert.assertTrue(namedBean1 == namedBean2);
    }
}
