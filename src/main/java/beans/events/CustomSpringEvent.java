package beans.events;

import org.springframework.context.ApplicationEvent;

/**
 * see it as a particular but simple POJO
 */
public class CustomSpringEvent extends ApplicationEvent {

    /**
     * payload of the event
     * the actual content of the event
     */
    private String message;

    public CustomSpringEvent(Object source, String message) {
        super(source);
        this.message = message;
    }

    public String getMessage() {
        return message;
    }

}