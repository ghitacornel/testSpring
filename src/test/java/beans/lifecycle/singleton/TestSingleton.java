package beans.lifecycle.singleton;

import org.junit.jupiter.api.Test;
import template.AbstractTestSpringContext;

import static org.junit.jupiter.api.Assertions.*;

public class TestSingleton extends AbstractTestSpringContext {

    @Test
    public void testLifecycle() {

        SingletonWithLifeCycleBean bean = context.getBean(SingletonWithLifeCycleBean.class);
        assertNotNull(bean);
        assertTrue(bean.isPostConstructCalled);
        assertFalse(bean.isPreDestroyCalled);

        // destroy the container
        context.close();

        assertTrue(bean.isPostConstructCalled);
        assertTrue(bean.isPreDestroyCalled);

    }

}
