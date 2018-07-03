package beans.events;

import org.springframework.context.ApplicationListener;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class EventListener implements ApplicationListener<CustomSpringEvent> {

    @Override
    public void onApplicationEvent(CustomSpringEvent event) {
        processedEvents.add(event);
    }

    final private List<CustomSpringEvent> processedEvents = new ArrayList<>();

    public List<CustomSpringEvent> getProcessedEvents() {
        return processedEvents;
    }

}