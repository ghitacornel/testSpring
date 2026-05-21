package beans.factories;

import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;

public class SingletonProduct {

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
