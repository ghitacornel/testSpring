package beans.scopes.singleton;

import org.junit.Assert;
import org.junit.Test;
import template.AbstractTestSpringContext;

public class TestSingleton extends AbstractTestSpringContext {

    @Test
    public void testSingleton() {

        SingletonBean bean1 = context.getBean(SingletonBean.class);
        Assert.assertNotNull(bean1);

        SingletonBean bean2 = context.getBean(SingletonBean.class);
        Assert.assertNotNull(bean2);

        Assert.assertSame(bean1, bean2);
    }

}
