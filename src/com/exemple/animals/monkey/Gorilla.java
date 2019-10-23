package com.exemple.animals.monkey;

import com.exemple.animals.Animals;

public class Gorilla extends Animals {

  public Gorilla(String name, int age, String habitat, String type) {
    super(name, age, habitat, type);
   
  }

  @Override
  public void say() {
    System.out.println("Gorilla " + getName() + " sad U-u-u-u-u");
  }

}
