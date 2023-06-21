package com.tspp.laba4.composite;

import java.util.ArrayList;
import java.util.List;

public class Order implements OrderComponent {
  private List<OrderComponent> components;

  public Order() {
    components = new ArrayList<>();
  }

  void addItem(Item item) {
    if (getWeight() + item.getWeight() > 20 || getPrice() + item.getPrice() > 10000) {
      System.out.println("Cannot add item. Exceeds weight or total price limit.");
      return;
    }
    components.add(item);
  }

  @Override
  public int getWeight() {
    int weight = 0;
    for (OrderComponent component : components) {
      weight += component.getWeight();
    }
    return weight;
  }

  @Override
  public double getPrice() {
    double totalPrice = 0;
    for (OrderComponent component : components) {
      totalPrice += component.getPrice();
    }
    return totalPrice;
  }
}
