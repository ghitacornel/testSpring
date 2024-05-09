package beans.events.synchronous;

import beans.events.EventPublisher;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import template.AbstractTestSpringContext;

public class TestEvents extends AbstractTestSpringContext {

    @Test
    public void testSynchronousProducerConsumer() {

        EventPublisher publisher = context.getBean(EventPublisher.class);
        Assertions.assertNotNull(publisher);
        publisher.publishEvent("event message 1");
        publisher.publishEvent("event message 2");

        {// check listener 1
            SynchronousEventListener1 listener = context.getBean(SynchronousEventListener1.class);
            Assertions.assertNotNull(listener);
            Assertions.assertEquals(2, listener.processedEvents.size());
            Assertions.assertEquals("event message 1", listener.processedEvents.get(0).getMessage());
            Assertions.assertEquals(publisher, listener.processedEvents.get(0).getSource());
            Assertions.assertEquals("event message 2", listener.processedEvents.get(1).getMessage());
            Assertions.assertEquals(publisher, listener.processedEvents.get(1).getSource());
            Assertions.assertEquals(2, listener.processedByThreads.size());
            Assertions.assertEquals(Thread.currentThread(), listener.processedByThreads.get(0));
            Assertions.assertEquals(Thread.currentThread(), listener.processedByThreads.get(1));
        }

        {// check listener 2
            SynchronousEventListener2 listener = context.getBean(SynchronousEventListener2.class);
            Assertions.assertNotNull(listener);
            Assertions.assertEquals(2, listener.processedEvents.size());
            Assertions.assertEquals("event message 1", listener.processedEvents.get(0).getMessage());
            Assertions.assertEquals(publisher, listener.processedEvents.get(0).getSource());
            Assertions.assertEquals("event message 2", listener.processedEvents.get(1).getMessage());
            Assertions.assertEquals(publisher, listener.processedEvents.get(1).getSource());
            Assertions.assertEquals(2, listener.processedByThreads.size());
            Assertions.assertEquals(Thread.currentThread(), listener.processedByThreads.get(0));
            Assertions.assertEquals(Thread.currentThread(), listener.processedByThreads.get(1));
        }

    }

}
