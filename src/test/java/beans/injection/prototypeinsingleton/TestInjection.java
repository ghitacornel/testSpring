package beans.injection.prototypeinsingleton;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import template.AbstractTestSpringContext;

public class TestInjection extends AbstractTestSpringContext {

    @Test
    public void testInjectionOfPrototypeInSingleton() {

        SpecialCaseSingleton bean1 = context.getBean(SpecialCaseSingleton.class);
        Assertions.assertNotNull(bean1);
        Assertions.assertNotNull(bean1.getPrototype());

        SpecialCaseSingleton bean2 = context.getBean(SpecialCaseSingleton.class);
        Assertions.assertNotNull(bean2);
        Assertions.assertNotNull(bean2.getPrototype());

        Assertions.assertSame(bean1, bean2);

        // observe only 1 prototype is injected and only once in this singleton
        Assertions.assertSame(bean1.getPrototype(), bean2.getPrototype());

    }

}
