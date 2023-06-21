package com.tspp.laba4.strategy;

public class StrategyMain {
  public static void main(String[] args){
    Group group = new Group();
    System.out.println("Random: " + group.choose(new ChooseRandomStudent()));
    System.out.println("Random: " + group.choose(new ChooseRandomStudent()));

    System.out.println("NotAnswered: " + group.choose(new ChooseNotAnsweredStudent()));
    System.out.println("NotAnswered: " + group.choose(new ChooseNotAnsweredStudent()));
    System.out.println("NotAnswered: " + group.choose(new ChooseNotAnsweredStudent()));
    System.out.println("NotAnswered: " + group.choose(new ChooseNotAnsweredStudent()));

    System.out.println("Random: " + group.choose(new ChooseRandomStudent()));
    System.out.println("Random: " + group.choose(new ChooseRandomStudent()));
  }
}
