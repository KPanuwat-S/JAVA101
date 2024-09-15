package fundamentals;

import java.util.Scanner;

public class AverageNumber {
  public static void main(String[] args) {
    factorial();
  }

  public static void averageCalc(String[] args) {
    Scanner scanner = new Scanner(System.in);
    double sum = 0;
    int n = 3;

    try {
      for (int i = 0; n < 3; i++) {
        System.out.print("Input : ");
        double input = Double.parseDouble(scanner.nextLine());
        sum += input;
      }
      double avg = sum / n;
      System.out.println("Average Number : " + avg);
    } catch (NumberFormatException error) {

      System.out.println(error);

    } finally {
      scanner.close();
    }
  }

  public static void factorial() {
    Scanner scanner = new Scanner(System.in);
    System.out.println("Enter Input : ");
    String input = scanner.nextLine();

    int number = Integer.parseInt(input);

    try {
      if (number < 0) {
        System.out.println("Error : input must be positive number.");
      } else {
        int result = calFactorial(number);

        System.out.printf("Result : %d", result);
      }
    } catch (NumberFormatException e) {
      System.out.printf("Error : %s", e);
    }
  }

  public static int calFactorial(int input) {
    if (input <= 1) {
      System.out.printf("Result : %d%n", input);
    }

    int result = 1;
    for (int multiplier = 2; multiplier <= input; multiplier++) {
      result *= multiplier;
    }

    return result;
  }
}
