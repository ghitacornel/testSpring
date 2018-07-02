package beans.scopes.prototype;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

/**
 * all Spring beans are singletons by default<br>
 * In order to mark them as prototype the extra @Scope marker is used
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
