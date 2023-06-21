package com.tspp.laba4.mediator;

import java.util.HashMap;
import java.util.Map;

public class Mediator {

  private final Map<Class<?>, EventListener<?>> listeners = new HashMap<>();

  <T extends Event> void subscribe(Class<T> eventType, EventListener<T> listener) {
    listeners.put(eventType, listener);
  }

  void publish(Event event) {
    EventListener listener = listeners.get(event.getClass());
    if (listener != null) {
      listener.onEvent(event);
    }
  }

}
