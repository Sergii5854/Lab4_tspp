package com.tspp.laba4.strategy;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Random;

public class ChooseRandomStudent implements ChooseStrategy {

  @Override
  public String choose(Map<String, Boolean> students) {
    List<String> keyList = new ArrayList<>(students.keySet());

    int size = keyList.size();
    int randIdx = new Random().nextInt(size);
    String student = keyList.get(randIdx);

    students.remove(student);
    students.put(student, true);

    return student;
  }

}
