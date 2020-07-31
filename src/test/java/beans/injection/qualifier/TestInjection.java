package beans.injection.qualifier;

import org.junit.Assert;
import org.junit.Test;
import template.AbstractTestSpringContext;

public class TestInjection extends AbstractTestSpringContext {

    @Test
    public void testInjectionWithInjectionDiscriminators() {
        QualifierInjectionTarget bean = context.getBean(QualifierInjectionTarget.class);
        Assert.assertNotNull(bean);
        Assert.assertNotNull(bean.getComponent1());
        Assert.assertSame(QualifierComponent1.class, bean.getComponent1().getClass());
        Assert.assertNotNull(bean.getComponent2());
        Assert.assertSame(QualifierComponent2.class, bean.getComponent2().getClass());
    }

}
