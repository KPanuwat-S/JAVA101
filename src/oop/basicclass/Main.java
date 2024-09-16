package oop.basicclass;

public class Main {

  public static void main(String[] args) {
    Car car = new Car();

    car.setColor(ColorOfCar.RED);
    System.out.printf("Color of car : %s", car.color);
  }
}
