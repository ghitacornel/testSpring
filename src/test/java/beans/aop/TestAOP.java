package beans.aop;

import beans.aop.beans.BeanWithAspect;
import org.junit.Assert;
import org.junit.Test;
import test.AbstractTestSpringContext;

public class TestAOP extends AbstractTestSpringContext {

    @Test
    public void test_AOP_OK() {
        BeanWithAspect bean = context.getBean(BeanWithAspect.class);
        Assert.assertNotNull(bean);
        System.out.println(bean.doIt());
    }

    @Test(expected = RuntimeException.class)
    public void test_AOP_FAIL() {
        BeanWithAspect bean = context.getBean(BeanWithAspect.class);
        Assert.assertNotNull(bean);
        System.out.println(bean.fail());
    }
}
