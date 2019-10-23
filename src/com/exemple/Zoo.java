package com.exemple;

import com.exemple.animals.cats.Cat;
import com.exemple.animals.cats.Tiger;
import com.exemple.animals.dogs.Dog;
import com.exemple.animals.dogs.Woolf;
import com.exemple.animals.monkey.Capuchin;
import com.exemple.animals.monkey.Gorilla;
import com.exemple.animals.monkey.Marmoset;

public class Zoo {

  public static void main(String[] args) {
    var cat = new Cat("Paladin", 3, "Home", "Pet");
    cat.say();
    System.out.println("Cat age is " + cat.getAge());
    System.out.println("Cat habitat is " + cat.getHabitat());
    System.out.println("Cat type is " + cat.getType());

    var dog = new Dog("Knight", 4, "Yard", "Pet");
    dog.say();
    System.out.println("Dog age is " + dog.getAge());
    System.out.println("Dog habitat is " + dog.getHabitat());
    System.out.println("Dog type is " + dog.getType());

    var tiger = new Tiger("Samurai", 5, "Forest", "Wild");
    tiger.say();
    System.out.println("Tiger age is " + tiger.getAge());
    System.out.println("Tiger habitat is " + tiger.getHabitat());
    System.out.println("Tiger type is " + tiger.getType());

    var woolf = new Woolf("Hunter", 7, "Forest", "Woolf");
    woolf.say();
    System.out.println("Woolf age is " + woolf.getAge());
    System.out.println("Woolf habitat is " + woolf.getHabitat());
    System.out.println("Woolf type is " + woolf.getType());

    var gorilla = new Gorilla("Kong", 25, "Jungle", "Wild");
    gorilla.say();
    System.out.println("Gorilla age is " + gorilla.getAge());
    System.out.println("Gorilla habitat is " + gorilla.getHabitat());
    System.out.println("Gorilla type is " + gorilla.getType());

    var capuchin = new Capuchin("Mowgli", 3, "Jungle", "Wild");
    capuchin.say();
    System.out.println("Monkey age is " + capuchin.getAge());
    System.out.println("Monkey habitat is " + capuchin.getHabitat());
    System.out.println("Capuchin type is " + capuchin.getType());

    var marmoset = new Marmoset("David", 1, "Jungle", "Wild");
    marmoset.say();
    System.out.println("David age is " + marmoset.getAge());
    System.out.println("David habitat is " + marmoset.getHabitat());
    System.out.println("Marmoset type is " + marmoset.getType());
  }

}
