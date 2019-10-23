package com.exemple.animals;

public abstract class Animals {

  private String name;
  private int age;
  private String habitat;
  private String type;

  public Animals(String name, int age, String habitat, String type) {
    this.name = name;
    this.age = age;
    this.habitat = habitat;
    this.type = type;
  }

  public String getType() {
    return type;
  }

  public void setType(String type) {
    this.type = type;
  }

  public String getHabitat() {
    return habitat;
  }

  public void setHabitat(String habitat) {
    this.habitat = habitat;
  }

  public int getAge() {
    return age;
  }

  public void setAge(int age) {
    this.age = age;
  }


  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public abstract void say();

}
