package beans.lifecycle.singleton.lazy;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import template.AbstractTestSpringContext;

public class TestLazy extends AbstractTestSpringContext {

    @Test
    public void testLifecycle() {

        ComponentEager bean = context.getBean(ComponentEager.class);
        System.err.println("marker");
        Assertions.assertNotNull(bean);
        bean.doSomething();

    }

}
