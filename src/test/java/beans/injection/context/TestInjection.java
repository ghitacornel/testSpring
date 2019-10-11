package beans.injection.context;

import org.junit.Assert;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import template.AbstractTestSpringContext;

public class TestInjection extends AbstractTestSpringContext {

    @Test
    public void testInjectionContext() {
        BeanWithBeanContainerReferenceInjected bean = context.getBean(BeanWithBeanContainerReferenceInjected.class);
        Assert.assertNotNull(bean);
        Assert.assertNotNull(bean.getContext());
        Assert.assertTrue(ApplicationContext.class.isAssignableFrom(bean.getContext().getClass()));
    }

}
