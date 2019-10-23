package com.exemple.animals.monkey;

import com.exemple.animals.Animals;

public class Capuchin extends Animals {

  public Capuchin(String name, int age, String habitat, String type) {
    super(name, age, habitat, type);
  }

  @Override
  public void say() {
    System.out.println("Capuchin " + getName() + " sad uua-a-a-a");
  }

}
