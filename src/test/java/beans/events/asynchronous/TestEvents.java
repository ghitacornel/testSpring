package beans.events.asynchronous;

import beans.events.CustomSpringEvent;
import beans.events.EventPublisher;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.scheduling.concurrent.ThreadPoolTaskExecutor;
import template.AbstractTestSpringContext;

import java.util.HashSet;
import java.util.Set;

public class TestEvents extends AbstractTestSpringContext {

    @Test
    public void testAsynchronousProducerConsumer() {

        EventPublisher publisher = context.getBean(EventPublisher.class);
        Assertions.assertNotNull(publisher);
        new Thread(() -> publisher.publishEvent("event message 1")).start();
        new Thread(() -> publisher.publishEvent("event message 2")).start();

        // force wait in order to allow processing of messages
        // XXX sleep here does not guarantee test will pass since processing of messages might take longer
        // XXX usually we get lucky
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            throw new RuntimeException("cannot sleep", e);
        }

        // force closing of executor in order to force event processing
        ThreadPoolTaskExecutor executor = context.getBean(ThreadPoolTaskExecutor.class);
        executor.shutdown();

        AsynchronousEventListener listener = context.getBean(AsynchronousEventListener.class);
        Assertions.assertNotNull(listener);
        Assertions.assertEquals(2, listener.getProcessedEvents().size());
        Assertions.assertEquals(publisher, listener.getProcessedEvents().get(0).getSource());
        Assertions.assertEquals(publisher, listener.getProcessedEvents().get(1).getSource());

        // order of messages is not guaranteed
        Set<String> messages = new HashSet<>();
        for (CustomSpringEvent event : listener.getProcessedEvents()) {
            messages.add(event.getMessage());
        }
        Assertions.assertTrue(messages.contains("event message 1"));
        Assertions.assertTrue(messages.contains("event message 2"));

        // XXX we expect also that 2 different threads processed the 2 different events
        // XXX usually we get lucky
        Assertions.assertEquals(2, listener.getProcessingThreads().size());

    }

}
