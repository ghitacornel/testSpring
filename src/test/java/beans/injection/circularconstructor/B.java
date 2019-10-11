package beans.injection.circularconstructor;

import org.springframework.beans.factory.annotation.Autowired;

public class B {

    public B(@Autowired C c) {
        this.c = c;
    }

    C c;

}
