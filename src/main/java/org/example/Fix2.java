package org.example;

public class Fix2 {

    public static void method1() {
        int[] intArray = {1, 3, 4, 8, 7, 6, 10, 2, 11};
        try {
            int d = 0;
            double catchedRes1 = intArray[8] / d;
            System.out.println("catchedRes1 = " + catchedRes1);
        } catch (ClassCastException ex) {
            System.out.println("Ошибка приведения типов");
        } catch (ArithmeticException e) {
            System.out.println("Catching exception: " + e);
        }
    }


}
