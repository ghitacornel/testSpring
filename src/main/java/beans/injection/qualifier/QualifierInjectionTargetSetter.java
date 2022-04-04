package beans.injection.qualifier;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * A bean with many dependencies<br>
 * Note that some dependencies cannot be resolved without a discriminator
 */
@Component
public class QualifierInjectionTargetSetter {

    private QualifierComponent component1;
    private QualifierComponent component2;

    public QualifierComponent getComponent1() {
        return component1;
    }

    @Autowired
    @Qualifier1
    public void setComponent1(QualifierComponent component1) {
        this.component1 = component1;
    }

    public QualifierComponent getComponent2() {
        return component2;
    }

    @Autowired
    @Qualifier2
    public void setComponent2(QualifierComponent component2) {
        this.component2 = component2;
    }
}
