package beans.injection.discriminator;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * a bean with dependencies. note that private dependencies are resolved even without setters.
 * Created by Cornel on 30.10.2015.
 */
@Component
public class BeanWithManyDependencies {

    @Type1
    @Autowired
    private Dependency dependency1;

    @Type2
    @Autowired
    private Dependency dependency2;

    public boolean areDependenciesResolved() {

        if (dependency1 == null) return false;
        if (!dependency1.execute().equals(dependency1 + " executed")) {
            throw new RuntimeException("dependency1 not resolved as expected");
        }

        if (dependency2 == null) return false;
        if (!dependency2.execute().equals(dependency2 + " executed")) {
            throw new RuntimeException("dependency2 not resolved as expected");
        }

        return true;
    }


}
