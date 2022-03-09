package beans.factories;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import template.AbstractTestSpringContext;

public class TestFactoriesSingletonLifeCycle extends AbstractTestSpringContext {

    @Test
    public void testLifecycleSingleton() {

        SingletonProduct bean = context.getBean(SingletonProduct.class);
        Assertions.assertNotNull(bean);
        Assertions.assertTrue(bean.postConstructCalled);
        Assertions.assertFalse(bean.preDestroyCalled);

        // destroy the container
        context.close();

        Assertions.assertTrue(bean.postConstructCalled);
        Assertions.assertTrue(bean.preDestroyCalled);

    }
}
