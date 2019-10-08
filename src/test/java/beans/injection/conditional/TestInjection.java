package beans.injection.conditional;

import org.junit.Assert;
import org.junit.Test;
import template.AbstractTestSpringContext;

public class TestInjection extends AbstractTestSpringContext {

    @Test
    public void testInjectionConditional() {
        BeanWithConditionalDependency bean = context.getBean(BeanWithConditionalDependency.class);
        Assert.assertNotNull(bean);
        Assert.assertNotNull(bean.getConditionalDependency());
        Assert.assertSame(ConditionalDependency2.class, bean.getConditionalDependency().getClass());
    }

}
