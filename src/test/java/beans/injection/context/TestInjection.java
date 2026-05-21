package beans.injection.context;

import org.junit.jupiter.api.Test;
import org.springframework.context.ApplicationContext;
import template.AbstractTestSpringContext;

import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class TestInjection extends AbstractTestSpringContext {

    @Test
    public void testInjectionContext() {
        BeanWithBeanContainerReferenceInjected bean = context.getBean(BeanWithBeanContainerReferenceInjected.class);
        assertNotNull(bean);
        assertNotNull(bean.getContext());
        assertTrue(ApplicationContext.class.isAssignableFrom(bean.getContext().getClass()));
    }

}
