package beans.scopes.singleton;

import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

/**
 * all beans are singletons by default
 *
 * @author Cornel
 */
@Component
public class Singleton {

    public boolean isInitCalled = false;

    @PostConstruct
    private void init() {
        isInitCalled = true;
    }

    @PreDestroy
    private void destroy() {
        // XXX check console for this message
        // this message is printed before spring context is destroyed
        System.out.println(this + " will be destroyed");
    }

}
