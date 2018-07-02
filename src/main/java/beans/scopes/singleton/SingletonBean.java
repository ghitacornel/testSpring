package beans.scopes.singleton;

import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

/**
 * all Spring beans are singletons by default
 */
@Component
public class SingletonBean {
}
