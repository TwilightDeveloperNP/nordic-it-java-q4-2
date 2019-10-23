package com.exemple.animals.monkey;

import com.exemple.animals.Animals;

public class Marmoset extends Animals {

  public Marmoset(String name, int age, String habitat, String type) {
    super(name, age, habitat,type);
  }

  @Override
  public void say() {
    System.out.println("Marmoset " + getName() + " sad aa-i-i-i-i");
  }

}
