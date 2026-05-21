package beans.injection.qualifier;

import org.junit.jupiter.api.Test;
import template.AbstractTestSpringContext;

import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertSame;

public class TestInjection extends AbstractTestSpringContext {

    @Test
    public void testInjectionWithInjectionDiscriminatorsField() {
        QualifierInjectionTargetField bean = context.getBean(QualifierInjectionTargetField.class);
        assertNotNull(bean);
        assertNotNull(bean.getComponent1());
        assertSame(QualifierComponent1.class, bean.getComponent1().getClass());
        assertNotNull(bean.getComponent2());
        assertSame(QualifierComponent2.class, bean.getComponent2().getClass());
    }

    @Test
    public void testInjectionWithInjectionDiscriminatorsConstructor() {
        QualifierInjectionTargetConstructor bean = context.getBean(QualifierInjectionTargetConstructor.class);
        assertNotNull(bean);
        assertNotNull(bean.getComponent1());
        assertSame(QualifierComponent1.class, bean.getComponent1().getClass());
        assertNotNull(bean.getComponent2());
        assertSame(QualifierComponent2.class, bean.getComponent2().getClass());
    }

    @Test
    public void testInjectionWithInjectionDiscriminatorsSetter() {
        QualifierInjectionTargetSetter bean = context.getBean(QualifierInjectionTargetSetter.class);
        assertNotNull(bean);
        assertNotNull(bean.getComponent1());
        assertSame(QualifierComponent1.class, bean.getComponent1().getClass());
        assertNotNull(bean.getComponent2());
        assertSame(QualifierComponent2.class, bean.getComponent2().getClass());
    }
}
