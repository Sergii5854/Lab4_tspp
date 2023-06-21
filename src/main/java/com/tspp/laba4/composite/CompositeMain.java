package com.tspp.laba4.composite;

public class CompositeMain {
  public static void main(String[] args) {
    Order order = new Order();

    Item item1 = new Item("Item 1", 5, 2000.0);
    Item item2 = new Item("Item 2", 10, 5000.0);
    Item item3 = new Item("Item 3", 7, 4000.0);

    order.addItem(item1);
    order.addItem(item2);
    order.addItem(item3);

    System.out.println("Total Weight: " + order.getWeight() + " kg");
    System.out.println("Total Price: " + order.getPrice() + " UAH");
  }
}
