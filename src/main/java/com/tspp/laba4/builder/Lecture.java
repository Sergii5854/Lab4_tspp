package com.tspp.laba4.builder;

import java.util.List;

public class Lecture {

  String title;
  String lector;
  List<Student> students;
  List<Reference> literatureReferences;

  public Lecture(
      String title,
      String lector,
      List<Student> students,
      List<Reference> literatureReferences
  ) {
    this.lector = lector;
    this.title = title;
    this.students = students;
    this.literatureReferences = literatureReferences;
  }

  public String getTitle() {
    return title;
  }

  public String getLector() {
    return lector;
  }

  public List<Student> getStudents() {
    return students;
  }

  public List<Reference> getLiteratureReferences() {
    return literatureReferences;
  }

}
