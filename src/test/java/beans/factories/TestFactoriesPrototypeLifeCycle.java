package beans.factories;

import org.junit.jupiter.api.Test;
import template.AbstractTestSpringContext;

import static org.junit.jupiter.api.Assertions.*;

public class TestFactoriesPrototypeLifeCycle extends AbstractTestSpringContext {

    @Test
    public void testLifecyclePrototype() {

        PrototypeProduct bean = context.getBean(PrototypeProduct.class);
        assertNotNull(bean);
        assertTrue(bean.postConstructCalled);
        assertFalse(bean.preDestroyCalled);

        // destroy the container
        context.close();

        assertTrue(bean.postConstructCalled);


        // even after the container is destroyed the pre destroy event is not triggered
        // this behavior occurs because this bean is no longer maintained by the container once produced and delivered

        assertFalse(bean.preDestroyCalled);

    }

}
