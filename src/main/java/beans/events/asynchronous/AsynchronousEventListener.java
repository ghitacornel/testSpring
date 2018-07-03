package beans.events.asynchronous;

import beans.events.CustomSpringEvent;
import org.springframework.context.event.EventListener;
import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class AsynchronousEventListener {

    /**
     * Remember to enable asynchronous method execution in your application with @EnableAsync
     */
    @Async
    @EventListener
    public void processEvent(CustomSpringEvent event) {
        processedEvents.add(event);
        processingThreads.add(Thread.currentThread());
    }

    final private List<CustomSpringEvent> processedEvents = new ArrayList<>();
    final private List<Thread> processingThreads = new ArrayList<>();

    public List<CustomSpringEvent> getProcessedEvents() {
        return processedEvents;
    }


    public List<Thread> getProcessingThreads() {
        return processingThreads;
    }
}