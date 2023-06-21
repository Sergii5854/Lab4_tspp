package com.tspp.laba4.abstractFactory;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

public class JSONSerializer implements Serializer {

  ObjectMapper obj = new ObjectMapper();

  @Override
  public String serialize(Object object) {
    try {
      return obj.writeValueAsString(object);
    } catch (JsonProcessingException e) {
      e.printStackTrace();
    }
    return null;
  }
}
