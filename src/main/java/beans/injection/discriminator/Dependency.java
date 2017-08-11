package beans.injection.discriminator;

/**
 * Created by Cornel on 10.12.2015.
 */
public interface Dependency {

    default String execute() {
        return this + " executed";
    }

}
