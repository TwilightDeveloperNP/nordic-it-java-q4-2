package com.exemple.animals.cats;

import com.exemple.animals.Animals;

public class Tiger extends Animals {

  public Tiger(String name, int age,String habitat, String type) {
    super(name, age, habitat, type);
    // TODO Auto-generated constructor stub
  }

  @Override
  public void say() {
    System.out.println("Tiger " + getName() + " sad raaarrr");

  }

}
