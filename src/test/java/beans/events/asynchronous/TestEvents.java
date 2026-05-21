package beans.events.asynchronous;

import beans.events.CustomSpringEvent;
import beans.events.EventPublisher;
import org.junit.jupiter.api.Test;
import org.springframework.scheduling.concurrent.ThreadPoolTaskExecutor;
import template.AbstractTestSpringContext;

import java.util.HashSet;
import java.util.Set;

import static org.junit.jupiter.api.Assertions.*;

public class TestEvents extends AbstractTestSpringContext {

    @Test
    public void testAsynchronousProducerConsumer() {

        EventPublisher publisher = context.getBean(EventPublisher.class);
        assertNotNull(publisher);
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

        {// verify listener 1
            AsynchronousEventListener1 listener = context.getBean(AsynchronousEventListener1.class);
            assertNotNull(listener);
            assertEquals(2, listener.getProcessedEvents().size());
            assertSame(publisher, listener.getProcessedEvents().get(0).getSource());
            assertSame(publisher, listener.getProcessedEvents().get(1).getSource());

            // order of messages is not guaranteed
            Set<String> messages = new HashSet<>();
            for (CustomSpringEvent event : listener.getProcessedEvents()) {
                messages.add(event.getMessage());
            }
            assertTrue(messages.contains("event message 1"));
            assertTrue(messages.contains("event message 2"));

            // XXX we expect also that 2 different threads processed the 2 different events
            // XXX usually we get lucky
            assertEquals(2, listener.getProcessingThreads().size());
        }

        {// verify listener 2
            AsynchronousEventListener2 listener = context.getBean(AsynchronousEventListener2.class);
            assertNotNull(listener);
            assertEquals(2, listener.getProcessedEvents().size());
            assertSame(publisher, listener.getProcessedEvents().get(0).getSource());
            assertSame(publisher, listener.getProcessedEvents().get(1).getSource());

            // order of messages is not guaranteed
            Set<String> messages = new HashSet<>();
            for (CustomSpringEvent event : listener.getProcessedEvents()) {
                messages.add(event.getMessage());
            }
            assertTrue(messages.contains("event message 1"));
            assertTrue(messages.contains("event message 2"));

            // XXX we expect also that 2 different threads processed the 2 different events
            // XXX usually we get lucky
            assertEquals(2, listener.getProcessingThreads().size());
        }

    }

}
