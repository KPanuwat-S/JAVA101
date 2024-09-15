package fundamentals;

import java.text.MessageFormat;

public class Conditions {
    public static void main(String[] args) {
//        check();

        switchExpression("Monday");
    }

    public static void condition(Integer number) {
        int num = number;
        if (num > 5) {
            System.out.println(MessageFormat.format("Hi {0}", num));
        }
    }

    public static void check() {
        condition(890);
    }

    public static void switchExpression(String day) {

//        String result = switch (dayFormatted) {
//            case "monday", "tusedat" -> "weekday";
//            case "saturday", "sunday" -> "weekend";
//
//            default -> "N/A";
//        };

        int[] intArray = new int[]{1, 2, 3, 4, 5};


        System.out.println(intArray);
    }

}
