package com.michaltomczyk.observer.eventdispatcher;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

import static org.mockito.Mockito.*;

public class EventDispatcherTest {
    private EventDispatcher eventDispatcher;

    @BeforeEach
    public void setUp(){
        this.eventDispatcher = new EventDispatcherImp();
    }

    @Test
    public void shouldNotifyListenersWhenEventIsDispatched(){
        EventListener listener1 = mock(EventListener.class);
        EventListener listener2 = mock(EventListener.class);

        this.eventDispatcher.subscribe("event", listener1);
        this.eventDispatcher.subscribe("event", listener2);

        this.eventDispatcher.notify("event");

        Mockito.verify(listener1, times(1)).update("event");
        Mockito.verify(listener2, times(1)).update("event");
    }

    @Test
    public void shouldNotNotifyObserversWhenTheyDontSubscribeDispatchedEvent(){
        EventListener listener = mock(EventListener.class);

        this.eventDispatcher.subscribe("event", listener);
        this.eventDispatcher.notify("event");

        this.eventDispatcher.unsubscribe("event", listener);
        this.eventDispatcher.notify("event");

        Mockito.verify(listener, times(1)).update("event");
    }

    @Test
    public void shouldUpdateEventListenersWithCorrectEventName(){
        EventListener listener = mock(EventListener.class);

        this.eventDispatcher.subscribe("event1", listener);
        this.eventDispatcher.subscribe("event2", listener);

        this.eventDispatcher.notify("event1");
        this.eventDispatcher.notify("event2");
        this.eventDispatcher.notify("event2");

        Mockito.verify(listener, times(1)).update("event1");
        Mockito.verify(listener, times(2)).update("event2");
    }
}
