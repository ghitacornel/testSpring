package beans.events.synchronous;

import beans.events.CustomSpringEvent;
import org.springframework.context.ApplicationListener;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class SynchronousEventListener implements ApplicationListener<CustomSpringEvent> {

    @Override
    public void onApplicationEvent(CustomSpringEvent event) {
        processedEvents.add(event);
        processedByThreads.add(Thread.currentThread());
    }

    // for test purpose
    final public List<CustomSpringEvent> processedEvents = new ArrayList<>();
    final public List<Thread> processedByThreads = new ArrayList<>();

}