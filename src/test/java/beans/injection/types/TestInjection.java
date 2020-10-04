package beans.injection.types;

import org.junit.Assert;
import org.junit.Test;
import template.AbstractTestSpringContext;

public class TestInjection extends AbstractTestSpringContext {

    @Test
    public void testInjectionDirect() {
        InjectionTarget bean = context.getBean(InjectionTarget.class);
        Assert.assertNotNull(bean);
        Assert.assertTrue(bean.isConstructorUsedInInjection());
        Assert.assertTrue(bean.isSetterUsedInInjection());

        Assert.assertNotNull(bean.getConstructorDependency());
        Assert.assertSame(ConstructorDependency.class, bean.getConstructorDependency().getClass());
        Assert.assertNotNull(bean.getFieldDependency());
        Assert.assertSame(FieldDependency.class, bean.getFieldDependency().getClass());
        Assert.assertNotNull(bean.getSetterDependency());
        Assert.assertSame(SetterDependency.class, bean.getSetterDependency().getClass());
    }

    @Test
    public void testAutomaticInjectionThroughConstructor() {
        ConstructorInjectionTargetAutomaticallyInjected bean = context.getBean(ConstructorInjectionTargetAutomaticallyInjected.class);
        Assert.assertNotNull(bean);
        Assert.assertTrue(bean.isConstructorUsedInInjection());

        Assert.assertNotNull(bean.getConstructorDependency());
        Assert.assertSame(ConstructorDependency.class, bean.getConstructorDependency().getClass());
    }

}
