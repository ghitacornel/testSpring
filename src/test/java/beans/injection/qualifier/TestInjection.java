package beans.injection.qualifier;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import template.AbstractTestSpringContext;

public class TestInjection extends AbstractTestSpringContext {

    @Test
    public void testInjectionWithInjectionDiscriminatorsField() {
        QualifierInjectionTargetField bean = context.getBean(QualifierInjectionTargetField.class);
        Assertions.assertNotNull(bean);
        Assertions.assertNotNull(bean.getComponent1());
        Assertions.assertSame(QualifierComponent1.class, bean.getComponent1().getClass());
        Assertions.assertNotNull(bean.getComponent2());
        Assertions.assertSame(QualifierComponent2.class, bean.getComponent2().getClass());
    }

    @Test
    public void testInjectionWithInjectionDiscriminatorsConstructor() {
        QualifierInjectionTargetConstructor bean = context.getBean(QualifierInjectionTargetConstructor.class);
        Assertions.assertNotNull(bean);
        Assertions.assertNotNull(bean.getComponent1());
        Assertions.assertSame(QualifierComponent1.class, bean.getComponent1().getClass());
        Assertions.assertNotNull(bean.getComponent2());
        Assertions.assertSame(QualifierComponent2.class, bean.getComponent2().getClass());
    }

    @Test
    public void testInjectionWithInjectionDiscriminatorsSetter() {
        QualifierInjectionTargetSetter bean = context.getBean(QualifierInjectionTargetSetter.class);
        Assertions.assertNotNull(bean);
        Assertions.assertNotNull(bean.getComponent1());
        Assertions.assertSame(QualifierComponent1.class, bean.getComponent1().getClass());
        Assertions.assertNotNull(bean.getComponent2());
        Assertions.assertSame(QualifierComponent2.class, bean.getComponent2().getClass());
    }
}
