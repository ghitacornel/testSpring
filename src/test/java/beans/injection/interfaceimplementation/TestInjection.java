package beans.injection.interfaceimplementation;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import template.AbstractTestSpringContext;

public class TestInjection extends AbstractTestSpringContext {

    @Test
    public void testInjectionInterfaceImplementation() {
        IITarget target = context.getBean(IITarget.class);

        Assertions.assertNotNull(target);
        Assertions.assertNotNull(target.directSource);
        Assertions.assertNotNull(target.sourceInterface);

        System.out.println(target.directSource.getClass());
        System.out.println(target.sourceInterface.getClass());

        Assertions.assertNotEquals(DirectSource.class, target.directSource.getClass());
        Assertions.assertTrue(DirectSource.class.isAssignableFrom(target.directSource.getClass()));

        Assertions.assertNotEquals(Source.class, target.sourceInterface.getClass());
        Assertions.assertNotEquals(SourceInterface.class, target.sourceInterface.getClass());
        Assertions.assertTrue(Source.class.isAssignableFrom(target.sourceInterface.getClass()));
        Assertions.assertTrue(SourceInterface.class.isAssignableFrom(target.sourceInterface.getClass()));

    }

}
