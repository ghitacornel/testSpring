package beans.lifecycle.singleton.lazy;

import org.junit.jupiter.api.Test;
import template.AbstractTestSpringContext;

import static org.junit.jupiter.api.Assertions.assertNotNull;

public class TestLazy extends AbstractTestSpringContext {

    @Test
    public void testLifecycle() {

        ComponentEager bean = context.getBean(ComponentEager.class);
        System.err.println("marker");
        assertNotNull(bean);
        bean.doSomething();

    }

}
