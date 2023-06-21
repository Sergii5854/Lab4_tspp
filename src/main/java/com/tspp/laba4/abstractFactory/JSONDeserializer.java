package com.tspp.laba4.abstractFactory;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

public class JSONDeserializer implements Deserializer {

  ObjectMapper objectMapper = new ObjectMapper();

  @Override
  public <T> T deserialize(String data, Class<T> type) {
    try {
      return objectMapper.readValue(data, type);
    } catch (JsonProcessingException e) {
      e.printStackTrace();
    }
    return null;
  }
}
