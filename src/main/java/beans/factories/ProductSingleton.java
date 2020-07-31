package beans.factories;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

public class ProductSingleton {

    public boolean createdByFactory = false;

    public boolean postConstructCalled = false;
    public boolean preDestroyCalled = false;

    public SingletonProductComponent component;

    @PostConstruct
    private void postConstruct() {
        postConstructCalled = true;
    }

    @PreDestroy
    private void preDestroy() {
        preDestroyCalled = true;
    }

}
