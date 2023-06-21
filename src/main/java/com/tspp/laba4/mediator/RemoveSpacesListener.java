package com.tspp.laba4.mediator;

public class RemoveSpacesListener implements EventListener<RemoveSpacesEvent> {
  @Override
  public void onEvent(RemoveSpacesEvent event) {
    String withoutSpaces = event.getInput().replaceAll("\\s+", "");
    System.out.println("Without spaces: " + withoutSpaces);
  }
}
