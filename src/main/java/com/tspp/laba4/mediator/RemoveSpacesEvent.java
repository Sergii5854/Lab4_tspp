package com.tspp.laba4.mediator;

public class RemoveSpacesEvent implements Event {
  private String input;

  RemoveSpacesEvent(String input) {
    this.input = input;
  }

  String getInput() {
    return input;
  }
}
