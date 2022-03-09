package beans.injection.types;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import template.AbstractTestSpringContext;

public class TestInjection extends AbstractTestSpringContext {

    @Test
    public void testInjectionDirect() {
        InjectionTarget bean = context.getBean(InjectionTarget.class);
        Assertions.assertNotNull(bean);
        Assertions.assertTrue(bean.isConstructorUsedInInjection());
        Assertions.assertTrue(bean.isSetterUsedInInjection());

        Assertions.assertNotNull(bean.getConstructorDependency());
        Assertions.assertSame(ConstructorDependency.class, bean.getConstructorDependency().getClass());
        Assertions.assertNotNull(bean.getFieldDependency());
        Assertions.assertSame(FieldDependency.class, bean.getFieldDependency().getClass());
        Assertions.assertNotNull(bean.getSetterDependency());
        Assertions.assertSame(SetterDependency.class, bean.getSetterDependency().getClass());
    }

    @Test
    public void testAutomaticInjectionThroughConstructor() {
        ConstructorInjectionTargetAutomaticallyInjected bean = context.getBean(ConstructorInjectionTargetAutomaticallyInjected.class);
        Assertions.assertNotNull(bean);
        Assertions.assertTrue(bean.isConstructorUsedInInjection());

        Assertions.assertNotNull(bean.getConstructorDependency());
        Assertions.assertSame(ConstructorDependency.class, bean.getConstructorDependency().getClass());
    }

}
