package beans.events;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationEventPublisher;
import org.springframework.stereotype.Component;

/**
 * My simple producer of events
 */
@Component
public class EventPublisher {

    /**
     * Spring event firing mechanism
     */
    @Autowired
    private ApplicationEventPublisher containerPublisher;

    public void publishEvent(String message) {
        System.out.println("Publishing custom event with message : " + message);

        // I build my event
        CustomSpringEvent customSpringEvent = new CustomSpringEvent(this, message);

        // I fire my event
        containerPublisher.publishEvent(customSpringEvent);

    }

}
