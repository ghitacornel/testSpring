package beans.injection.qualifier;

import org.springframework.stereotype.Component;

/**
 * A bean with many dependencies<br>
 * Note that some dependencies cannot be resolved without a discriminator
 */
@Component
public class QualifierInjectionTargetConstructor {

    private final QualifierComponent component1;
    private final QualifierComponent component2;

    public QualifierInjectionTargetConstructor(@Qualifier1 QualifierComponent component1, @Qualifier2 QualifierComponent component2) {
        this.component1 = component1;
        this.component2 = component2;
    }

    public QualifierComponent getComponent1() {
        return component1;
    }

    public QualifierComponent getComponent2() {
        return component2;
    }
}
