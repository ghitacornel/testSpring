package beans.factories;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import template.AbstractTestSpringContext;

public class TestFactoriesPrototypeLifeCycle extends AbstractTestSpringContext {

    @Test
    public void testLifecyclePrototype() {

        PrototypeProduct bean = context.getBean(PrototypeProduct.class);
        Assertions.assertNotNull(bean);
        Assertions.assertTrue(bean.postConstructCalled);
        Assertions.assertFalse(bean.preDestroyCalled);

        // destroy the container
        context.close();

        Assertions.assertTrue(bean.postConstructCalled);


        // even after the container is destroyed the pre destroy event is not triggered
        // this behavior occurs because this bean is no longer maintained by the container once produced and delivered

        Assertions.assertFalse(bean.preDestroyCalled);

    }

}
