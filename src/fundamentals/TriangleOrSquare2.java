package fundamentals;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

class TriangleAreaStrategy implements AreaStrategy {
  @Override
  public double calculateArea(int base, int height) {
    return 0.5 * base * height;
  }
}

class SquareOrRectangleStrategy implements AreaStrategy {
  @Override
  public double calculateArea(int base, int height) {
    return base * height;
  }
}

public class TriangleOrSquare2 {
  private AreaStrategy strategy;
  private static final Map<String, AreaStrategy> STRATEGIES = new HashMap<>();

  static {
    STRATEGIES.put("T", new TriangleAreaStrategy());
    STRATEGIES.put("S", new SquareOrRectangleStrategy());
  }

  public boolean setAreaStrategy(String key) {
    this.strategy = STRATEGIES.get(key);

    return this.strategy != null;
  }

  public double executeStrategy(int base, int height) {
    if (strategy == null) {
      System.out.println("Strategy is not set.");
    }

    return strategy.calculateArea(base, height);
  }

  public static void main(String[] args) {
    TriangleOrSquare2 areaCalculator = new TriangleOrSquare2();

    Scanner scanner = new Scanner(System.in);
    System.out.println("Enter Type : ");

    String type = scanner.nextLine().trim().toUpperCase();

    if (!areaCalculator.setAreaStrategy(type)) {
      System.out.println("Invalid Type");

      return;
    }

    System.out.println("Enter Base : ");
    int base = Integer.parseInt(scanner.nextLine());

    System.out.println("Enter Height : ");
    int height = Integer.parseInt(scanner.nextLine());

    double area = areaCalculator.executeStrategy(base, height);
    System.out.printf("Area : %.2f%n", area);
  }
}
