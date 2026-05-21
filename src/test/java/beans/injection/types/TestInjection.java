package beans.injection.types;

import org.junit.jupiter.api.Test;
import template.AbstractTestSpringContext;

import static org.junit.jupiter.api.Assertions.*;

public class TestInjection extends AbstractTestSpringContext {

    @Test
    public void testInjectionDirect() {
        InjectionTarget bean = context.getBean(InjectionTarget.class);
        assertNotNull(bean);
        assertTrue(bean.isConstructorUsedInInjection());
        assertTrue(bean.isSetterUsedInInjection());

        assertNotNull(bean.getConstructorDependency());
        assertSame(ConstructorDependency.class, bean.getConstructorDependency().getClass());
        assertNotNull(bean.getFieldDependency());
        assertSame(FieldDependency.class, bean.getFieldDependency().getClass());
        assertNotNull(bean.getSetterDependency());
        assertSame(SetterDependency.class, bean.getSetterDependency().getClass());
    }

    @Test
    public void testAutomaticInjectionThroughConstructor() {
        ConstructorInjectionTargetAutomaticallyInjected bean = context.getBean(ConstructorInjectionTargetAutomaticallyInjected.class);
        assertNotNull(bean);
        assertTrue(bean.isConstructorUsedInInjection());

        assertNotNull(bean.getConstructorDependency());
        assertSame(ConstructorDependency.class, bean.getConstructorDependency().getClass());
    }

}
