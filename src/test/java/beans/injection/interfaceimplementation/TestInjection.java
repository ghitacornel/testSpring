package beans.injection.interfaceimplementation;

import org.junit.Assert;
import org.junit.Test;
import template.AbstractTestSpringContext;

public class TestInjection extends AbstractTestSpringContext {

    @Test
    public void testInjection() {
        IITarget target = context.getBean(IITarget.class);

        Assert.assertNotNull(target);
        Assert.assertNotNull(target.directSource);
        Assert.assertNotNull(target.sourceInterface);

        System.out.println(target.directSource.getClass());
        System.out.println(target.sourceInterface.getClass());

        Assert.assertNotEquals(IIDirectSource.class, target.directSource.getClass());
        Assert.assertTrue(IIDirectSource.class.isAssignableFrom(target.directSource.getClass()));

        Assert.assertNotEquals(IISource.class, target.sourceInterface.getClass());
        Assert.assertNotEquals(IISourceInterface.class, target.sourceInterface.getClass());
        Assert.assertTrue(IISource.class.isAssignableFrom(target.sourceInterface.getClass()));
        Assert.assertTrue(IISourceInterface.class.isAssignableFrom(target.sourceInterface.getClass()));

    }

}
