package beans.injection.profiles;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {"classpath:spring-beans.xml"})
@ActiveProfiles({"profile 1"})
public class TestInjectionProfile1 {

    @Autowired
    BeanWithProfileDependency bean;

    @Test
    public void testInjectionProfiles() {
        Assert.assertNotNull(bean);
        Assert.assertNotNull(bean.getProfileDependency());
        Assert.assertSame(ProfileDependency1.class, bean.getProfileDependency().getClass());
    }

}
