package template;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public abstract class AbstractTestSpringContext {

    /**
     * bean container
     */
    protected static ClassPathXmlApplicationContext context;

    @BeforeAll
    public static void before() {
        context = new ClassPathXmlApplicationContext("spring-beans.xml");
    }

    @AfterAll
    public static void after() {
        context.close();
    }

}
