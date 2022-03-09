package beans.injection.profiles;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit.jupiter.SpringExtension;

@ExtendWith(SpringExtension.class)
@ContextConfiguration(locations = {"classpath:spring-beans.xml"})
@ActiveProfiles({"profile 1"})
public class TestInjectionProfile1 {

    @Autowired
    BeanWithProfileDependency bean;

    @Test
    public void testInjectionProfiles() {
        Assertions.assertNotNull(bean);
        Assertions.assertNotNull(bean.getProfileDependency());
        Assertions.assertSame(ProfileDependency1.class, bean.getProfileDependency().getClass());
    }

}
