package annotations;

import beans.scopes.singleton.SingletonBean;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class TestAnnotationContainerCreation {

    @Test
    public void testCreation() {
        ApplicationContext context = new AnnotationConfigApplicationContext(StartupConfiguration.class);
        SingletonBean bean = context.getBean(SingletonBean.class);
        Assertions.assertNotNull(bean);
    }
}
