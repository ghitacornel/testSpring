package beans.scopes.prototype;

import org.junit.Assert;
import org.junit.Test;
import template.AbstractTestSpringContext;

public class TestPrototype extends AbstractTestSpringContext {

    @Test
    public void testPrototype() {

        PrototypeBean bean1 = context.getBean(PrototypeBean.class);
        Assert.assertNotNull(bean1);

        PrototypeBean bean2 = context.getBean(PrototypeBean.class);
        Assert.assertNotNull(bean2);

        Assert.assertNotSame(bean1, bean2);

    }
}
