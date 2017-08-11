package test.beans.scopes.singleton;

import beans.scopes.singleton.Singleton;
import org.junit.Assert;
import org.junit.Test;
import test.AbstractTestSpringContext;

public class TestSingleton extends AbstractTestSpringContext {

    @Test
    public void testSingleton() {
        Singleton singleton1 = context.getBean(Singleton.class);
        Assert.assertNotNull(singleton1);
        Singleton singleton2 = context.getBean(Singleton.class);
        Assert.assertNotNull(singleton2);
        Assert.assertTrue(singleton1 == singleton2);
    }

}
