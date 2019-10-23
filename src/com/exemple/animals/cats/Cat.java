package com.exemple.animals.cats;

import com.exemple.animals.Animals;

public class Cat extends Animals {

  public Cat(String name, int age, String habitat, String type) {
    super(name, age, habitat, type);
  }

  @Override
  public void say() {
    System.out.println("Cat " + getName() + " sad meow");
  }

}
