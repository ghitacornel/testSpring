package beans.injection.context;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.context.ApplicationContext;
import template.AbstractTestSpringContext;

public class TestInjection extends AbstractTestSpringContext {

    @Test
    public void testInjectionContext() {
        BeanWithBeanContainerReferenceInjected bean = context.getBean(BeanWithBeanContainerReferenceInjected.class);
        Assertions.assertNotNull(bean);
        Assertions.assertNotNull(bean.getContext());
        Assertions.assertTrue(ApplicationContext.class.isAssignableFrom(bean.getContext().getClass()));
    }

}
