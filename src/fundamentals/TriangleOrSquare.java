package fundamentals;

import java.util.Scanner;

public class TriangleOrSquare {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    System.out.println("Enter Type : ");
    String choice = scanner.nextLine();

    System.out.println("Enter Base :");
    int base = Integer.parseInt(scanner.nextLine());

    System.out.println("Enter Height :");
    int height = Integer.parseInt(scanner.nextLine());
    double area = 0;

    if (choice.equals("T")) {

      area = (0.5) * base * height;

      System.out.printf("Result : " + area);
    } else if (choice.equals("S")) {

      area = base * height;
      System.out.printf("Result : " + area);
    } else {
      System.out.println("Invalid Choice");
    }
  }
}
