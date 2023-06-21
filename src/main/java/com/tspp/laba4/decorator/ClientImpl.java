package com.tspp.laba4.decorator;

public class ClientImpl implements Client {
  @Override
  public String getId() {
    return "id";
  }

  @Override
  public String getContent(String id) {
    return "content for id " + id;
  }
}
