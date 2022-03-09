package beans.injection.conditional;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import template.AbstractTestSpringContext;

public class TestInjection extends AbstractTestSpringContext {

    @Test
    public void testInjectionConditional() {
        BeanWithConditionalDependency bean = context.getBean(BeanWithConditionalDependency.class);
        Assertions.assertNotNull(bean);
        Assertions.assertNotNull(bean.getConditionalDependency());
        Assertions.assertSame(ConditionalDependency2.class, bean.getConditionalDependency().getClass());
    }

}
