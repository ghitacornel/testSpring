package beans.scopes.prototype;

import org.junit.jupiter.api.Test;
import template.AbstractTestSpringContext;

import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertNotSame;

public class TestPrototype extends AbstractTestSpringContext {

    @Test
    public void testPrototype() {

        PrototypeBean bean1 = context.getBean(PrototypeBean.class);
        assertNotNull(bean1);

        PrototypeBean bean2 = context.getBean(PrototypeBean.class);
        assertNotNull(bean2);

        // for different requests different bean instances are returned
        assertNotSame(bean1, bean2);

    }
}
