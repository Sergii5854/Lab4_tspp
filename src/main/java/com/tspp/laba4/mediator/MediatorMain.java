package com.tspp.laba4.mediator;

import java.util.Scanner;

public class MediatorMain {
  public static void main(String[] args) {
    Mediator mediator = new Mediator();
    Scanner scanner = new Scanner(System.in);

    ReverseListener reverseListener = new ReverseListener();
    RemoveSpacesListener removeSpacesListener = new RemoveSpacesListener();

    mediator.subscribe(ReverseEvent.class, reverseListener);
    mediator.subscribe(RemoveSpacesEvent.class, removeSpacesListener);

    String input = scanner.nextLine();

    mediator.publish(new ReverseEvent(input));
    mediator.publish(new RemoveSpacesEvent(input));
  }
}
