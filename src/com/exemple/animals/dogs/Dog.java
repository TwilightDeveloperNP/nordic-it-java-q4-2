package com.exemple.animals.dogs;

import com.exemple.animals.Animals;

public class Dog extends Animals {

  public Dog(String name, int age, String habitat, String type) {
    super(name, age, habitat, type);
    // TODO Auto-generated constructor stub
  }

  @Override
  public void say() {
    System.out.println("Dog " + getName() + " sad woff");

  }

}
