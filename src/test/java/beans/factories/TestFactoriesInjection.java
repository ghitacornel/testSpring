package beans.factories;

import org.junit.jupiter.api.Test;
import template.AbstractTestSpringContext;

import static org.junit.jupiter.api.Assertions.assertNotNull;

public class TestFactoriesInjection extends AbstractTestSpringContext {

    @Test
    public void testInjection() {
        FactoryInjectedTarget bean = context.getBean(FactoryInjectedTarget.class);
        assertNotNull(bean);
        assertNotNull(bean.factory);
        assertNotNull(bean.singletonProduct);
        assertNotNull(bean.singletonProduct.component);
        assertNotNull(bean.prototypeProduct);
        assertNotNull(bean.prototypeProduct.component);
    }
}
