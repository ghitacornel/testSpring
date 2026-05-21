package beans.injection.profiles;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit.jupiter.SpringExtension;

import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertSame;

@ExtendWith(SpringExtension.class)
@ContextConfiguration(locations = {"classpath:spring-beans.xml"})
@ActiveProfiles({"profile 2"})
public class TestInjectionProfile2 {

    @Autowired
    BeanWithProfileDependency bean;

    @Test
    public void testInjectionProfiles() {
        assertNotNull(bean);
        assertNotNull(bean.getProfileDependency());
        assertSame(ProfileDependency2.class, bean.getProfileDependency().getClass());
    }

}
