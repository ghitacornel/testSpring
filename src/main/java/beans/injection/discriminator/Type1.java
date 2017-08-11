package beans.injection.discriminator;

import org.springframework.beans.factory.annotation.Qualifier;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

/**
 * Created by Cornel on 10.12.2015.
 */
@Retention(RetentionPolicy.RUNTIME)
@Qualifier
public @interface Type1 {
}
