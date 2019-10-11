package beans.injection.circularconstructor;

import org.springframework.beans.factory.annotation.Autowired;

public class C {

    A a;

    public C(@Autowired A a) {
        this.a = a;
    }
}
