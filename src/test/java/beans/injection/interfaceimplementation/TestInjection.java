package beans.injection.interfaceimplementation;

import org.junit.jupiter.api.Test;
import template.AbstractTestSpringContext;

import static org.junit.jupiter.api.Assertions.*;

public class TestInjection extends AbstractTestSpringContext {

    @Test
    public void testInjectionInterfaceImplementation() {
        IITarget target = context.getBean(IITarget.class);

        assertNotNull(target);
        assertNotNull(target.directSource);
        assertNotNull(target.sourceInterface);

        System.out.println(target.directSource.getClass());
        System.out.println(target.sourceInterface.getClass());

        assertNotEquals(DirectSource.class, target.directSource.getClass());
        assertTrue(DirectSource.class.isAssignableFrom(target.directSource.getClass()));

        assertNotEquals(Source.class, target.sourceInterface.getClass());
        assertNotEquals(SourceInterface.class, target.sourceInterface.getClass());
        assertTrue(Source.class.isAssignableFrom(target.sourceInterface.getClass()));
        assertTrue(SourceInterface.class.isAssignableFrom(target.sourceInterface.getClass()));

    }

}
