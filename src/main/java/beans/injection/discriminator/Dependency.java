package beans.injection.discriminator;

public interface Dependency {

    default String execute() {
        return this + " executed";
    }

}
