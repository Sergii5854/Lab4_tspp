package com.tspp.laba4.abstractFactory;

public class AbstractFactoryMain {
  public static void main(String[] args) {
    JSONSerializer jsonSerializer = new JSONSerializer();
    JSONDeserializer jsonDeserializer = new JSONDeserializer();
    Person person = new Person("John", 25);

    String personJson = jsonSerializer.serialize(person);
    System.out.println("JSON: " + personJson);

    Person personDeserialize = jsonDeserializer.deserialize(personJson, Person.class);
    System.out.println(personDeserialize.toString());
  }
}
