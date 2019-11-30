package beans.injection.direct;

import org.junit.Assert;
import org.junit.Test;
import template.AbstractTestSpringContext;

public class TestInjection extends AbstractTestSpringContext {

    @Test
    public void testInjectionDirect() {
        BeanWithDifferentTypesOfDependencies bean = context.getBean(BeanWithDifferentTypesOfDependencies.class);
        Assert.assertNotNull(bean);
        Assert.assertTrue(bean.areDependenciesResolved());
    }

    @Test
    public void testAutomaticInjectionThroughConstructor(){
        BeanWithDependenciesInjectedAutomaticallyThroughConstructor bean = context.getBean(BeanWithDependenciesInjectedAutomaticallyThroughConstructor.class);
        Assert.assertNotNull(bean);
        Assert.assertNotNull(bean.getConstructorDependency());

    }

}
