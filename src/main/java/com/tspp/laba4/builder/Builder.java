package com.tspp.laba4.builder;

import java.util.List;

public interface Builder {

  void setTitle(String title);

  void setLector(String lector);

  void setStudents(List<Student> students);

  void setLiteratureReferences(List<Student> literatureReferences);

}
