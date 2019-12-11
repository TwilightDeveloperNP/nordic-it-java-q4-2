package com.exemple.factory;

import java.util.ArrayList;

public class CatFactory {

  public static void main(String[] args) throws InterruptedException {
    var array = new ArrayList<Thread>();
    for (var i = 0; i != 20; i++) {
      var thread1 = new Thread(new Runnable() {
        public void run() {
          System.out.println("First cat is not hungry");
        }
      });

      var thread2 = new Thread(new Runnable() {
        public void run() {
          System.out.println("Second cat is not hungry");
        }
      });

      var thread3 = new Thread(new Runnable() {
        public void run() {
          System.out.println("Thrid cat is not hungry");
        }
      });

      var thread4 = new Thread(new Runnable() {
        public void run() {
          System.out.println("Fourth cat is not hungry");
        }
      });

      var thread5 = new Thread(new Runnable() {
        public void run() {
          System.out.println("Fifth cat is not hungry");
        }
      });
      var thread6 = new Thread(new Runnable() {
        public void run() {
          System.out.println("All cats are not hungry");
        }
      });
      array.add(thread6);
      thread1.start();// Происходит кормежка кошек 1 и 2
      thread2.start();
      thread1.join();// Ожидание завершения кормежки кошек 1 и 2
      thread2.join();

      thread3.start();// Происходит кормежка кошки 3
      thread3.join();// Ожидание завершения кормежки кошки 3

      thread4.start();// Происходит кормежка кошек 4 и 5
      thread5.start();
      thread4.join();// Ожидание завершения кормеки кошек 4 и 5
      thread5.join();

      thread6.start();// Уборка после кормежки
      
      System.out.println("N");
    }
    
    for (var elem : array) {
      elem.join();
    }
    
  }

}
