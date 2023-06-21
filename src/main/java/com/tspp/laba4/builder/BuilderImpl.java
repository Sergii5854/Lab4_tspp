package com.tspp.laba4.builder;

import java.util.List;

public class BuilderImpl implements Builder {

  private String title;
  private String lector;
  private List<Student> students;
  private List<Reference> literatureReferences;

  @Override
  public void setTitle(String title) {

  }

  @Override
  public void setLector(String lector) {

  }

  @Override
  public void setStudents(List<Student> students) {

  }

  @Override
  public void setLiteratureReferences(List<Student> literatureReferences) {

  }

  public Lecture getResult() {
    return new Lecture(title, lector, students, literatureReferences);
  }
}
