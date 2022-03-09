package beans.factories;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import template.AbstractTestSpringContext;

public class TestFactoriesInjection extends AbstractTestSpringContext {

    @Test
    public void testInjection() {
        FactoryInjectedTarget bean = context.getBean(FactoryInjectedTarget.class);
        Assertions.assertNotNull(bean);
        Assertions.assertNotNull(bean.factory);
        Assertions.assertNotNull(bean.singletonProduct);
        Assertions.assertNotNull(bean.singletonProduct.component);
        Assertions.assertNotNull(bean.prototypeProduct);
        Assertions.assertNotNull(bean.prototypeProduct.component);
    }
}
