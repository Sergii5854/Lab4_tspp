package com.tspp.laba4.abstractFactory;

public interface Deserializer {
  <T> T deserialize(String data, Class<T> type);
}
