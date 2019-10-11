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
@ActiveProfiles({"profile 2"})
public class TestInjectionProfile2 {

    @Autowired
    BeanWithProfileDependency bean;

    @Test
    public void testInjectionProfiles() {
        Assert.assertNotNull(bean);
        Assert.assertNotNull(bean.getProfileDependency());
        Assert.assertSame(ProfileDependency2.class, bean.getProfileDependency().getClass());
    }

}
