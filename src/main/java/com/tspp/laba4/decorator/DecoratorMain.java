package com.tspp.laba4.decorator;

public class DecoratorMain {

  public static void main(String[] args) throws InterruptedException {

    Client client = new ClientImpl();
    Client rateLimitedClient = new ClientRateLimitDecorator(client);

    System.out.println(System.currentTimeMillis());
    for (int i = 0; i < 20; i++) {
      System.out.println(rateLimitedClient.getContent("id"));
      //Thread.sleep(10000);
    }

  }

}
