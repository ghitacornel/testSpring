package beans.injection.notresolved;

import org.springframework.beans.factory.annotation.Autowired;

public class ClassWithNoResolvableDependency {

    @Autowired
    DependencyNotResolvable dependencyNotResolvable;

}
