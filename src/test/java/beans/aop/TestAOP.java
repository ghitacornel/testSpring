package beans.aop;

import beans.aop.beans.BeanAffectedByAspect;
import org.junit.jupiter.api.Test;
import template.AbstractTestSpringContext;

import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class TestAOP extends AbstractTestSpringContext {

    @Test
    public void test_AOP_OK() {
        BeanAffectedByAspect bean = context.getBean(BeanAffectedByAspect.class);
        assertNotNull(bean);
        System.out.println(bean.complexBusiness());

        // CHECK THE CONSOLE

    }

    @Test
    public void test_AOP_FAIL() {
        assertThrows(RuntimeException.class,
                () -> {
                    BeanAffectedByAspect bean = context.getBean(BeanAffectedByAspect.class);
                    assertNotNull(bean);
                    System.out.println(bean.complexBusinessThatThrowsException());
                });
    }
}
