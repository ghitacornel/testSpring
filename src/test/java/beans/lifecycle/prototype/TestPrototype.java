package beans.lifecycle.prototype;

import org.junit.jupiter.api.Test;
import template.AbstractTestSpringContext;

import static org.junit.jupiter.api.Assertions.*;

public class TestPrototype extends AbstractTestSpringContext {

    @Test
    public void testLifecycle() {

        PrototypeWithLifeCycleBean bean = context.getBean(PrototypeWithLifeCycleBean.class);
        assertNotNull(bean);
        assertTrue(bean.isPostConstructCalled);
        assertFalse(bean.isPreDestroyCalled);

        // destroy the container
        context.close();

        assertTrue(bean.isPostConstructCalled);

        //even after the container is destroyed the pre destroy event is not triggered
        //this behavior occurs because this bean is no longer maintained by the container once produced and delivered
        assertFalse(bean.isPreDestroyCalled);

    }

}
