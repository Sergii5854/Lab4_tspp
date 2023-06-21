package com.tspp.laba4.strategy;

import java.util.Map;

public class ChooseNotAnsweredStudent implements ChooseStrategy {

  @Override
  public String choose(Map<String, Boolean> students) {
    for (var student : students.entrySet()) {
      String studentName = student.getKey();

      if (!student.getValue()) {
        students.remove(studentName);
        students.put(studentName, true);
        return studentName;
      }
    }

    return "All students answered";
  }

}
