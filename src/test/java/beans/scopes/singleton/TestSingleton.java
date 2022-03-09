package beans.scopes.singleton;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import template.AbstractTestSpringContext;

public class TestSingleton extends AbstractTestSpringContext {

    @Test
    public void testSingleton() {

        SingletonBean bean1 = context.getBean(SingletonBean.class);
        Assertions.assertNotNull(bean1);

        SingletonBean bean2 = context.getBean(SingletonBean.class);
        Assertions.assertNotNull(bean2);

        // for different requests same bean instance is returned
        Assertions.assertSame(bean1, bean2);
    }

}
