package com.tspp.laba4.mediator;

public class ReverseListener implements EventListener<ReverseEvent> {
  @Override
  public void onEvent(ReverseEvent event) {
    String reversed = new StringBuilder(event.getInput()).reverse().toString();
    System.out.println("Reversed: " + reversed);
  }
}
