package beans.scopes.prototype;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import template.AbstractTestSpringContext;

public class TestPrototype extends AbstractTestSpringContext {

    @Test
    public void testPrototype() {

        PrototypeBean bean1 = context.getBean(PrototypeBean.class);
        Assertions.assertNotNull(bean1);

        PrototypeBean bean2 = context.getBean(PrototypeBean.class);
        Assertions.assertNotNull(bean2);

        // for different requests different bean instances are returned
        Assertions.assertNotSame(bean1, bean2);

    }
}
