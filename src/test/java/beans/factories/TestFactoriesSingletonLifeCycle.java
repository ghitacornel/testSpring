package beans.factories;

import org.junit.jupiter.api.Test;
import template.AbstractTestSpringContext;

import static org.junit.jupiter.api.Assertions.*;

public class TestFactoriesSingletonLifeCycle extends AbstractTestSpringContext {

    @Test
    public void testLifecycleSingleton() {

        SingletonProduct bean = context.getBean(SingletonProduct.class);
        assertNotNull(bean);
        assertTrue(bean.postConstructCalled);
        assertFalse(bean.preDestroyCalled);

        // destroy the container
        context.close();

        assertTrue(bean.postConstructCalled);
        assertTrue(bean.preDestroyCalled);

    }
}
