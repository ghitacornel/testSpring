package beans.events;

import org.springframework.context.ApplicationEvent;

/**
 * see it as a particular but simple POJO
 */
public class CustomSpringEvent extends ApplicationEvent {

    private String message;

    public CustomSpringEvent(Object source, String message) {
        super(source);
        this.message = message;
    }

    public String getMessage() {
        return message;
    }

}