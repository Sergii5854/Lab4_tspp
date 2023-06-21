package com.tspp.laba4.builder;

import java.util.ArrayList;

public class Director {

  public void constructLecture(Builder builder) {
    builder.setTitle("Lecture");
    builder.setLector("Lector");
    builder.setStudents(new ArrayList<>());
    builder.setLiteratureReferences(new ArrayList<>());
  }
}
