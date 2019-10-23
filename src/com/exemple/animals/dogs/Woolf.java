package com.exemple.animals.dogs;

import com.exemple.animals.Animals;

public class Woolf extends Animals {

  public Woolf(String name, int age, String habitat, String type) {
    super(name, age, habitat, type);
    
  }

  @Override
  public void say() {
    System.out.println("Woolf " + getName() + " sad aauuuu");

  }

}
