package ru.mtuci.homework;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class Calculator {

  public static void main(String[] args) throws IOException {
    Calculator calculator = new Calculator();

    BufferedReader consoleReader = new BufferedReader(new InputStreamReader(System.in));

    System.out.println("Введите 1 число");
    String aValue = consoleReader.readLine();
    double a = Double.parseDouble(aValue);

    System.out.println("Введите второе число");
    String bValue = consoleReader.readLine();
    double b = Double.parseDouble(bValue);

    System.out.println("Введите операцию:");
    String operation = consoleReader.readLine();

    if ("+".equals(operation)) {
      System.out.println("Результат: " + calculator.sum(a, b));
    } else if ("-".equals(operation)) {
      System.out.println("Результат: " + calculator.subtract(a, b));
    }
    if ("*".equals(operation)) {
      System.out.println("Результат: " + calculator.multiply(a, b));
    } else if ("/".equals(operation)) {
      System.out.println("Результат: " + calculator.divide(a, b));
    }
  }


  private double sum(double a, double b) {
    return a + b;
  }

  private double subtract(double a, double b) {
    return a - b;
  }

  private double multiply(double a, double b) {
    return a * b;
  }

  private double divide(double a, double b) {
    return a / b;
  }
}
