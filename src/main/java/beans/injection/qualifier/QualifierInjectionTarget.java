package beans.injection.qualifier;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * A bean with many dependencies<br>
 * Note that private dependencies are resolved even without provided setters<br>
 * Note that some dependencies cannot be resolved without a discriminator
 */
@Component
public class QualifierInjectionTarget {

    @Qualifier1// specific discriminator is used for this dependency
    @Autowired
    private QualifierComponent component1;

    @Qualifier2// specific discriminator is used for this dependency
    @Autowired
    private QualifierComponent component2;

    public QualifierComponent getComponent1() {
        return component1;
    }

    public QualifierComponent getComponent2() {
        return component2;
    }
}
