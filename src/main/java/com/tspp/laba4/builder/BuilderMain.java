package com.tspp.laba4.builder;

public class BuilderMain {

  public static void main(String[] args) {

    Director director = new Director();
    BuilderImpl builder = new BuilderImpl();
    director.constructLecture(builder);
    Lecture lecture = builder.getResult();

  }

}
