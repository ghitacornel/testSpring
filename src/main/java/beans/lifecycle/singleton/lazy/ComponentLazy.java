package beans.lifecycle.singleton.lazy;

import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Component;

@Lazy
@Component
public class ComponentLazy {

    public ComponentLazy() {
        System.err.println(this + " constructed");
    }

    public void trigger() {
        System.err.println(this + " triggered");
    }
}
