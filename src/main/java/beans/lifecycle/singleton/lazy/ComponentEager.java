package beans.lifecycle.singleton.lazy;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Component;

@Component
public class ComponentEager {

    @Lazy
    @Autowired
    private ComponentLazy componentLazy;

    public void doSomething() {
        System.err.println(this + " invoked");
        componentLazy.trigger();
    }
}
