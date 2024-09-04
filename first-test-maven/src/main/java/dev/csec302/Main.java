package dev.csec302;

public class Main {
    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        System.out.println("1 + 2 = " + calculator.add(1, 2));
        System.out.println("1 - 2 = " + calculator.subtract(1, 2));
        System.out.println("1 * 2 = " + calculator.multiply(1, 2));
        System.out.println("1 / 2 = " + calculator.divide(1, 2));
        try {
            System.out.println("1 / 0 = " + calculator.divide(1, 0));
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }
    }
}