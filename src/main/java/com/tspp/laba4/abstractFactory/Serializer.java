package com.tspp.laba4.abstractFactory;

import com.fasterxml.jackson.core.JsonProcessingException;

public interface Serializer {
  String serialize(Object object) throws JsonProcessingException;
}
