package beans.scopes.prototype;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

/**
 * all beans are singletons by default hence the extra scope specified here
 */
@Component
@Scope("prototype")
public class Prototype {

    public boolean isInitCalled = false;

    @PostConstruct
    private void init() {
        isInitCalled = true;
    }

    @PreDestroy
    private void destroy() {
        // XXX check console for this message
        // this message WILL NOT BE printed before spring context is destroyed
        // prototype beans will not be managed by container once created
        System.out.println(this + " will be destroyed");
    }

}
