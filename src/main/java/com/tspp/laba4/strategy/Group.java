package com.tspp.laba4.strategy;

import java.util.HashMap;
import java.util.Map;

public class Group {

  private Map<String, Boolean> students = new HashMap<>() {
    {
      put("Ivan", false);
      put("Petr", false);
      put("Sergey", false);
      put("Alexey", false);
      put("Vladislav", false);
    }
  };

  public String choose(ChooseStrategy strategy) {
    return strategy.choose(students);
  }

}
