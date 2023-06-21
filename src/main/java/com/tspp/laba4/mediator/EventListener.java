package com.tspp.laba4.mediator;

public interface EventListener<T extends Event> {
  void onEvent(T event);
}

