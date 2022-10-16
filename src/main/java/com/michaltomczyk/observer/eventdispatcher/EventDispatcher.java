package com.michaltomczyk.observer.eventdispatcher;

public interface EventDispatcher {
    void notify(String event);
    void subscribe(String event, EventListener eventListener);
    void unsubscribe(String event, EventListener eventListener);
}
