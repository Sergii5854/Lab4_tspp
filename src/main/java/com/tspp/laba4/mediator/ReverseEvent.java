package com.tspp.laba4.mediator;

public class ReverseEvent implements Event {
  private String input;

  ReverseEvent(String input) {
    this.input = input;
  }

  String getInput() {
    return input;
  }
}
