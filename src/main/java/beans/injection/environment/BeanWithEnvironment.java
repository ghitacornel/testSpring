package beans.injection.environment;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.stereotype.Component;

@Component
public class BeanWithEnvironment {

    @Autowired
    Environment environment;

    public Environment getEnvironment() {
        return environment;
    }
}
