package beans.injection.prototypeinsingleton;

import org.junit.jupiter.api.Test;
import template.AbstractTestSpringContext;

import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertSame;

public class TestInjection extends AbstractTestSpringContext {

    @Test
    public void testInjectionOfPrototypeInSingleton() {

        SpecialCaseSingleton bean1 = context.getBean(SpecialCaseSingleton.class);
        assertNotNull(bean1);
        assertNotNull(bean1.getPrototype());

        SpecialCaseSingleton bean2 = context.getBean(SpecialCaseSingleton.class);
        assertNotNull(bean2);
        assertNotNull(bean2.getPrototype());

        assertSame(bean1, bean2);

        // observe only 1 prototype is injected and only once in this singleton
        assertSame(bean1.getPrototype(), bean2.getPrototype());

    }

}
