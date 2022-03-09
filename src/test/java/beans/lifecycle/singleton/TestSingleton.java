package beans.lifecycle.singleton;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import template.AbstractTestSpringContext;

public class TestSingleton extends AbstractTestSpringContext {

    @Test
    public void testLifecycle() {

        SingletonWithLifeCycleBean bean = context.getBean(SingletonWithLifeCycleBean.class);
        Assertions.assertNotNull(bean);
        Assertions.assertTrue(bean.isPostConstructCalled);
        Assertions.assertFalse(bean.isPreDestroyCalled);

        // destroy the container
        context.close();

        Assertions.assertTrue(bean.isPostConstructCalled);
        Assertions.assertTrue(bean.isPreDestroyCalled);

    }

}
