package com.tspp.laba4.decorator;


public class ClientRateLimitDecorator implements Client {

  private static final long CALL_INTERVAL = 60000;
  private static final int MAX_CALLS_PER_INTERVAL = 10;

  private Client client;
  private int counter = 0;
  private long startedAtTimestamp;

  public ClientRateLimitDecorator(Client client) {
    this.client = client;
    this.startedAtTimestamp = System.currentTimeMillis();
  }

  @Override
  public String getId() {
    return client.getId();
  }

  @Override
  public String getContent(String id) {
    if (!canMakeMethodCall()) {
      System.out.println(System.currentTimeMillis());
      throw new RuntimeException("The number of calls per minute limit has been exceeded");
    }

    updateMethodCallTimestamp();
    return client.getContent(id);
  }

  private boolean canMakeMethodCall() {
    long currentTimestamp = System.currentTimeMillis();

    return counter < MAX_CALLS_PER_INTERVAL || (currentTimestamp - startedAtTimestamp) > CALL_INTERVAL;
  }

  private void updateMethodCallTimestamp() {
    if (counter == 10) {
      counter = 0;
      startedAtTimestamp = System.currentTimeMillis();
    }
    counter++;
  }
}
