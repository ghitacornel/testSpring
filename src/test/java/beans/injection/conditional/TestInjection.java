package beans.injection.conditional;

import org.junit.jupiter.api.Test;
import template.AbstractTestSpringContext;

import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertSame;

public class TestInjection extends AbstractTestSpringContext {

    @Test
    public void testInjectionConditional() {
        BeanWithConditionalDependency bean = context.getBean(BeanWithConditionalDependency.class);
        assertNotNull(bean);
        assertNotNull(bean.getConditionalDependency());
        assertSame(ConditionalDependency2.class, bean.getConditionalDependency().getClass());
    }

}
