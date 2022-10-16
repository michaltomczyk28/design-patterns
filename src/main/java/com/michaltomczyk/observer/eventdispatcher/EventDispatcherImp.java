package com.michaltomczyk.observer.eventdispatcher;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class EventDispatcherImp implements EventDispatcher {
    private Map<String, ArrayList<EventListener>> subscribers = new HashMap<>();

    @Override
    public void notify(String event) {
        ArrayList<EventListener> eventListeners = subscribers.get(event);

        for(EventListener eventListener: eventListeners){
            eventListener.update(event);
        }
    }

    @Override
    public void subscribe(String event, EventListener eventListener){
        if(!subscribers.containsKey(event))
            subscribers.put(event, new ArrayList<>());

        ArrayList<EventListener> eventListeners = subscribers.get(event);
        eventListeners.add(eventListener);
    }

    @Override
    public void unsubscribe(String event, EventListener eventListener) {
        ArrayList<EventListener> eventListeners = subscribers.get(event);

        eventListeners.remove(eventListener);
    }
}
