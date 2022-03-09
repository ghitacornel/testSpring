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

        SynchronousEventListener listener = context.getBean(SynchronousEventListener.class);
        Assertions.assertNotNull(listener);
        Assertions.assertEquals(2, listener.getProcessedEvents().size());
        Assertions.assertEquals("event message 1", listener.getProcessedEvents().get(0).getMessage());
        Assertions.assertEquals(publisher, listener.getProcessedEvents().get(0).getSource());
        Assertions.assertEquals("event message 2", listener.getProcessedEvents().get(1).getMessage());
        Assertions.assertEquals(publisher, listener.getProcessedEvents().get(1).getSource());

    }

}
