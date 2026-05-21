package beans.scopes.singleton;

import org.junit.jupiter.api.Test;
import template.AbstractTestSpringContext;

import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertSame;

public class TestSingleton extends AbstractTestSpringContext {

    @Test
    public void testSingleton() {

        SingletonBean bean1 = context.getBean(SingletonBean.class);
        assertNotNull(bean1);

        SingletonBean bean2 = context.getBean(SingletonBean.class);
        assertNotNull(bean2);

        // for different requests same bean instance is returned
        assertSame(bean1, bean2);
    }

}
