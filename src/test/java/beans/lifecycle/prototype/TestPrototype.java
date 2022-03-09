package beans.lifecycle.prototype;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import template.AbstractTestSpringContext;

public class TestPrototype extends AbstractTestSpringContext {

    @Test
    public void testLifecycle() {

        PrototypeWithLifeCycleBean bean = context.getBean(PrototypeWithLifeCycleBean.class);
        Assertions.assertNotNull(bean);
        Assertions.assertTrue(bean.isPostConstructCalled);
        Assertions.assertFalse(bean.isPreDestroyCalled);

        // destroy the container
        context.close();

        Assertions.assertTrue(bean.isPostConstructCalled);

        //even after the container is destroyed the pre destroy event is not triggered
        //this behavior occurs because this bean is no longer maintained by the container once produced and delivered
        Assertions.assertFalse(bean.isPreDestroyCalled);

    }

}
