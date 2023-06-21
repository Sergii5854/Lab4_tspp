package com.tspp.laba4.composite;

public class Item implements OrderComponent {
  private final String name;
  private final Integer weight;
  private final Double price;

  public Item(String name, Integer weight, Double price) {
    this.name = name;
    this.weight = weight;
    this.price = price;
  }

  public String getName() {
    return name;
  }

  @Override
  public int getWeight() {
    return weight;
  }

  @Override
  public double getPrice() {
    return price;
  }
}
